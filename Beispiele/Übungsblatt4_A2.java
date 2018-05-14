package beispiele;
import java.util.Scanner;
public class Übungsblatt4_A2 {
    public static void main(String[] args) {
        int x, quersumme, zwerg;
        zwerg=0;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein.");
        quersumme = eingabe.nextInt();
        x=quersumme;
        if (x>0) {
            do {
                x=quersumme;
                quersumme = 0;
                while (x>0) {
                    quersumme = quersumme + x%10;
                    x=x/10;
                }
                if (zwerg==0) {
                    zwerg=quersumme;
                }
            } while (quersumme > 10);
            System.out.println("Die einfache Quersumme " + zwerg);        
            System.out.println("Die iterierte Quersumme " + quersumme);
        } else {
            System.out.println("Ich kann nur Quersummen von positiven Zahlen berechnen.");
        }
    }
}
