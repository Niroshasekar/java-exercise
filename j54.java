package ex54;

/**
 *
 * @author nirosha
 */
public class Ex54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10,b=20,c=5;
        System.out.println("The Output is"+kar(a,b,c,true));
        
    }
    public static boolean kar(int x,int y,int z,boolean d)
    {
        if(d)
            return(z>x);
       return(y>x&&z>y); 
    }
    
}