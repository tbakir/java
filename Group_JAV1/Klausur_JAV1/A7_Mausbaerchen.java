package Klausur_JAV1;
import java.util.Scanner;
public class A7_Mausbaerchen {
    public static void main(String[] args) {
        String mausi ="";
	int tag = 0;
        int maus = 0;
        int[][] Mausebaerchen = {{2151, 19, 1015, 14, 9, 12}, {4711, 815, 1906, 1144, 1851, 2357},
        {707, 68, 446, 448, 5400, 919}, {90, 42, 23, 21, 5064, 1944}};
        System.out.println("Mausbeobachtung von 4 Mäusen über einen Zeitraum von 6 Tagen");
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Startnummer der Maus eingeben : ");
        maus = eingabe.nextInt();
        
        
        System.out.println("Bitte Tag eingeben");
        tag = eingabe.nextInt();
        switch (maus)
        {
            case 1:
                System.out.println("Mausi Herta lief an Tag " + tag + " sagenhafte " + Mausebaerchen[0][tag-1] + " Meter");
                break;
            case 2:
                System.out.println("Mausi Karl-Gustav lief an Tag " + tag + " sagenhafte " + Mausebaerchen[1][tag-1] + " Meter");
                break;
            case 3:
                System.out.println("Mausi Jacky lief an Tag " + tag + " sagenhafte " + Mausebaerchen[2][tag-1] + " Meter");
                break;
            case 4:
                System.out.println("Mausi Guttenberg lief an Tag " + tag + " sagenhafte " + Mausebaerchen[3][tag-1] + " Meter");
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}