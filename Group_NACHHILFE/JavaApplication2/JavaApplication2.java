
package javaapplication2;

import java.util.*;
public class JavaApplication2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int fach = 0;
        int kern = 0;
        int wiso = 0;
        double ergebnis = 0.;
        double faktor1 = 2./5.;
        double faktor2 = 1./5.;
        
        System.out.print("Punktzahl Fachqualifikation eingeben: ");
        fach = sc.nextInt();
        System.out.print("Punktzahl Kernqualifikation eingeben: ");
        kern = sc.nextInt();
        System.out.print("Punktzahl WiSo eingeben :");
        wiso = sc.nextInt();
        
        ergebnis = (fach*faktor1 + kern*faktor1+wiso*faktor2);
        
        System.out.format("Gesamtresuktat: %.2f",ergebnis);
       
    }
    
}
