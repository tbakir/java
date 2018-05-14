package beispiele;
import java.util.Scanner;
public class Übungsblatt7_A2 {
    public static void main(String[] args) {
        int werte [] = new int[5];
        Scanner sc = new Scanner(System.in);
        int summe = 0;
        for (int i = 0; i < werte.length; i++) {
            System.out.println(i+1 +". Wert eingeben");
            werte[i] = sc.nextInt();
            summe = summe+werte[i];
        }
        System.out.println("Summe: " + summe);
        System.out.println("Schnitt: " + (float)summe/werte.length);
    }
}
