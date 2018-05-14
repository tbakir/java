package Klausur_JAV1;

import java.util.Scanner;

public class A3_10Fehler {

    public static void main(String[] args) {
        int farbe = 0;
        String ausgabe = "Uschi trägt heute ";
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Farbnummer eingeben.");
        System.out.println("1 - rot\n2 - schwarz\n3 - gelb\n4 - blau\n\n9 - Abbruch");
        do  {
            farbe = eingabe.nextInt();
        } while
            (farbe <= 0 && farbe != 9);

        switch (farbe) {
            case 1:
                System.out.println(ausgabe + "rot");
		break;
		case 2:
                System.out.println(ausgabe + "schwarz");
			break;
            case 3:
                System.out.println(ausgabe + "gelb");
			break;
            case 4:
                System.out.println(ausgabe + "blau");
			break;
            case 9:
                break;
            default:
                System.out.println(ausgabe + "---gar nichts? Tsetsetse – wir sind doch nicht in Vegas");       
    }
}
}
