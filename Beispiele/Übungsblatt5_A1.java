package beispiele;
import java.util.Scanner;
public class Übungsblatt5_A1 {
    public static void main(String[] args) {
        long x;
        long y=0;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein.");
        x = eingabe.nextLong();
        if (x<-2147483648 || x>2147483647) {
            System.out.println("Sie müssen eine gültige Integer-Zahl eingeben");
        } else {
            y = x%10<0?(-1)*x%10:x%10;
            System.out.println("die letzte Ziffer Ihrer Zahl ist " + y );
        }
    }
}
