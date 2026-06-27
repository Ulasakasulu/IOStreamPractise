import java.io.File;

/**
 * @author Kasulu
 * @since 27-06-2026
 * @version 1.0
 */
public class FileExample 
{
    public static void main(String[] args) 
    {
        try{
        File f=new File("D:/RandomAccessFile.txt");
        //f.createNewFile();
        System.out.println("can execute : "+f.canExecute());
        System.out.println(f.exists());
        f.setWritable(true);
        //System.out.println(f.setReadOnly());
        System.out.println("Writable : "+f.canWrite());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      
    }
}
