package beispiele;
import java.util.Scanner;
public class Übungsblatt4_A4 {
    public static void main(String[] args) {
        int x, erg;
        erg=0;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Zahlen summieren.");
        do {
            System.out.println("Bitte Zahl eingeben, beenden mit 0.");
            x = eingabe.nextInt();
            erg = erg + x;
        } while (x!=0);
        System.out.println("Die Summe der eingegebenen Zahlen ergibt " + erg);
    }
}
