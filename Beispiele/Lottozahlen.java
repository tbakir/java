package beispiele;
import java.util.Random;
public class Lottozahlen {
    public static void main(String[] args) {
        int lotto[] = {0,0,0,0,0,0,0};
        int x;
        boolean gefunden = false;
        Random rd = new Random();
        for (int i = 0; i < 7; i++) {
            x= rd.nextInt(49) +1;
            for (int j = 0; j < 7; j++) {
                if (x==lotto[j]) {
                    gefunden= true;
                }
            }
            if (!gefunden) { 
                lotto[i]=x;
            } else {
                i--;
                gefunden=false;
            }
        }
        System.out.print("Die Lottozahlen lauten: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(lotto[i] + ", ");
        }
        System.out.println(lotto[5]);
        System.out.println("Die Zusatzzahl ist: " + lotto[6]);
    }
}
