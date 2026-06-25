import java.io.FileWriter;

/**
 * @author Kasulu
 */
public class FileWriteExample {
    public static void main(String[] args) {
        try (FileWriter fw=new FileWriter("D:/FileWriteExample.txt")) 
        {
            fw.write("Hello Everyone,this file created using File Writer");
            System.out.println("File is created");
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
