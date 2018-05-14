
package Interface_Uebungen;

public class Rechteck 
implements Geo
{
    private double breite;
    private double hoehe;
    
    public Rechteck()
    {}
    
    public Rechteck (double breite, double hoehe)
    {
        this.breite = breite;
        this.hoehe  = hoehe;
    }
    
    public void setBreite(double breite)
    {
        this.breite = breite;
    }
    public void setHoehe(double hoehe)
    {
        this.hoehe = hoehe;
    }
    public double getBreite()
    {
        return breite;
    }
    public double getHoehe()
    {
        return hoehe;
    }
    
    @Override
    public double getFlaeche()
    {
        return breite*hoehe;
    }
    @Override
    public String toString()
    {
        return String.format("Breite: %.2f Hoehe: %.2f Flaeche: %.5f", breite, hoehe, getFlaeche());
    }
}
 