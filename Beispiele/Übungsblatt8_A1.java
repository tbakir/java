package beispiele;

import java.util.Scanner;

public class Übungsblatt8_A1 {

    public static void main(String[] args) {
        int zahlen[] = {2, 8, 4, 6, 23, 17};
        int pos = -1;
        int vergleiche = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Los jetzt, gib was ein!");
        int x = sc.nextInt();
        for (int i = 0; i < zahlen.length; i++) {
            if (x == zahlen[i]) {
                pos = i;
                i = zahlen.length;
                vergleiche++;
            } else {
                vergleiche++;
            }
        }
        if (pos == -1) {
            System.out.println("Ich konnte Deine Zahl nicht finden.");
        } else {
            System.out.println("Ich habe Deine Zahl bei Arrayindex " + pos + " gefunden.");
        }
        System.out.println("Für diese Aussage habe ich " + vergleiche + " Vergleiche benötigt.");
        System.out.println("Das Array hat einr Länge von " + zahlen.length + " Elementen.");
    }
}
