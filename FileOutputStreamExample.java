import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileOutputStreamExample {
    public static void main(String[] args) 
    {
        try
        {
        FileOutputStream fos=new FileOutputStream("D:/FileOutputStreamExample.txt");
        String str="My First Io Stream Program";
        byte b[]=str.getBytes();
        //for (int i = 0; i < b.length; i++) 
       // {
            fos.write(b);
        //}
        fos.close();
            Path p=Paths.get("D:/FileOutputStreamExample.txt");
            Files.setAttribute(p,"dos:readonly",false); 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
