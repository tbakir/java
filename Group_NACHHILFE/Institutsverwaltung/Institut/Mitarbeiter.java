
package Institut;

public class Mitarbeiter 
extends Personen
{
    // Attribute
    private double gehalt;
    private int abteilung;
    
    //Konstruktoren
    public Mitarbeiter()
    {}
    public Mitarbeiter(String name, String vorname, String adresse, double gehalt, int abteilung)
    {
        super(name, vorname,adresse);
        /* setName(name);
        setVorname(vorname);
        setAdresse(adresse); */
        this.gehalt = gehalt;
        this.abteilung = abteilung;        
    }
    
    // Akzessoren
    // Getter
    @Override
    public double getGehalt()
    {
        return gehalt;
    }
    public int getAbteilung()
    {
        return abteilung;
    }
    // Setter
    public void setGehalt(double gehalt)
    {
        this.gehalt = gehalt;
    }
    public void setAbteilung(int abteilung)
    {
        this.abteilung = abteilung;
    }
    
    // Weitere Methoden
    @Override
    public String toString()
    {
        return super.toString() + String.format("%8.2f %5d",gehalt,abteilung);
        //return String.format("%s %s %s %.2f %d",getName(), getVorname(),getAdresse(),gehalt, abteilung);
        
    }
}

