package beispiele;
import java.util.Scanner;
public class Übungsblatt4_A3 {
    public static void main(String[] args) {
        int x, erg=1;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");
        x = eingabe.nextInt();
        if (x>=0) {
            for (int i = 1; i <= x; i++) {
                erg=erg*i;
            }
            System.out.println("Die Fakultät von " + x + " ist " + erg);
        } else {
            System.out.println("Von negativen gibt es keine Fakultät.");
        }
    }
}
