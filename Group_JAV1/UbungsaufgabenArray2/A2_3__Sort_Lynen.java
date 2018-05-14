
public class A2_3__Sort_Lynen {

    public static void main(String[] args) {
        // TODO code application logic here
        int schalter = 1;
        int i;
        int[] zahlen = {17, 4, 32, 1, 12, 3, 1, 101, 1};
        int zwi;
        int k = zahlen.length;
        while (k > 0 && schalter == 1) {
            schalter = 0;
            i = 0;
            while (i < k - 1) {
                if (zahlen[i] > zahlen[i + 1]) {
                    zwi = zahlen[i];
                    zahlen[i] = zahlen[i + 1];
                    zahlen[i + 1] = zwi;
                    schalter = 1;
                }
                i++;
            }
            k = k - 1;
        }
        i = 0;
        System.out.println("Inhalt des Arrays nach Sortierung");
        while (i < zahlen.length) {
            System.out.print(zahlen[i] + " ");
            i++;
        }
        System.out.println("");
        System.out.println("Größter Wert: " + zahlen[zahlen.length - 1]);
        System.out.println("Kleinster Wert: " + zahlen[0]);
    }
}
