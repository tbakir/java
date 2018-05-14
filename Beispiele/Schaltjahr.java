package beispiele;
import java.util.Scanner;
public class Schaltjahr {
    public static void main(String[] args) {
        int tag, monat, jahr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Los, gib einen Tag ein.");
        tag = sc.nextInt();
        System.out.println("Los, gib mir einen Monat.");
        monat = sc.nextInt();
        System.out.println("Los, gib mir ein Jahr.");
        jahr = sc.nextInt();
        int [] tage = {31,schaltjahr(jahr)?29:28,31,30,31,30,31,31,30,31,30,31};
        if(checkDatum(tag, monat, jahr, tage)) {
            System.out.println("Der " + tag + "." + monat + "." + jahr + " ist der " + countDays(tag,monat,tage) + ". Tag des Jahres."); 
        } else {
            System.out.println("Du Vollhonk kannst nicht mal ein richtiges Datum eingeben!");
        }
    }
    public static int countDays (int day, int month, int [] tage) {
        for (int i = 0; i < month-1; i++) {
            day += tage[i];
        }
        return day;
    }
    public static boolean checkDatum (int day, int month, int year, int [] tage) {
        if (month>0 && month<13) {
            return day>0 && day<=tage[month-1];
        } else {
            return false;
        }
    }
    public static boolean schaltjahr (int year) {
        if (year%4!=0) { 
            return false;
        } else {
            if (year%100!=0) {
                return true;
            } else {
                return year%400==0;
            }
        }
    }
}
