import java.util.Scanner;
public class B4_A3_Fakultaet {
    public static void main(String[] args) {
        int zahl = 0;
        int erg = 0;

        Scanner ip = new Scanner(System.in);

        do {
            System.out.println("Bitte geben Sie eine ganzahlige Zahl ein. 0 beendet die Eingabe");
            zahl = ip.nextInt();
            erg = erg + zahl;
            System.out.println();
        } while (zahl != 0);
        System.out.println("Das Summe ihrer Zahlen ist: " + erg);
    }

}
