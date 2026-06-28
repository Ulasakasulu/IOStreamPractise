import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;
/**
 * @author Kasulu
 */
class Customer implements Serializable
{
    private static final long serialVersionUID = 1L;
    private  String custID;
    String name;
    private String mobile;
    
    public Customer()
    {

    }
    static int count=1;
    public Customer(String n,String m)
    {
        custID="C"+count;
        count++;
        name=n;
        mobile=m;
    }
    public String toString()
    {
        return "Customer Details \n"
               +"Customer id : "+custID+"\n"
               +"Name : "+name+"\n"
               +"Mobile Number : "+mobile;
    }
}
public class CustomerObjectStream {
    // public static void main(String[] args) {
    //     Customer c[]={new Customer("Kasulu","9848119320"),new Customer("Rakesh", "7288023000"),new Customer("Vinay", "7469548060")};
    //     try (FileOutputStream fos=new FileOutputStream("D:/CustomerObjectStream.txt");
    //         ObjectOutputStream oos=new ObjectOutputStream(fos))
    //     {
    //        int l=c.length;
    //       oos.writeInt(l);
    //     for (int i = 0; i < l; i++) 
    //     {
    //         oos.writeObject(c[i]);
    //     }
    //     } catch (Exception e) {
    //      e.printStackTrace();
    //     }
    // }
    public static void main(String[] args) {
        try (FileInputStream fis=new FileInputStream("D:/CustomerObjectStream.txt");
             ObjectInputStream ois=new ObjectInputStream(fis);
            Scanner sc=new Scanner(System.in) ) 
        {
         int length= ois.readInt();  
         Customer l[]=new Customer[length]; 
         for (int i = 0; i < length; i++) {
            l[i]=(Customer)ois.readObject();
         }
         System.out.println("Enter name");
         String n=sc.nextLine();
         boolean found=false;
         for (int i = 0; i < length; i++) {
            if(n.equalsIgnoreCase(l[i].name))
            {
                System.out.println(l[i]);
                  found=true;
                  break;
            }
          
         }
         // Print error only if no match was found after checking everyone
        if (!found) {
            System.out.println("Entered name is not matched");
        }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
