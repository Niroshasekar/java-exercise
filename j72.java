package ex72;

/**
 *
 * @author nirosha
 */
public class Ex72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "";    
	int len = str1.length();
	if(len >= 3)
		System.out.println( str1.substring(0, 3));
	else if(len == 1)
		System.out.println( (str1.charAt(0)+"##"));
	else
		System.out.println("###");
    }
    
}