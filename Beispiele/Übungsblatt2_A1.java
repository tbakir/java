package beispiele;
import java.util.Scanner;
public class Übungsblatt2_A1 {
    public static void main(String[] args) {
        int tore_stschleifchen, tore_gegner;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Tore von St. Schleifchen:");
        tore_stschleifchen = eingabe.nextInt();
        System.out.println("Tore des Gegners:");
        tore_gegner = eingabe.nextInt();
        if (tore_gegner + 10 <= tore_stschleifchen) {
            System.out.println("lalala we are the Champions! lalala");
        }
    }
}
