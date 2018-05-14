
package ihk_2017_2;

import java.util.*;
public class IHK_2017_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        boolean [][] kino = {{false, true, true, false, false, false, false, true, false, true},
                             {false, false, true, true, true, false, false, true, true, true},
                             {true, true, true, false, false, false, false, false, true, true},
                             {false, false, true, true, true, false, false, true, true, true}};
        
        /* false kennzeichnet leere Plaetze, true kennzeichnet belegte Plaetze */
        System.out.print("Gewuenschte Anzahl freie Sitze: ");
        int anzahlSitze = sc. nextInt();
        
        int result = freieSitze(anzahlSitze, kino);
        
        System.out.println("result = "+result);
    }
    public static int freieSitze(int anz, boolean [][] kino)
    {
       int start = 0;
       int erg = 0;
       
       for (int i=0; i < kino.length; i++)
       {
           start = 0;
           for (int j=0; j < kino[i].length; j++)
           {
               if (kino[i][j] == false)
               {    
                   start++;
                   if (start == anz)
                   {
                       erg = 100*(i+1)+(j-anz)+2;
                       System.out.println("i = "+i+" j = "+j); // Zur Kontrolle
                       /* i und j hochsetzen, damit Schleifen abgebrochen werden */
                       j = kino[i].length-1;
                       i = kino.length-1;
                   }
               }                         
               else
               {
                   start = 0;
                   erg = 0;
               }    
           }
       }
       return erg;
    }
 }
