
package beispiele;

import java.util.Scanner;

public class Benzin {

    public static void main(String[] args) {
        boolean test = true;
        String ausgabe = "Zu Zahlen: ";
        System.out.println("Anzahl Liter: ");
        Scanner eingabe = new Scanner(System.in);
        int literBenzin = eingabe.nextInt();
        System.out.println("Pries pro Liter: ");
        double preisLiterBenzin = eingabe.nextDouble();
        double zuZahlen = literBenzin * preisLiterBenzin;
        System.out.format("%s%18.6f €\n", ausgabe, zuZahlen);
        //System.out.format("*%b*SE%n",test);
        //System.out.format("%x",literBenzin);
    }
    
}
