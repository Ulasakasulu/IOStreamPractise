import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Kasulu
 * @since 27-06-2026
 * @version 1.0
 */
class Student2
{
    int roll;
    String name;
    String dept;

}
/**
 * @author Kasulu
 * @since 27-06-2026
 * @version 1.0
 */
public class DataStreamsExample {
    /*
    public static void main(String[] args) 
    {
        try (FileOutputStream fos=new FileOutputStream("D:/DataStreamsExample.txt");
             DataOutputStream dos=new DataOutputStream(fos) ) 
        {
           Student2 s=new Student2();
           s.roll=3;
           s.name="Kasulu";
           s.dept="Mechanical";
           dos.writeInt(s.roll);
           dos.writeUTF(s.name); 
           dos.writeUTF(s.dept);
           System.out.println("File is created successful");
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
     */

    public static void main(String[] args) {
        try (FileInputStream fis=new FileInputStream("D:/DataStreamsExample.txt");
            DataInputStream dis=new DataInputStream(fis) )
        {
            //Logic 1
            Student2 s=new Student2();
            s.roll=dis.readInt();
            s.name=dis.readUTF();
            s.dept=dis.readUTF();
            System.out.println(s.roll);
            System.out.println(s.name);
            System.out.println(s.dept);
            //Logic 2
            /* 
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            */
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
