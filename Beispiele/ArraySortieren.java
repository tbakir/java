package beispiele;
public class ArraySortieren {
    public static void main(String[] args) {
        int[] werte = {17, 4, 9, 5, -13, -7};
        int min, pos;
        for (int i = 0; i < werte.length; i++) {
            min = werte[i];
            pos =-1;
            for (int j = i; j < werte.length; j++) {
                if (min>werte[j]) {
                    min=werte[j];
                    pos=j;
                }
            }
            if (pos!=-1) {
                werte[pos] = werte[i];
                werte[i] = min;
            }
            System.out.println(werte[i]);
        }
    }
}
