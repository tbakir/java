
/* Maximumermittlung, Variante 3: main()-Methode und Methode zur Berechnung
   des Maximums in verschiedenen Klassen, Klassen in verschiedenen Paketen */

package zusatz_fi16;

import zusatz_fi16_1.*;
public class Zusatz_FI16b 
{
    public static void main(String[] args) 
    {
       int [] arr = {12,7,21,45,3,17,34,80,91,55};
        int mmax;
        
        Maxima_1 var = new Maxima_1();          /* Objekt vom Typ Maxima erzeugen
                                                   um auf die Methode maximam_ermitteln()
                                                   zugreifen zu können */
        
        mmax = var.maximum_ermitteln(arr);      /* .-Operator anwnendbar, da Methode
                                                   maximum_ermitteln() den Zugriffsmodifikator
                                                   public hat */ 
        System.out.println("Maximum = "+mmax);
    }

}
