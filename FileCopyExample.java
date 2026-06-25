import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Kasulu
 */
public class FileCopyExample {
    public static void main(String[] args) {
        try ( FileInputStream dis=new FileInputStream("D:\\memory card\\-6123122256302419666_121.jpg");
              FileOutputStream fos=new FileOutputStream("D:/FileCopying.jpg")  )
        {
          byte b[]= dis.readAllBytes(); 
            fos.write(b);
            System.out.println("File written Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
