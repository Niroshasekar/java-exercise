package ex39;

/**
 *
 * @author nirosha
 */
public class Ex39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereint 
        int i,j,k,tot=0;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                for(k=1;k<=4;k++)
                {
                    if(i!=k&&k!=j&&i!=j)
                    {
                        tot++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println(tot);
    }
    
}