
/* Maximumermittlung, Variante 1: main()-Methode und Methode zur Berechnung
   des Maximums in einer Klasse */
package zusatz_fi16;

public class Zusatz_FI16 
{
    public static void main(String[] args)          /* Wichtig: static */
    {
        int [] arr = {12,7,21,45,3,17,34,80,91,55};
        
        int mmax;
        
        mmax = maximum_ermitteln(arr);
        
        System.out.println("Maximum = "+mmax);
    }
    public static int maximum_ermitteln(int [] x)   /* Wichtig: static */
    {
        int vmax = x[0];                    /* Vorlaeufiges Maximum */
        
        for (int i=1; i < x.length; i++)
        {
            if (vmax < x[i])
                vmax = x[i];                /* Neues vorlaeufiges Maximum */
        }
        
        return vmax;
    }

} /* Ende der Klasse Zusatz_FI16 */
