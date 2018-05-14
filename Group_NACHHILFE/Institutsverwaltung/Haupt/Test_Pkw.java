
package Haupt;

import java.util.*;
import Klasse_1.*;
public class Test_Pkw 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        double ra;
        
        System.out.print("Tagesaktueller Rabatt fuer Kaeufer unserer PKWs:");
        ra = sc.nextDouble();
        
        Pkw.rabatt = ra;
        
        Pkw nr1 = new Pkw("Ford Fiesta", 2016, 15300.00);
        Pkw nr2 = new Pkw("VW Golf",2017,27350.68);
        Pkw nr3 = new Pkw("Opel Astra",2005,12745.00);
        
        // Kontrollausgaben
        
        /* System.out.println(nr1);
        System.out.println();
        System.out.println(nr1.toString()); */
        
        System.out.println("\nDie einzelnen Attribute sind:");
        System.out.println("Name = "+nr1.getName());
        System.out.println("Baujahr = "+nr1.getBaujahr());
        System.out.println("Anschaffungspreis = "+nr1.getA_preis());
        
        System.out.println("\nDie einzelnen Attribute sind:");
        System.out.println("Name = "+nr2.getName());
        System.out.println("Baujahr = "+nr2.getBaujahr());
        System.out.println("Anschaffungspreis = "+nr2.getA_preis());
        
        System.out.println("\nDie einzelnen Attribute sind:");
        System.out.println("Name = "+nr3.getName());
        System.out.println("Baujahr = "+nr3.getBaujahr());
        System.out.println("Anschaffungspreis = "+nr3.getA_preis());
        
        System.out.println("\nRabatt = "+Pkw.rabatt);
    }
    
}
