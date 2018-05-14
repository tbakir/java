package beispiele;

public class Zahl {

    public static void main(String[] args) {
        int i = 10;
        int zahl = 10;
        while (i < 10) {
            zahl = zahl + 2;
            i++;
            System.out.println("Zwischensumme: " + zahl);
        }
        System.out.println("i " + i);
        System.out.println("Endsumme: " + zahl);
    }
}
