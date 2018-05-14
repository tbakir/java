
    package beispiele;
    import java.util.Scanner;
    public class Gerade_Ungerade {
    public static void main(String[] args) throws InterruptedException {

        int ArrayLaenge;
        int zahl;
        int max = 0;
        int min = 0;
        int pos = 0;
        int i = 0;
        double ds;
        double erg = 0;

        Scanner ip = new Scanner(System.in);
        System.out.println("\u001B[34mBitte die Länge des Arrays eingeben.");
        ArrayLaenge = ip.nextInt();
        int[] gZ = new int[ArrayLaenge];
        System.out.println("\u001B[34mBitte befüllen Sie das Array mit gerade Zahlen.\n");

        do {
            System.out.println("Zahl?");
            zahl = ip.nextInt();
            if (zahl % 2 == 0) {
                gZ[i] = zahl;
                min = gZ[i];
                max = gZ[i];
                pos = i;
                System.out.print(".");
                Thread.sleep(300);
                System.out.print("..");
                Thread.sleep(300);
                System.out.print("\u001B[32mAktzeptiert");
                Thread.sleep(300);
                System.out.print("\u001B[30m..");
                Thread.sleep(300);
                System.out.print(".\n\n");
            } else {
                System.out.print(".");
                Thread.sleep(300);
                System.out.print("..");
                Thread.sleep(300);
                System.out.print("...");
                Thread.sleep(300);
                System.out.println("\u001B[31mZahl nicht gültig!\n");
            }
        } while (zahl % 2 != 0);

        for (i = 1; i < gZ.length;) {
            System.out.println("Zahl?");
            zahl = ip.nextInt();
            if (zahl % 2 == 0) {
                gZ[i] = zahl;
                System.out.print(".");
                Thread.sleep(300);
                System.out.print("..");
                Thread.sleep(300);
                System.out.print("\u001B[32mAktzeptiert");
                Thread.sleep(300);
                System.out.print("\u001B[30m..");
                Thread.sleep(300);
                System.out.print(".\n\n");
                i++;
//                if (gZ[i] < min) {
//                    pos = i;
//                    i++;
//                } else {
//                    i++;
//                }
            } else {
                System.out.print(".");
                Thread.sleep(300);
                System.out.print("..");
                Thread.sleep(300);
                System.out.print("...");
                Thread.sleep(300);
                System.out.println("\u001B[31mZahl nicht gültig!\n");
            }
        }

        for (i = 1; i < gZ.length; i++) {
            if (gZ[i] > max) {
                max = gZ[i];
            } else if (gZ[i] < min) {
                min = gZ[i];
                pos=i;
            } else {
            }
        }

        for (i = 0; i < gZ.length; i++) {
            erg = erg + gZ[i];
        }
        ds = erg / gZ.length;
        System.out.println("Indexposition d. kl. Wertes: " + pos + " Min: " + min + " Max: " + max + " Durchschnitt: " + ds);
    }
}
