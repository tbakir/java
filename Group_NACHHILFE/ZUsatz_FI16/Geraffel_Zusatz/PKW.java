
package Geraffel_Zusatz;

public class PKW 
implements Comparable
{
    // Nicht-statische Attribute
    String name;
    int    baujahr;
    double a_preis;
    
    // Statische Attribute
    public static double rabatt    = 2.5;
    public static int    sort_mode = 1;
    
    // Konstruktoren
    public PKW ()
    {}
    
    public PKW (String name, int baujahr, double a_preis)
    {
        setName(name);
        setBaujahr(baujahr);
        setA_preis(a_preis);
    }
    
    // Akzessoren
    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBaujahr(int baujahr)
    {
        this.baujahr = baujahr;
    }
    public void setA_preis(double a_preis)
    {
        this.a_preis = a_preis;
    }
    // Getter
    public String getName()
    {
        return this.name;
    }
    public int getBaujahr()
    {
        return this.baujahr;
    }
    public double getA_preis()
    {
        return this.a_preis;
    }
    // Sonstige Methoden
    @Override
    public int compareTo(Object obj1)
    {
        PKW obj2 = (PKW)obj1;
        
        if (sort_mode == 1)
        {
            String name1 = this.name;
            String name2 = obj2.name;
        
            return name1.compareTo(name2);  // Stringvergleich muss mit compareTo()
                                            // der Klasse String erfolgen
        }
        else if (sort_mode == 2)
        {
            int baujahr_1 = this.baujahr;
            int baujahr_2 = obj2.baujahr;
        
            if (baujahr_1 > baujahr_2)
               return 1;
            else if (baujahr_1 < baujahr_2)
               return -1;
            else  // baujahr_1 == baujahr_2
               return 0; 
        }
        else if (sort_mode == 3)
        {
            double a_preis_1 = this.a_preis;
            double a_preis_2 = obj2.a_preis;
        
            if (a_preis_1 > a_preis_2)
               return 1;
            else if (a_preis_1 < a_preis_2)
               return -1;
            else  // baujahr_1 == baujahr_2
               return 0; 
        }
        else
            return -2;  // Kann aber gar nicht vorkommen, da sort_mode zwischen 
                        // 1 und 3 inklusive liegt
    }
    @Override
    public String toString()
    {
        return String.format("%-20s  %4d  %12.2f", name, baujahr, a_preis);
    }
}
