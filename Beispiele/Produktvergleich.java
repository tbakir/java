package beispiele;
import java.util.Scanner;
public class Produktvergleich {
    public static void main(String[] args) {
        float preis1, preis2;
        float gewicht1, gewicht2;
        String produkt1, produkt2;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Was ist das erste Produkt?");
        produkt1 = eingabe.next();
        System.out.println("Was ist der Preis von " + produkt1 + " (in Euro)?");
        preis1 = eingabe.nextFloat();
        System.out.println("Was ist das Gewicht von " + produkt1 + " (in Gramm)?");
        gewicht1 = eingabe.nextFloat();
        System.out.println("Was ist das zweite Produkt?");
        produkt2 = eingabe.next();
        System.out.println("Was ist der Preis von " + produkt2 + " (in Euro)?");
        preis2 = eingabe.nextFloat();
        System.out.println("Was ist das Gewicht von " + produkt2 + " (in Gramm)?");
        gewicht2 = eingabe.nextFloat();
        if (preis1/gewicht1 >= preis2/gewicht2) {
            System.out.format("Das Produkt %s ist billiger. Es kostet %.2f EUR/Kilo. Das %s ist teurer und kostet %.2f EUR/Kilo%n", produkt2, (preis2*1000)/gewicht2, produkt1, (preis1*1000)/gewicht1 );
        } else {
            System.out.format("Das Produkt %s ist billiger. Es kostet %.2f EUR/Kilo. Das %s ist teurer und kostet %.2f EUR/Kilo%n", produkt1, (preis1*1000)/gewicht1, produkt2, (preis2*1000)/gewicht2 );
        }
    }
}
