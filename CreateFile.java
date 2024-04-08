import java.io.*;
class CreateFile
{
public static void main(String args[])throws IOException
{
File f=new File("C:\\Aditya\\JavaKiran\\Adu.txt");
if(f.createNewFile())
{
System.out.println("File successfully created");
}
else
{
System.out.println("File already exist");
}
}
}