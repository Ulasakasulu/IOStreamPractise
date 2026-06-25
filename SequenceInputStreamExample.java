import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.SequenceInputStream;

/**
 * @author Kasulu
 * @see FileFileOutputStreamExample.java
 * @see FileWriteExample.java
 * @since 25-06-2026
 */
public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis1=new FileInputStream("D:/FileOutputStreamExample.txt");
             FileInputStream fis2=new FileInputStream("D:/FileWriteExample.txt");
             SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
             FileOutputStream fos=new FileOutputStream("D:/SequenceInputStreamExample.txt") ) 
        {
            byte b[]=sis.readAllBytes();
            fos.write(b);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
