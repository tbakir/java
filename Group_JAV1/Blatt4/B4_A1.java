
import java.util.Scanner;

public class B4_A1 {

    public static void main(String[] args) {
        int zahl = 0;
        int i = 0;
        int min;
        int max;
        int ag = 0;
        int au = 0;

        Scanner ip = new Scanner(System.in);

        System.out.println("ZAHL?");
        zahl = ip.nextInt();

        i++;
        min = zahl;
        max = zahl;

        if (zahl % 2 == 0) {
            ag++;
        } else {
            au++;
        }

        while (zahl > 0) {
            System.out.println("ZAHL?");
            zahl = ip.nextInt();
            i++;
            if (zahl > max) {
                max = zahl;
            } else if (zahl < min && zahl > 0) {
                min = zahl;
            }
            if (zahl % 2 == 0) {
                ag++;
            } else {
                au++;
            }
        }

        i--;
        ag--;
        System.out.format("Anzahl eingegebener Zahlen: %d, Größte Zahl: %d, Kleinste Zahl: %d\nAnzahl ungerader Zahlen: %d, Anzahl gerader Zahlen: %d\n", i, max, min, au, ag);
    }

}
