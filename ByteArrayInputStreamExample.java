import java.io.ByteArrayInputStream;

/**
 * @author Kasulu
 * @since 25-06-2026
 */
public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte b[]={'a','b','c','d'};
        try (ByteArrayInputStream bai=new ByteArrayInputStream(b)) 
        {
            // Logic 1
            /* 
            byte bytes[]=bai.readAllBytes();
            for (byte c : bytes) {
                System.out.print((char)c);
            }
            */
           //Logic 2
           String str=new String(bai.readNBytes(b.length));
           System.out.print(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
