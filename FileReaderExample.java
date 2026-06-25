import java.io.FileReader;
import java.util.List;

/**
 * @author Kasulu
 */
public class FileReaderExample {
    public static void main(String[] args) {
        //Logic 1
      /* 
        try (FileReader fr=new FileReader("D:/FileOutputStreamExample.txt")) {
        String s=fr.readAllAsString();
        System.out.println(s);
       } catch (Exception e) {
            e.printStackTrace();
       } 
         */
        //Logic 2
    try (FileReader fr=new FileReader("D:/FileOutputStreamExample.txt")) {
        //System.out.println(fr.readAllLines() );
      List<String>s =fr.readAllLines();
      s.forEach(n->System.out.println(n));
      for (String str : s) {
        System.out.println(str);
      }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
