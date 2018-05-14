package blatt2;
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        double DK = 0;
        double Dollar = 0;
        double Euro = 0;

        Scanner ip = new Scanner(System.in);

        System.out.println("Der Dollar/Euro Rechner\n");
        System.out.println("Bitte geben Sie den aktuellen Dollar Kurs ein.");
        DK = ip.nextDouble();

        if (DK <= 0) {
            System.exit(0);
        }

        System.out.println("Wie viel Dollar soll ich umrechnen?");
        Dollar = ip.nextDouble();
        
        if (Dollar <= 0) {
            System.exit(0);
        }

        Euro = Dollar / DK;

        System.out.format("\nIhr eingebener Wert von %.2f $ ergibt %.2f €.\n", Dollar, Euro);
    }

}
