import java.io.RandomAccessFile;

/**
 * @author Kasulu
 * @since 26-06-2026
 * @version 1.0
 */
public class RandomAccessFileExample {
    public static void main(String[] args) {

      //text=ABCDEFGHIJKL
       try (RandomAccessFile raf=new RandomAccessFile("D:/RandomAccessFile.txt", "rw"))
       {
            // raf.write('a');
           System.out.println((char)raf.read());
           System.out.println((char)raf.read());
           System.out.println((char)raf.read());
           System.out.println((char)raf.read());
           raf.write('e');
           System.out.println((char)raf.read());
           raf.skipBytes(3);
           System.out.println((char)raf.read());
           raf.seek(0);
           System.out.println((char)raf.read());
           System.out.println(raf.getFilePointer()+":"+(char)raf.read());
       } catch (Exception e) 
       {
         e.printStackTrace();
       } 
    }
}
