
/* Maximumermittlung, Variante 2: main()-Methode und Methode zur Berechnung
   des Maximums in verschiedenen Klassen, Klassen aber noch im selben Paket */

package zusatz_fi16;

public class Zusatz_FI16a 
{
    public static void main(String[] args)
    {
        int [] arr = {12,7,21,45,3,17,34,80,91,55};
        int mmax;
        
        Maxima var = new Maxima();              /* Objekt vom Typ Maxima erzeugen
                                                   um auf die Methode maximam_ermitteln()
                                                   zugreifen zu können */
        
        mmax = var.maximum_ermitteln(arr);      /* .-Operator anwnendbar, da Methode
                                                   maximum_ermitteln() den Zugriffsmodifikator
                                                   public hat */ 
        System.out.println("Maximum = "+mmax);
    }

}
