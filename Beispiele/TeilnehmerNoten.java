package beispiele;
import java.util.Scanner;
public class TeilnehmerNoten {
    public static void main(String[] args) {
        int max = 0;
        int min = 100;
        int posminteil=0, posminbau=0, posmaxteil=0, posmaxbau=0;
        Scanner eingabe = new Scanner(System.in);
        String teilnehmer [] = {"Meier", "Müller", "Schmidt", "Witte", "Heinz"};
        String baustein [] = {"SQL", "Java", "WinSrv"};
        float teilnehmerschnitt;
        float klausurenschnitt[] = {0,0,0};
        int punkte [][] = {{80,80,80}, {90,90,90}, {60,70,80}, {90,95,92}, {50,51,52}};
        /*
        int punkte [][] = new int [teilnehmer.length][baustein.length];
        for (int i = 0; i < teilnehmer.length; i++) {
            for (int j = 0; j < baustein.length; j++) {
                System.out.println("Puktzahl des Teilnehmers " + teilnehmer[i] + " beim Baustein " + baustein[j] + "?");
                punkte[i][j]= eingabe.nextInt();
            }
        }
        */
        for (int i = 0; i < teilnehmer.length; i++) {
            teilnehmerschnitt = 0;
            for (int j = 0; j < baustein.length; j++) {
                if (min>punkte[i][j]) {
                    min = punkte[i][j];
                    posminteil = i;
                    posminbau = j;
                }
                if (max<punkte[i][j]) {
                    max = punkte[i][j];
                    posmaxteil = i;
                    posmaxbau = j;
                }
                klausurenschnitt[j] = klausurenschnitt[j] + punkte[i][j];
                if (i==teilnehmer.length-1) {
                    System.out.format("Die Klausur %s hat einen Schnitt von %f%n", baustein[j], klausurenschnitt[j]/(teilnehmer.length) );
                }
                teilnehmerschnitt = teilnehmerschnitt + punkte[i][j];
                if (j==baustein.length-1) {
                    teilnehmerschnitt = teilnehmerschnitt / (float) baustein.length;
                    System.out.format("Teilnehmer %s  hat einen Schnitt von %f%n" , teilnehmer[i] , teilnehmerschnitt );
                }
            }
        }
        System.out.println("Teilnehmer " + teilnehmer[posmaxteil] + " erreichte die maxinmale Punktzahl (" + max + ") im Baustein " + baustein[posmaxbau]);
        System.out.println("Teilnehmer " + teilnehmer[posminteil] + " erreichte die minimale Punktzahl (" + min + ") im Baustein " + baustein[posminbau]);
    }
}
