
package zusatz_fi16;

/**
 *
 * @author dscheringer
 */
public class Maxima 
{
    Maxima()
    { System.out.println("Konstruktor Maxima");}
    
    public int maximum_ermitteln(int [] x)
    {
        int vmax = x[0];                    /* Vorlaeufiges Maximum */
        
        for (int i=1; i < x.length; i++)
        {
            if (vmax < x[i])
                vmax = x[i];                /* Neues vorlaeufiges Maximum */
        }
        
        return vmax;
    }
}
