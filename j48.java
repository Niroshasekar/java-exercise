package ex48;
import java.util.*;
/**
 *
 * @author nirosha
 */
public class Ex48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Value=");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
    
}