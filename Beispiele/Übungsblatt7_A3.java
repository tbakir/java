package beispiele;
public class Übungsblatt7_A3 {
    public static void main(String[] args) {
        int[] werte = {17,4,32,1,12,3,1,101,1};
        int min, pos;
        for (int i = 0; i < werte.length; i++) {
            min = werte[i];
            pos = i;
            for (int j = i + 1; j < werte.length; j++) {
                if (min>werte[j]) {
                    min=werte[j];
                    pos=j;
                }
            }
            werte[pos] = werte[i];
            werte[i] = min;
            System.out.println(werte[i]);    
        }
        System.out.println("Kleinster Wert: " + werte[0]);
        System.out.println("Größter Wert: " + werte[werte.length-1]);
    }
}
