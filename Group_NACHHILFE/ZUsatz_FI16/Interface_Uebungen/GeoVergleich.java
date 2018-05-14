
package Interface_Uebungen;


public class GeoVergleich 
{
    public static int vergleiche(Geo a, Geo b)
    {
        final double EPSILON = 0.0001;
        
        double x = a.getFlaeche();
        double y = b.getFlaeche();
        
        if (x <= y - EPSILON)
            return -1;
        else if (x >= y + EPSILON)
            return 1;
        else 
            return 0;
        
    }
}
