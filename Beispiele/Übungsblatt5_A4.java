package beispiele;
public class Übungsblatt5_A4 {
    public static void main(String[] args) {
        int erg =1;
        int i;
        for (i = 1; i < 21; i++) {
            if (i>1) {
                erg *= 2;
            }
            System.out.format("Verdienst an Tag %d: %d Cent = %d Euro%n", i, erg, erg/100);
        }
    }
}
