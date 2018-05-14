
import java.util.Scanner;

public class A2_2__Sum_Durchsch {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] werte = new int[5];
        int i = 0;
       
        System.out.println("Bitte fünf Ganzzahl hintereinander eingeben!");
        Scanner eingabe = new Scanner(System.in);
        
        while (i < werte.length) {
            werte[i] = eingabe.nextInt();
            i++;
        }
        
        i = 0;
        int summe = 0;
        int durchschnitt = 0;
        while (i < werte.length) {
            summe = summe + werte[i];
            i++;
        }
            System.out.println("Summe des Zahlen ist \t\t: " + summe);
            System.out.println("Durchschnitt des Zahlen ist\t: " + summe/werte.length);
        }
    }


