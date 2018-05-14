
package Institut;

public abstract class Personen 
{
    // Attribute
    private String name;
    private String vorname;
    private String adresse;
    
    // Konstruktoren
    public Personen()
    {}
    
    public Personen(String name, String vorname, String adresse)
    {
        this.name = name;
        this. vorname = vorname;
        this.adresse = adresse;
    }
    // Akzessoren
    // Getter-Methoden
    public String getName()
    {
        return name;
    }
    public String getVorname()
    {
        return vorname;
    }
    public String getAdresse()
    {
        return adresse;
    }
    // Setter-Methoden
    public void setName(String name)
    {
        this.name = name;
    }
    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }    
    // Weitere Mthoden der Schnittstelle der Klasse
    @Override
    public String toString()
    {
        return String.format("%20s %15s %30s",name, vorname, adresse);
    }
    // Siehe Diskussion zum statischen und dynamischen Typ einer Referenzvariablen im Unterricht
    public abstract double getGehalt();  // Erforderlich für Variante
                                         // Institutsverwaltung_neu.jav
                                         // nicht erforderlich für Variante
                                         // Institutsverwaltung_neu_1.java
    
}
