
package zusatz_fi16_1;

public class Maxima_1 
{
    public Maxima_1()
    { System.out.println("Konstruktor Maxima_1");}
    
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
