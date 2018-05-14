
package beispiele;

import java.util.Scanner;
public class ArraySortierer {

       public static void main(String[] args) throws InterruptedException {
        int[] werte = new int[5];
        int k = werte.length;
        boolean Schalter = true;
        int merk;
        int i;

        Scanner ip = new Scanner(System.in);
        System.out.println("\u001B[34mBitte um Eingabe der Werte zum befüllen des Arrays. Fünf Eingabe");

        for (i = 0; i < werte.length; i++) {
            System.out.println("Wert?");
            werte[i] = ip.nextInt();
            Thread.sleep(200);
        }

        for (i = 0; i < werte.length; i++) {
            System.out.format("Index: %d, Wert: %d\n", i, werte[i]);
            Thread.sleep(400);
        }

        while (k > 0 && Schalter == true) {
            i = 0;
            Schalter = false;
            while (i < k - 1) {
                if (werte[i] > werte[i + 1]) {
                    merk = werte[i];
                    werte[i] = werte[i + 1];
                    werte[i + 1] = merk;
                    Schalter = true;
                    i++;
                } else {
                    i++;
                }
            }
            k--;
        }
        System.out.println();
        for (i = 0; i < werte.length; i++) {
            System.out.format("Index: %d, Wert: %d\n", i, werte[i]);
            Thread.sleep(300);
        }
    }
}
