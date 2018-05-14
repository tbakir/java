
package adress_verwaltung;

public class Adressen 
{
    // Attribute (Membervariablen)
    private String name;   
    private String vname;
    private int    plz;
    private String wohnort;
    private String strasse_hnr;
    
    // Konstruktoren
    public Adressen()           // Standard-Konstruktor
    {}
    
    public Adressen(String name, String vname, int plz, String wohnort, String strasse_hnr)
    {
        this.name = name;
        this.vname = vname;
        this.plz = plz;
        this.wohnort = wohnort;
        this.strasse_hnr = strasse_hnr;
    }

    // Akzessoren (Getter- und Setter-Methoden)
    
    public String getName()
    {
        return name;
    }
    public String getVname()
    {
        return vname;
    }
    public int getPlz()
    {
        return plz;
    }
    public String getWohnort()
    {
        return wohnort;
    }
    public String getStrasse_hnr()
    {
        return strasse_hnr;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setVname(String vname)
    {
        this.vname = vname;
    }
    public void setPlz(int plz)
    {
        this.plz = plz;
    }
    public void setWohnort(String wohnort)
    {
        this.wohnort = wohnort;
    }
    public void setStrasse_hnr(String strasse_hnr)
    {
        this.strasse_hnr = strasse_hnr;
    }
    
    // Weitere Methoden
    
    public int compareTo(Adressen obj)
    {
        int plz2 = obj.getPlz();
        int plz1 = this.plz;
        
        if (plz1 > plz2)
            return 1;
        else if (plz1 < plz2)
            return -1;
        else
            return 0;
    }
    
    @Override
    public String toString()
    {
        return String.format("%20s %15s %5d %20s %20s", name, vname, plz, wohnort, strasse_hnr);
    }
}
