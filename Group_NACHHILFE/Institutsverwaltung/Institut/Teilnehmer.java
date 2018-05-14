
package Institut;

public class Teilnehmer 
extends Personen
{
    // Attribute
    private String lehrgang;
    
    // Konstruktoren
    public Teilnehmer()
    {}
    
    public Teilnehmer(String name, String vorname, String adresse, String lehrgang)
    {
        super(name, vorname, adresse);
        this.lehrgang = lehrgang;
    }
    
    // Akzessoren
    // Getter
    public String getLehrgang()
    {
        return lehrgang;
    }
    // Setter
    public void setLehrgang(String lehrgang)
    {
        this.lehrgang = lehrgang;
    }
    
    // Weitere Methoden
    @Override
    public String toString()
    {
        return super.toString() + String.format("  %s",lehrgang);
    }
    // Nur voruebergehend
    @Override
    public double getGehalt()
    {
        return -1.0;
    }
    
}
