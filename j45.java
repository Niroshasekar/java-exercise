package ex45;
import java.util.*;
import java.io.File;
/**
 *
 * @author nirosha
 */
public class Ex45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("/Desktop/User/niro.txt  : " + new File("niro.txt").length() + " bytes");
  System.out.println("/Desktop/User/nirosha.txt : " + new File("nirosha.txt").length() + " bytes");
    }
    
}