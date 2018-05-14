
package Interface_Uebungen;

public class Kreis 
implements Geo
{
    private double radius;
    
    private static final double PI = 3.141596;
    
    public Kreis()
    {}
    
    public Kreis(double radius)
    {
        this.radius = radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    
    @Override
    public double getFlaeche()
    {
        return PI*radius*radius;
    }
    @Override
    public String toString()
    {
       return String.format("Radius: %.2f Flaeche: %.5f", radius, getFlaeche());
    }
}
