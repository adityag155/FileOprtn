import java.io.*;
class BuffrdOp
{
public static void main(String args[])throws IOException
{

FileOutputStream fos=new FileOutputStream("C:\\Aditya\\JavaKiran\\Adu.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos);

String s="Welcome to java program";
byte b[]=s.getBytes();
bos.write(b);
bos.flush();
bos.close();
fos.close();
System.out.println("Written in file successfully");
}
}