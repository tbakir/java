
package Geraffel;

import java.util.*;
import Geraffel_Zusatz.PKW;
public class Sort_Haupt 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int eingabe;
        
        PKW[] arr = new PKW[10];
        
        arr[0] = new PKW("VW Golf", 2017, 31789.50);
        arr[1] = new PKW("VW Passat", 2016, 34219.78);
        arr[2] = new PKW("VW Tuareg", 2015, 42180.00);
        arr[3] = new PKW("VW Polo", 2018,18345.00);
        arr[4] = new PKW("Opel Corsa", 2015,14674.00);
        arr[5] = new PKW("BMW Z4", 2011, 33267.00);
        arr[6] = new PKW("BMW 3i", 2009, 17256.55);
        arr[7] = new PKW("Opel Zafira",2007, 15348.00);
        arr[8] = new PKW("Ford Mustang", 2004, 22189.45);
        arr[9] = new PKW("Ford Fiesta", 2018, 15378.44);
        
        System.out.println("\nUnsortierte Ausgabe\n");
        for (PKW x:arr)
            System.out.println(x);
        
        do
        {
            System.out.print("Sortiermodue auswähen\n"+
                             "1 - Sortieren nach Name\n"+
                             "2 - Sortieren nach Baujahr\n"+
                             "3 - Sortieren nach Anschaffungspreis\n"+
                             "Ihre Auswahl: ");
            
            eingabe = sc.nextInt();                                       
            
        } while (eingabe < 1 || eingabe > 3);
        
        PKW.sort_mode = eingabe;
        
        System.out.println("\nSortierte Ausgabe\n");
        Arrays.sort(arr);
        
        for (PKW y:arr)
            System.out.println(y);
    }
    
}
