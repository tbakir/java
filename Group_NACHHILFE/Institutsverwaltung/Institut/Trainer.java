
package Institut;

public class Trainer 
extends Personen
{
    // Attribute
    private double honorar;
    private String [] themen;
    
    // Konstruktoren
    public Trainer()
    {}
    
    public Trainer(String name, String vorname, String adresse, double honorar, String [] themen)
    {
        super(name, vorname, adresse);
        this.honorar = honorar;
        this.themen  = themen;
    }
    
    // Akzessoren
    // Getter
    public double getHonorar()
    {
        return honorar;
    }
    public String [] getThemen()
    {
        return themen;
    }
    // Setter
    public void setHonorar(double honorar)
    {
        this.honorar = honorar;
    }
    public void setThemen(String [] themen)
    {
        this.themen = themen;
    }
    
    // Weitere Methoden
    @Override
    public String toString()
    {
        String th = "";
        
        for (String s: themen)
            th = th + s + " ";
        
        return super.toString() + String.format(" %.2f %s", honorar, th);
        
    }
    // Nur voruebergehend
    @Override
    public double getGehalt()
    {
        return 0.0;
    }
}
