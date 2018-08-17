package ex65;
import java.util.*;
/**
 *
 * @author nirosha
 */
public class Ex65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the A value= ");
        int a = in.nextInt();  
		System.out.print("Enter the B value= ");
		int b = in.nextInt(); 
		int divided = a / b;
		int remainder = a - (divided * b);
		System.out.println(remainder); 
    }
    
}