
public class A1_3__ArrSchleifeVariabVerdoppelt {

    public static void main(String[] args) {
        int[] werte = new int[4];
        int zahl = 0;

        for (int i = 0; i < werte.length; i++) {
            //werte = {zahl};
            zahl = zahl + 5;
            werte[i] = zahl;
            System.out.println("Array: " + werte[i]);
        }
    }

}
