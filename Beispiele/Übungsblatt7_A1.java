package beispiele;
public class Übungsblatt7_A1 {
    public static void main(String[] args) {
        int werte [] = new int[5];
        int startwert = 2;
        int summe = 0;
        for (int i = 0; i < 5; i++) {
            werte[i] = startwert + i*2;
            System.out.println("Arraywert["+i+"]="+werte[i]);
            summe= summe + werte[i];
        }
        System.out.println("Summe: " + summe);
    }
}
