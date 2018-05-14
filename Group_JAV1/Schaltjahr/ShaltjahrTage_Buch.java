import java.util.Scanner;

public class ShaltjahrTage_Buch {
        public static void main(String[] args) {
        
        schaltjahrTage();
        
    }

    private static void schaltjahrTage() {
        byte tag, monat;
        int jahr;
        boolean schaltjahr;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Berechnet der wievielte Tag des Jahres ein Datum darstellt \n"
                         + "und informiert Sie, ob es sich bei dem Jahr um ein Schaltjahr handelt.");
        System.out.println("**********************************************************************");
        
        tag = gibTag(sc);
        monat = gibMonat(sc);
        jahr = gibJahr(sc);
        sc.close();
        
        schaltjahr = istSchaltjahr(jahr);
        ausgabe(schaltjahr, tag, monat, jahr);
    }

    private static byte gibTag(Scanner sc) {
        boolean gueltig = false;
        byte tag = -1;
        System.out.println("Bitte geben Sie den Tag ein: ");
        while(!gueltig) {
            tag = sc.nextByte();
            if(tag >= 0 && tag < 32)
                gueltig = true;
            else
                System.out.println("Ungültige Eingabe! Versuchen Sie es nochmal:");
        }
        return tag;    
    }

    private static byte gibMonat(Scanner sc) {
        boolean gueltig = false;
        byte monat = -1;
        System.out.println("Bitte geben Sie den Monat ein: ");
        while(!gueltig) {
            monat = sc.nextByte();
            if(monat >= 0 && monat < 13)
                gueltig = true;
            else
                System.out.println("Ungültige Eingabe! Versuchen Sie es nochmal:");
        }
        return monat;
    }

    private static int gibJahr(Scanner sc) {
        boolean gueltig = false;
        int jahr = -1;
        System.out.println("Bitte geben Sie den Jahr ein: ");
        while(!gueltig) {
            jahr = sc.nextInt();
            if(jahr >= 0 && jahr < 3000)
                gueltig = true;
            else
                System.out.println("Ungültige Eingabe! Versuchen Sie es nochmal:");
        }
        return jahr;
    }

    private static boolean istSchaltjahr(int jahr) {
        
        return (jahr%4 == 0 && jahr%100 != 0) || jahr%400 == 0;
    }

    private static void ausgabe(boolean schaltjahr, int tag, int monat, int jahr) {
        int tageGesamt;
        if(schaltjahr) 
            System.out.println("Aaah, ein Schaltjahr");
        else
            System.out.println("Kein Schaltjahr");
        
        tageGesamt = tag;
        switch(monat-1) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: tageGesamt++;
            case 4: case 6: case 9: case 11: tageGesamt += 30; break;
            case 2: tageGesamt += schaltjahr ? 29 : 28;
        }
        
        System.out.format("Der %2d.%2d.%d ist der %3d. Tag des Jahres %d.\n",
                          tag, monat, jahr, tageGesamt, jahr);
    }
    
}


