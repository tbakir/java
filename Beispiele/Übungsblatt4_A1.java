package beispiele;
import java.util.Scanner;
public class Übungsblatt4_A1 {
    public static void main(String[] args) {
        int x, max, min, i, gerade, ungerade;
        i=0;
        max=0;
        min=0;
        gerade=0;
        ungerade=0;
        boolean ersteeingabe=true;
        Scanner eingabe = new Scanner(System.in);
        do {
            System.out.println("Bitte geben Sie eine Zahl ein.");
            x = eingabe.nextInt();
            if (ersteeingabe && x!=0) {
                ersteeingabe = false;
                max=x;
                min=x;
                i=1;
                if (x%2==0) {
                    gerade++;
                } else {
                    ungerade++;
                }
            } else if (x!=0) {
                i++;
                if (x%2==0) {
                    gerade++;
                } else {
                    ungerade++;
                }
                if (max<x) {
                    max=x;
                }
                if (min>x) {
                    min=x;
                }
            }
        } while (x!=0);
        if (i>0) {
            System.out.println("Maximum: " +max);    
            System.out.println("Minimum: " +min);    
        }
        System.out.println("Sie haben " + i + " gültige Werte eingegeben.");
        System.out.println("Es waren " + ungerade + " ungerade Zahlen.");
        System.out.println("Es waren " + gerade + " gerade Zahlen.");
    }
}
