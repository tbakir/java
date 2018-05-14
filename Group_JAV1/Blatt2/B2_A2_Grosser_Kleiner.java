// sifir verince hata cikiyor
package blatt2;
import java.util.Scanner;
public class B2_A2_Grosser_Kleiner {
    public static void main(String[] args) {
       int zahl1;
       int zahl2;
       int erg;
       
       Scanner eingabe=new Scanner(System.in);
        System.out.println("Bitte geben Sie erste Zahl ein");
        zahl1=eingabe.nextInt();
       
        System.out.println("Bitte geben Sie zweite Zahl ein");
        zahl2=eingabe.nextInt();
        
        if (zahl1>zahl2) {
            System.out.println(" Zahl1("+ zahl1 + ") ist größer \n Zahl2("+ zahl2 +") ist kleiner");
            erg = zahl1 % zahl2;
        }else {
            System.out.println(" Zahl1("+ zahl1 + ") ist kleiner \n Zahl2("+ zahl2 +") ist größer");
            erg = zahl2 % zahl1;
            
        }
       //System.out.println(erg);
       
       
       if (erg==0) {
           System.out.println("Teilbar");
          } else {
            System.out.println("nicht Teilbar");
            }
           
      
}
}