
import java.util.Scanner;

public class A1_2__ArrErstellenTastaturEingabe {

    public static void main(String[] args) {
        int[] Array = new int[4];
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte füllen Sie 4 Felder aus");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = eingabe.nextInt();

        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Array: " + Array[i]);

        }

    }

}
