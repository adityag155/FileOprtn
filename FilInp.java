import java.io.*;
class FilInp
{
public static void main(String args[])
{
FileInputStream fis=null;
try
{
fis=new FileInputStream("Adu.txt");
int b;
while((b=fis.read())!=-1)
{
System.out.print((char)b);
//System.out.println((char)b);			//if we use println then o/p come in coloumn 
}
fis.close();
}
catch (IOException e)
{
System.out.println("Error reading file: " + e.getMessage());
}
}
}           