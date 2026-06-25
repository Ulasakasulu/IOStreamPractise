import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * @author Kasulu
 * @since 25-06-2026
 */
public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try (ByteArrayOutputStream bao=new ByteArrayOutputStream(20)) 
        {
             bao.write('J');
             bao.write('a');
             bao.write('v');
             bao.write('a');

             //Logic 1
             //To Print in console
             /* 
             byte b[]=bao.toByteArray();
             for (byte c : b) {
               System.out.print((char)c); 
             }
            */
           // Logic 2
           // To Write in a file
             bao.writeTo(new FileOutputStream("D:/ByteArrayOutputStreamExample.txt"));
             System.out.println("File Written Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
