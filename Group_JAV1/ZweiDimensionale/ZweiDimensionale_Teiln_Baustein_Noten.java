package zweidimensionale;

import java.util.Scanner;

public class ZweiDimensionale_Teiln_Baustein_Noten {

    public static void main(String[] args) {
        String[] tn = {"Huber", "Mueller", "Bauer", "Weber", "Buch"};
        String[] baust = {"SQL1", "SQL2", "GRPR", "JAVA1", "JAVA2"};
        int[][] punktz = new int[5][5];
        float[] durchtn = new float[5];
        float[] durchpb = new float[5];
        boolean eingaberichtig = false;
        int k = 0;
        int l = 0;
        Scanner eingabe = new Scanner(System.in);

        for (int i = 0; i < punktz.length; i++) {
            for (int j = 0; j < punktz[i].length; j++) {
                while (eingaberichtig == false) {
                    eingaberichtig = true;
                    System.out.println("Eingabe der Note von " + tn[j] + " für den Baustein " + baust[i]);
                    punktz[i][j] = eingabe.nextInt();
                    if (punktz[i][j] < 0 || punktz[i][j] > 100) {
                        eingaberichtig = false;

                    }
                }
                eingaberichtig = false;
            }

        }
        while (k < punktz.length) {

            while (l < punktz[k].length) {
                durchpb[k] = durchpb[k] + punktz[k][l];
                durchtn[l] = durchtn[l] + punktz[k][l];
                l++;
            }
            k++;
            l = 0;
        }

        for (int i = 0; i < baust.length; i++) {
            System.out.println("\n" + baust[i] + " Durchschnitt " + (durchpb[i] / baust.length));
            for (int j = 0; j < baust.length; j++) {
                System.out.println(tn[j] + " " + punktz[i][j]);
            }
        }
        System.out.println("");
        for (int i = 0; i < tn.length; i++) {
            System.out.println("Teilnehmer " + tn[i] + " Durchschnitt " + (durchtn[i] / tn.length));
        }

    }

}
