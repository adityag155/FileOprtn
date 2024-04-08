import java.io.*;
class FileInfo
{
public static void main(String args[])
{
File f=new File("C:\\Aditya\\JavaKiran\\Adu.txt");

if(f.exists())
{
System.out.println("File Name:"+f.getName());
System.out.println("File Location:"+f.getAbsolutePath());
System.out.println("File Writtable:"+f.canWrite());
System.out.println("File Readable:"+f.canRead());
System.out.println("File Size:"+f.length());
//System.out.println("File Remove:"+f.delete());		//To delete file
}
else
{
System.out.println("File Doesn't exist");
}
}
}

/*
O/P:
File Name:Adu.txt
File Location:C:\Aditya\JavaKiran\Adu.txt
File Writtable:true
File Readable:true
File Size:0					//Anything write in file the size wll changed
*/