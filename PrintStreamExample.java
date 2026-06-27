import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author Kasulu
 * @since 27-06-2026
 * @version 1.0
 * 
 */

class Student1
{
    int rollNo;
    String name;
    String dept;
}
public class PrintStreamExample {
  //  /* 
    public static void main(String[] args) {
       try ( FileOutputStream fos=new FileOutputStream("D:/PrintStreamExample.txt");
          //   PrintStream ps=new PrintStream(fos)
          PrintWriter pw=new PrintWriter(new OutputStreamWriter(fos))) 
       {
            Student1 s=new Student1();
            s.rollNo=309;
            s.name="Kasulu";
            s.dept="Mechanical";
            pw.println(s.rollNo);
            pw.println(s.name);
            pw.println(s.dept);
            System.out.println("File created Successfully");
       } catch (Exception e) 
       {
        e.printStackTrace();
       }
    }
    //   */
    /*
    public static void main(String[] args) 
    {
        try (FileInputStream fis=new FileInputStream("D:/PrintStreamExample.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fis)) ) 
        {
            Student1 s=new Student1();
            s.rollNo=Integer.parseInt(br.readLine());
            s.name=br.readLine();
            s.dept=br.readLine();
            System.out.println("RollNumber : "+s.rollNo);
            System.out.println("Name : "+s.name);
            System.out.println("Department : "+s.dept);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     */
}
