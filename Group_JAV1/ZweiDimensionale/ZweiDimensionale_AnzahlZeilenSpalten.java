package zweidimensionale;

public class ZweiDimensionale_AnzahlZeilenSpalten {

    public static void main(String[] args) {
        // TODO code application logic here
        int zeile = 0;
        int spalte = 0;

        int[][] Arrayname = {{1, 11, 111, 1111}, {2, 22, 222}, {3, 33, 333, 3333, 33333, 333333}};
        System.out.println("Anzahl Zeilen " + Arrayname.length);
        System.out.println("******************\n");
        for (zeile = 0; zeile < Arrayname.length; zeile++) {
            System.out.println("In Zeile " + zeile + " gibt es " + Arrayname[spalte].length +" werte");
            spalte++;
            System.out.println("\n");
        }
    }
}
