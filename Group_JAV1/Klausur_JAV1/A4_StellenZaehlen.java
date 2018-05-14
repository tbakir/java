package Klausur_JAV1;
import java.util.Scanner;
public class A4_StellenZaehlen {
    public static void main(String[] args) {
        int zaehler = 0, zahl = 0, merk = 0;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Von welchen Ganzzahl sollen die Anzahl der Stellen ermittelt werden?");
        zahl = eingabe.nextInt();

        merk = zahl;
        while (merk != 0) {
            zaehler++;
            merk = merk / 10;
        }
        System.out.println("Die Zahl " + zahl + " hat " + zaehler + " Stellen");
    }
}
