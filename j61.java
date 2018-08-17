package ex61;

/**
 *
 * @author nirosha
 */
public class Ex61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="RIT";
        char[] ch=name.toCharArray();
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }
    }
    
}