import java.io.*;
class FileOp
{
public static void main(String args[])
{
FileOutputStream fis=null;
byte b1[]={'A','B'};
try
{
fis=new FileOutputStream("Adi.txt");
fis.write(b1);
System.out.println("Successfully written");
fis.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}