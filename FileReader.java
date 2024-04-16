import java.io.*;

class FileReader {
    public static void main(String args[]) {
        try {
            java.io.FileReader f = new java.io.FileReader("C:\\Aditya\\JavaKiran\\Adu2.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.println((char)i);
                }
            } finally {
                f.close();
            }
        } catch(IOException i) {
            System.out.println(i);
        }
    }
}
