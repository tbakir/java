
import java.util.Scanner;

public class B5_A1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int zahl = 0;
        int erg = 0;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein zahl!");
        zahl = Scanner.nextInt();
        erg = zahl % 10;
        if (erg < 0) {
            erg = (erg * -1);
        } else {

        }
        System.out.println("Letzte Ziffer ist " + erg);
    }

}
