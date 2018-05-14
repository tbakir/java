package beispiele;
import java.util.Scanner;
public class Übungsblatt2_A3 {
    public static void main(String[] args) {
        float kurs, dollars;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Aktueller Dollarkurs:");
        kurs = eingabe.nextFloat();
        System.out.println("Wie viele Dollars wollen Sie haben?");
        dollars = eingabe.nextFloat();
        if (dollars > 0 && kurs > 0) {
            System.out.format("Die angegebenen %.2f Dollar haben einen Gegenwert von %.2f Euro.%n", dollars, dollars / kurs);
        } else {
            System.out.println("Programmabbruch");
        }
    }
}
