
package Haupt;

import java.util.*;
import Klasse_1.*;
public class Test_Pkw_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        double ra;
        int sort; 
        
        Pkw [] nr = new Pkw[10];
        
        // Tagesaktuellen Rabatt ermitteln
        System.out.print("Tagesaktueller Rabatt fuer Kaeufer unserer PKWs:");
        ra = sc.nextDouble();
        Pkw.rabatt = ra;  // Statisches Attribut der Klasse Pkw initialisieren
        
        // Festlegen, wonach die Liste der PKWs sortiert werden soll
        System.out.print("Sortieren nach  (1) Name  (2) Baujahr  (3) Anschaffungspreis (3)");
        sort = sc.nextInt();  // Vernuenftige Eingabe wird vorausgesetzt, nicht ueberprueft
        Pkw.sortieren = sort;
        
        // Objekte der Klasse Pkw anlegen (koennten z.B. die heute fuer den
        // Verkauf zur Verfuegung stehed
        nr[0] = new Pkw("Ford Fiesta", 2016, 15300.00);
        nr[1]=  new Pkw("VW Golf",2017,27350.68);
        nr[2] = new Pkw("VW Tuareg",2016,42780.00);
        nr[3] = new Pkw("Opel Astra",2005,12745.00);
        nr[4] = new Pkw("Opel Corsa",2010,9457.23);
        nr[5] = new Pkw("VW Passat",2014,29783.00);
        nr[6] = new Pkw("BMW Z4", 2017, 37128.00);
        nr[7] = new Pkw("BMW 3i",2003, 16591.00);
        nr[8] = new Pkw("Audi 6",2016, 34188.00);
        nr[9] = new Pkw("Audi 4",2012, 21345.00);
        
        // Kontrollausgabe
        
        for (Pkw x:nr)
        {
            x.display();
        }
        
        sort_Pkw(nr);
         
        System.out.println("Kontrollausgabe des sortierten Arrays nr");
        for (Pkw x:nr)
        {
            x.display();
        }
        
    }
    public static void sort_Pkw(Pkw [] nr)
    {
        Pkw merk;
        
        for (int j= nr.length-1; j > 0; j--)
        {
            for (int i=0; i < j; i++)
            {
                if (nr[i].compareTo(nr[i+1]) > 0)
                {
                   merk = nr[i+1];
                   nr[i+1] = nr[i];
                   nr[i] = merk;
                }
            }
        }
    }
    
}
