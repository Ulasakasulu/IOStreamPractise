import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Kasulu
 * @since 28-06-2026
 * @version 1.0
 */
public class FloatStoringExample {
    public static void main(String[] args) {
       float f[]={1.2f,1.4f,1.6f,999.9f,202.01f};
       try (FileOutputStream fos=new FileOutputStream("D:/FloatData.txt");
            DataOutputStream dos=new DataOutputStream(fos) ) 
       {
        int l=f.length;
        dos.writeInt(l);
        for (float g : f) {
            dos.writeFloat(g);
        }
        System.out.println("File is created Successfully");
       } catch (Exception e) 
       {
       e.printStackTrace();
       } 

       try (FileInputStream fis=new FileInputStream("D:/FloatData.txt");
            DataInputStream dis=new DataInputStream(fis) ) 
       {
        int len=dis.readInt();
        for (int i = 0; i <len; i++) 
        {
            System.out.println(dis.readFloat());
        }
       } catch (Exception e) 
       {
        e.printStackTrace();
       }
    }
}
