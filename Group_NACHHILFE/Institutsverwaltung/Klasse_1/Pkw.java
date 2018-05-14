
package Klasse_1;

public class Pkw 
implements Comparable        
{
    // Attribute
    private String name;
    private int    baujahr;
    private double a_preis;
    private double nachlass;
    private double v_preis;
    
    // Statische Attribute
    
    public static double rabatt = 0.0;  // Werte fuer rabatt und sortieren werden
    public static int sortieren = 0;    // per Eingabe ueber Tastatur ermittelt
    
    // Konstruktoren
    public Pkw()
    {}
    
    public Pkw(String name, int baujahr, double a_preis)
    {
        this.name     = name;
        this.baujahr  = baujahr;
        this.a_preis  = a_preis;
        this.nachlass = berechne_rabatt();
        this.v_preis  = a_preis - nachlass;
    }  
    // Akzessoren
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBaujahr(int baujahr)
    {
        this.baujahr = baujahr;
    }
    public void SetA_preis(double a_preis)
    {
        this.a_preis = a_preis;
    }
    public String getName()
    {
        return name;
    }
    public int getBaujahr()
    {
       return baujahr; 
    }
    public double getA_preis()
    {
        return a_preis;
    }
    // Weitere Methoden der Business-Logik
    public double berechne_rabatt()
    {
        return (a_preis/100.)*rabatt;
    }
    // Weitere Methoden
   
    @Override
    public int compareTo(Object o)
    {
        Pkw obj = (Pkw)o;  // Down-Cast
        
        if (sortieren == 1)  // Sortieren nach Name
        {
           String name1 = this.name;
           String name2 = obj.getName();
           
           return name1.compareTo(name2);
        }
        else if (sortieren == 2)  // Sortieren nach Baujahr
        {
           int baujahr_1 = this.baujahr;
           int baujahr_2 = obj.getBaujahr();
           if (baujahr_1 > baujahr_2)
               return 1;
           else if (baujahr_1 < baujahr_2)
               return -1;
           else
               return 0;
         }
        else if (sortieren == 3)  // Sortieren nach Anschaffungspreis
        {
           double a_preis_1 = this.a_preis;
           double a_preis_2 = obj.getA_preis();
           if (a_preis_1 > a_preis_2)
               return 1;
           else if (a_preis_1 < a_preis_2)
               return -1;
           else
               return 0;
        }
        else
            return -2;
        
    }
            
    @Override
    public String toString()
    {
        return String.format("%s %4d %12.2f", name, baujahr, a_preis);
    }
    public void display()
    {
        System.out.format("Typ: %-12s Baujahr:%4d Ansch.-Preis:%10.2f"+
                          " Nachlass:%8.2f Verkf.-Preis:%10.2f\n", name, baujahr,
                          a_preis, nachlass, v_preis);
    }
    
}
