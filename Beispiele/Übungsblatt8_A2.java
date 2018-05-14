package beispiele;

import java.util.Scanner;

public class Übungsblatt8_A2 {
    public static void main(String[] args) {
        int zahlen[] = {5,6,8,16,24,28,70};
        int pos = -1;
        int vergleiche = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Los jetzt, gib was ein!");
        int x = sc.nextInt();
        int untergrenze = 0;
        int obergrenze = zahlen.length-1;
        int mitte;
        do {
            mitte = (untergrenze + obergrenze)/2;
            vergleiche++;
            if(zahlen[mitte]==x) {
                pos=mitte;
                untergrenze = zahlen.length;
                obergrenze = 0;
            } else {
                if (zahlen[mitte] > x) {
                    obergrenze = mitte-1;
                } else {
                    untergrenze = mitte+1;
                }
            }
        } while (untergrenze<=obergrenze);
        if (pos == -1) {
            System.out.println("Ich konnte Deine Zahl nicht finden.");
        } else {
            System.out.println("Ich habe Deine Zahl bei Arrayindex " + pos + " gefunden.");
        }
        System.out.println("Für diese Aussage habe ich " + vergleiche + " Vergleiche benötigt.");
        System.out.println("Das Array hat eine Länge von " + zahlen.length + " Elementen.");
        
    }
}
