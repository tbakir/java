package beispiele;
import java.util.Scanner;
public class Übungsblatt5_A3 {
    public static void main(String[] args) {
        int jahr;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie eine Jahreszahl zwischen 1580 und 2100 ein.");
        jahr = eingabe.nextInt();
        if (jahr > 1579 && jahr < 2101) {
            if (jahr%4 !=0) {
                System.out.println("Das Jahr " + jahr + " ist KEIN Schaltjahr");
            } else {
                if (jahr%100 != 0) {
                    System.out.println("Das Jahr " + jahr + " ist EIN Schaltjahr");
                } else {
                    if (jahr%400 == 0) {
                        System.out.println("Das Jahr " + jahr + " ist EIN Schaltjahr");
                    } else {
                        System.out.println("Das Jahr " + jahr + " ist KEIN Schaltjahr");
                    }
                }
            }
        } else {
            System.out.println("Sie sollen eine Jahreszahl zwischen 1580 und 2100 eingeben!");
        }
    }
}
