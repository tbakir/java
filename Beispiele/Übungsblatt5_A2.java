package beispiele;
import java.util.Scanner;
public class Übungsblatt5_A2 {
    public static void main(String[] args) {
        int x, y, erg;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie eine positive Zahl ein");
        x = eingabe.nextInt();
        System.out.println("Geben Sie eine zweite positive Zahl ein");
        y = eingabe.nextInt();
        do {
            if(x>y) {
                x-=y;
            } else {
                y-=x;
            }
        } while (x>0 && y>0);
        if (x==0) {
            erg=y;
        } else {
            erg=x;
        }
        System.out.println("der ggT ist " + erg);
    }
}
