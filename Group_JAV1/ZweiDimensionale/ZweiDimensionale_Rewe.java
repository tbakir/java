package zweidimensionale;

public class ZweiDimensionale_Rewe {

    public static void main(String[] args) {
        // TODO code application logic here
        int zeile = 0;
        int spalte = 0;
        int[][] rewe = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};
        for (zeile = 0; zeile < rewe.length; zeile++) {
            for (spalte = 0; spalte < rewe[zeile].length; spalte++) {
                System.out.print(rewe[zeile][spalte] + " ");

            }
            System.out.println("\n");
        }
    }
}
