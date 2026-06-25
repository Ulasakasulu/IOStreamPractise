import java.io.FileInputStream;
/**
 * @author Kasulu
 */
public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis=new FileInputStream("D:/FileOutputStreamExample.txt")) 
        {
            //Logic 1
            /* 
            int x;
            while ((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }
            */
           //Logic 2
           /* 
           byte b[]=fis.readAllBytes();
           for (byte c : b) {
            System.out.print((char)c);
           }
            */
           //logic 3
           byte b[]=fis.readNBytes(fis.available());
           for (byte c : b) {
            System.out.print((char)c);
           }
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
