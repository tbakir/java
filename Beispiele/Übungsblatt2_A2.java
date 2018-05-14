package beispiele;
import java.util.Scanner;
public class Übungsblatt2_A2 {
    public static void main(String[] args) {
        int zahl1, zahl2, temp;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Zahl1:");
        zahl1 = eingabe.nextInt();
        System.out.println("Zahl2:");
        zahl2 = eingabe.nextInt();
        if (zahl1 > zahl2) {
            System.out.format("%d ist größer als %d%n", zahl1, zahl2);
            temp = zahl1 % zahl2;
        } else if (zahl1 < zahl2) {
            System.out.format("%d ist größer als %d%n", zahl2, zahl1);
            temp = zahl2 % zahl1;
        } else {
            System.out.format("Die zwei Zahlen sind gleich.%n");
            temp = zahl2 % zahl1;
        }
        if (temp==0) {
            System.out.println("Die Zahlen sind restlos durcheinander teilbar.");
        } else {
            System.out.format("Die Zahlen sind nicht teilbar. der Rest ist %d%n", temp);
        }
    }
}



