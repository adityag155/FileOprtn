import java.io.*;
class FileWrite
{
public static void main(String args[])
{
try
{
FileWriter f=new FileWriter("C:\\Aditya\\JavaKiran\\Adu2.txt");
try
{
f.write("Java Programming is the best language");
}
finally
{
f.close();
}
System.out.println("Successfully write data in file");
}
catch(IOException i)
{
System.out.println(i);
}
}
}

//After excection the file name created in given location and also printed that message.