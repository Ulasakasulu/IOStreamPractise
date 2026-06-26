import java.io.CharArrayWriter;
/**
 * @author Kasulu
 * @since 25-06-2026
 */
public class CharArrayWriterExample {
    public static void main(String[] args) 
    {
        try (CharArrayWriter c=new CharArrayWriter())
        {
            c.write("This Char array writer");
           String s= c.toString();
           System.out.println(s);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
