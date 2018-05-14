
package zusatz_fi16a;

public class Maxima_1 
{
    public Maxima_1()
    {
    }
    
    public int maximum_ermitteln_1(int [] x)
    {
        int vmax = x[0];
        
        for (int i=1; i < x.length; i++)
        {
            if (vmax < x[i])
                vmax = x[i];
        }
        
        return vmax;
    }
}


