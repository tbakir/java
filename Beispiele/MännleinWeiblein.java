package beispiele;
import java.util.Scanner;
public class MännleinWeiblein {
    public static void main(String[] args) {
        int geschlecht;
        Scanner eingabe = new Scanner(System.in);
        String name;
        System.out.println("Gib Deinen Namen ein, los jetzt!! (1=m 2=w)");
        name = eingabe.next();
        System.out.println("Gib dein Geschlecht ein, los jetzt!!");
        geschlecht = eingabe.nextInt();
        if (geschlecht==1) {
            System.out.format("Hallo Herr %s%n", name);
        } else if (geschlecht==2) {
            System.out.format("Hallo Frau %s%n", name);
        } else {
            System.out.println("Du bist zu doof ein richtiges Geschlecht einzugeben!!");
        }
    }
}
