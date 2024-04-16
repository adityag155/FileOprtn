import java.io.*;
class FileCopy
{
public static void main(String args[])
{
String sourceFlepath="Adu.txt";
String destFilepath="Adi.txt";

try
(
FileInputStream fis=new FileInputStream(sourceFlepath);
FileOutputStream fos=new FileOutputStream(destFilepath);
){
int i;
while((i=fis.read())!=-1)
{
fos.write(i);
}
fis.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}