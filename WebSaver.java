import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * @author Kasulu
 * @since 26-06-2026
 * @version 1.0
 * @implNote This program is for copying the internet webpages using IO Streams
 * 
 */
public class WebSaver {
    public static void main(String[] args) 
    {
        try
        {
        String web="https://www.interviewbit.com";
        String des="D:/webSaver.html";
        URI uri=URI.create(web);
        URL url=uri.toURL();
        InputStream i=url.openStream();
        FileOutputStream fos=new FileOutputStream(des);

        // Create a byte buffer to read chunks of data (typically 1KB to 4KB)
                byte[] buffer = new byte[4096];
                int bytesRead;

                // Read bytes from URL and write them directly into the file
                while ((bytesRead = i.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);

                }
        fos.close();
        i.close();
        System.out.println("File is created");
        
            }  
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
