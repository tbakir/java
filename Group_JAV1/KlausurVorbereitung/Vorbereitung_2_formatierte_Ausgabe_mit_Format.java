package klausurvorbereitung;

public class Vorbereitung_2_formatierte_Ausgabe_mit_Format {

    public static void main(String[] args) {
        // Erstmal Deklarierungen und Initialisierungen
        int z1 = 5;
        double z2 = 23.56d;
        float z3 = 42.214715f;
        String wort = "Zahl";
        char c = '=';

        System.out.println("z1:" + z1 + " z2:" + z2 + " z3:" + z3);
        System.out.println("***********************************************");
        System.out.println("z1 + z2 = " + z1 + z2);
        System.out.println("z1 + z2 = " + (z1 + z2));       //mit Klammer
        System.out.println(z1 + z2 + " ist das Ergebnis aus z1 + z2");
        System.out.println("***********************************************");
        System.out.println("z2 + z3 = " + z2 + z3);          // Zahlen zusammengesetzt
        System.out.println("z2 + z3 = " + (z2 + z3));        //mit Klammer
        System.out.println("***********************************************");
        System.out.println(z2 + z3 + " ist das Ergebnis aus z2 + z3");
    }

}
