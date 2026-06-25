import java.io.FileOutputStream;

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
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
