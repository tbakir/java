package beispiele;
import java.util.Random;
public class PiMitZufall {
    public static void main(String[] args) {
        Random rd = new Random();
        double koordinatex, koordinatey, laenge, pi;
        double drinnen = 0;
        double draussen = 0;
        for (int i = 0; i < 100000000; i++) {
            koordinatex = rd.nextInt(100000001) / (double) 100000000;
            koordinatey = rd.nextInt(100000001) / (double) 100000000;
            laenge = Math.sqrt(Math.pow(koordinatex, 2) + Math.pow(koordinatey, 2));
            if (laenge>1) {
                draussen++;
            } else {
                drinnen++;
            }
        }
        pi = 4 *drinnen / (drinnen + draussen);
        System.out.println("Pi: " + pi);
    }
}
