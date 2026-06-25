import java.io.CharArrayReader;

/**
 * @author Kasulu
 * @since 25-06-2026
 */
public class CharArrayReaderExample {
    public static void main(String[] args) {
        char c[]={'J','a','v','a'};
        try (CharArrayReader car=new CharArrayReader(c)) 
        {
            String str=car.readAllAsString();
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
