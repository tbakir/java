package ubungsaufgabenarray3_2dim;

import java.util.Scanner;

public class A3_1__EingabeGesucht {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] zahlen = {2, 8, 4, 6, 23, 17};
        int i = 0;
        //int zaehler = 0;
        Scanner eingabe = new Scanner(System.in);

        int zahl = 0;
        System.out.println("Bitte eine Ganzzahl eingeben:");
        zahl = eingabe.nextInt();

        if (zahl == zahlen[i]) {
            System.out.println("Eingegebene Zahl index : 0");
        } else if (zahl == zahlen[i + 1]) {
            System.out.println("Eingegebene Zahl index : 1");
        } else if (zahl == zahlen[i + 2]) {
            System.out.println("Eingegebene Zahl index : 2");
        } else if (zahl == zahlen[i + 3]) {
            System.out.println("Eingegebene Zahl index : 3");
        } else if (zahl == zahlen[i + 4]) {
            System.out.println("Eingegebene Zahl index : 4");
        } else if (zahl == zahlen[i + 5]) {
            System.out.println("Eingegebene Zahl index : 5");
        } else {
            System.out.println("Eingegebene Zahl nicht gefunden!");
        }
    }

}
