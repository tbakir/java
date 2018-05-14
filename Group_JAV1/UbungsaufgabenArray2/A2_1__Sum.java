
import java.util.Scanner;

public class A2_1__Sum {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] Array = new int[5];
        int i = 0;
        Scanner eingabe = new Scanner(System.in);
        while (i < Array.length) {
            Array[i] = i * 2 + 2;
            i++;
        }
        for (int j = 0; j < Array.length; j++) {
            System.out.println("Array : " + Array[j]);

        }
        int summe = 0;
        i = 0;
        while (i < Array.length) {
            summe = summe + Array[i];
            i++;
        }
        System.out.println("Quer/summe : " + summe);
    }

}
