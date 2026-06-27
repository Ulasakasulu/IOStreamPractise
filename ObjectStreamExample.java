import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Kasulu
 * @since 27-06-2026
 * @version 1.0
 */
class Student3 implements Serializable
{
    static final long serialVersionUid=1L;
    private String company;
    private String name;
    private String specilisation;
    static long data=10;

    public Student3()
    {
    }
    public Student3(String c,String n,String sp)
    {
        name=n;
        company=c;
        specilisation=sp;
        data=500;
    }
public String toString()
{
    return "My Details are as follows \n"
            +"Name : "+name+"\n"
            +"Company : "+company+"\n"
            +"Specilization : "+specilisation+"\n"
            +"Data : "+data;
}

}
public class ObjectStreamExample {
 /* 
    public static void main(String[] args) 
    {
        try (FileOutputStream fos=new FileOutputStream("D:/ObjectStreamExample.txt");
             ObjectOutputStream oos=new ObjectOutputStream(fos) ) 
        {
            Student3 s=new Student3("Tcs","Kasulu","Java Developer");
            // s.name="Kasulu";
            // s.company="TCS";
            // s.specilisation="Java Developer";
            oos.writeObject(s);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
 */

    public static void main(String[] args) 
    {
        
        try (FileInputStream fis=new FileInputStream("D:/ObjectStreamExample.txt");
             ObjectInputStream ois=new ObjectInputStream(fis) ) 
        {
            Student3 s=new Student3();
           
            s=(Student3)ois.readObject();
            System.out.println(s);
        } catch (Exception e) 
        {
           e.printStackTrace();
        }
    }
}
