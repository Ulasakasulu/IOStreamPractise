import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author kasulu
 * @since 26-06-2026
 * @version 1.0
 * PipedStreamExample
 */
class Producer extends Thread
{
    OutputStream os;
    public Producer(OutputStream o)
    {
        os=o;
    }
    public void run()
    {
        int count=1;
        try
        {
        while (true) 
        {
           os.write(count); 
           os.flush();
           System.out.println("Producer : "+count);
           System.out.flush();
            Thread.sleep(10);
           count++;

        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}

class Consumer extends Thread
{
    InputStream is;

    public Consumer(InputStream is)
    {
        this.is=is;
    }
    public void run()
    {
        int x;
        try 
        {
             while (true) 
            {
            x=is.read();
            System.out.println("Consumer : "+x);
            System.out.flush();
             Thread.sleep(10);
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
public class PipedStreamExample {
    public static void main(String[] args) 
    {
        try{
        PipedOutputStream pos=new PipedOutputStream();
        PipedInputStream pis=new PipedInputStream();
        // Connect the both the pipes for the data processing
        pos.connect(pis);
        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);
        p.start();
        c.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
