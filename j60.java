package ex60;
import java.util.*;
/**
 *
 * @author nirosha
 */
public class Ex60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
     System.out.print("Enter the Sentence= ");
	 String line = in.nextLine();
	 String[] words = line.split("[ ]+");
	 System.out.println(words[words.length - 2]);
    }
    
}