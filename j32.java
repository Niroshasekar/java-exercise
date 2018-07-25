package ex32;
import java.util.*;

/**
 *
 * @author nirosha
 */
public class Ex32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        System.out.println("Enter the A and B value=");
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       if(a==b)
           System.out.println(a+"=="+b);
       if(a!=b)
           System.out.println(a+"!="+b);
       if(a<=b)
           System.out.println(a+"<="+b);
       if(a>=b)
           System.out.println(a+">="+b);
    }
    
}