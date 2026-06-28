//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Kasulu
 * @since 26-06-2026
 * @version 1.0
 *
 */
public class BufferedInputStreamPractise {
    public static void main(String[] args) 
    {
        try (FileInputStream fis=new FileInputStream("D:/FileOutputStreamExample.txt");
             BufferedReader br=new BufferedReader(new InputStreamReader(fis))  ) 
        {
            // System.out.println(br.readAllAsString());
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            br.mark(2);
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            br.reset();
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            System.out.print((char)br.read());
            System.out.println(br.readLine());
        

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
