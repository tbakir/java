
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 
{
    public static String [][] routen = {{"A","B","X","X"},
                                        {"A","C","B","X"},
                                        {"A","D","E","B"}};
        
    public static int [][] gewichte  = {{0,1200,-1,-1},
                                        {0,500,1100,-1},
                                        {0,700,1900,2900}};
    
    public static double [][] preise  = {{0.,3.5,-1,-1},
                                         {0.,0.2,0.4,-1},
                                         {0.,0.2,0.5,0.8}};
            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int fracht_gewicht;
                    
        System.out.print("Gewicht der Fracht,dieauf dem kostengünstigste Weg"+ 
                "von A nach B transportiert werden soll: ");
        fracht_gewicht = sc.nextInt();
        
        zeigeRoute(findeRoute(fracht_gewicht));
        
    } 
    
        // Statische Methoden
        public static int findeRoute(int gewicht)
        {
            int index           = -1;
            double  min_preis   = 1000000000.;
            double preis        = 0.;
            
            boolean route_ok = false;
            
            for (int zeile=0; zeile < routen.length; zeile++)
            {
                route_ok = true;   // Wird false, wenn Strecke wegen zu hohem
                                   // Frachtgewicht nicht moeglich
                preis    = 0.;     // Speichert die Summe der Preise pro Route
                                   // Teilstrecken einer Route
                
                for (int spalte=0; spalte < routen[zeile].length-1 && 
                        !routen[zeile][spalte+1].equals("X")&& 
                        route_ok; spalte++)
                {
                    if (gewicht <= holeStreckeGewicht(routen[zeile][spalte], 
                            routen[zeile][spalte+1]))
                        preis = preis + 
                        gewicht*holeStreckePreis(routen[zeile][spalte], 
                                                  routen[zeile][spalte+1]);
                    else
                        route_ok = false;
                } 
                if (route_ok && preis < min_preis)
                {
                   index = zeile;
                   min_preis = preis;
                }    
            }           
            
            return index;
        }        
        public static int holeStreckeGewicht(String sb, String se)
        {
            for (int zeile = 0; zeile < routen.length; zeile++)
                for (int spalte = 0; spalte < routen[zeile].length-1; spalte++)
                    if (sb.equals(routen[zeile][spalte]) && 
                            se.equals(routen[zeile][spalte+1]))
                            return(gewichte[zeile][spalte+1] - 
                                    gewichte[zeile][spalte]);
            
            return -1;  // wenn es die Strecke nicht gibt, z.B. B nach D
        }
        
        public static double holeStreckePreis(String sb, String se)
        {
            
            for (int zeile = 0; zeile < routen.length; zeile++)
                for (int spalte = 0; spalte < routen[zeile].length-1; spalte++)
                    if (sb.equals(routen[zeile][spalte]) && 
                            se.equals(routen[zeile][spalte+1]))
                            return(preise[zeile][spalte+1] - 
                                    preise[zeile][spalte]);
            
            return -1;  // wenn es die Strecke nicht gibt, z.B. B nach D
        }
        
        public static void zeigeRoute(int index)
        {
            if (index >= 0)
            {    
               for (int spalte = 0; spalte < routen[index].length; spalte++)
                   if (!routen[index][spalte].equals("X"))
                       System.out.print(routen[index][spalte]+"-");
            }
            else
               System.out.println("Keine Route moeglich!");
            
            // System.out.println();
        }        
    
    }
    

