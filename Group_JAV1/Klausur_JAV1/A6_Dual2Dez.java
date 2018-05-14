package Klausur_JAV1;
import java.util.Scanner;
public class A6_Dual2Dez {
    public static void main(String[] args) {
        int zahl = 0, multiplikator = 1, dual = 0;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Dualzahl ein.");
        dual = eingabe.nextInt();
        System.out.print("Die Dualzahl " + dual + " hat den Dezimalwert: ");

        while (dual != 0) {
            if(dual%10==1) {
                zahl = zahl + multiplikator;
            }
            multiplikator = multiplikator * 2;
            dual = dual/10;
        }
        System.out.print(zahl);
    }
}
