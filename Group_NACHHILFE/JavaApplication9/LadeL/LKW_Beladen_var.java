
package LadeL;

public class LKW_Beladen_var 
{

    public static void main(String[] args) 
    {
        // Unfertige Ladungsliste: Noch besteht keine Zuordnung der Paletten
        // zu den verfügbaren LKWs (mittlere Spalte überalle noch 0)
        int [][] ladungsliste = {{800, 0, 276201},
                                 {500, 0, 276196},
                                 {600, 0, 276198},
                                 {700, 0, 276199},
                                 {500, 0, 276205},
                                 {900, 0, 276211},
                                 {400, 0, 276212},
                                 {900, 0, 276222},
                                 {300, 0, 276225},
                                 {500, 0, 276403},
                                 {700, 0, 276440},
                                 {600, 0, 276472},
                                 {400, 0, 276489},
                                 {500, 0, 276501},
                                 {600, 0, 276503},
                                 {100, 0, 276511},
                                 {200, 0, 276512},
                                 {400, 0, 276549},
                                 {100, 0, 276550},
                                 {100, 0, 276561},
                                 {200, 0, 276567},
                                 {100, 0, 276570},
                                 {300, 0, 276572},
                                 {300, 0, 276580},
                                 {400, 0, 276583},
                                 {600, 0, 276590},
                                 {700, 0, 276607},
                                 {400, 0, 276610},
                                 {500, 0, 276634},
                                 {800, 0, 276701}};
        
        int max_ladung_pro_lkw = 1500;          // Vorgabe (für Testzwecke): Ein LKW kann maximal 1500 (kg) laden
        int max_anzahl_paletten_pro_lkw = 5;    // Vorgabe (für Testzwecke): Ein LKW kann maximal 5 Paletten laden
        
        erstelleLadungsliste_var(ladungsliste, max_ladung_pro_lkw, max_anzahl_paletten_pro_lkw);
        
        // Ausgabe der fertigen Ladungsliste
        
        System.out.println("Gewicht Palette LKW-Nr.  Paletten-Nr.");
        for (int i=0; i < ladungsliste.length; i++)                             // Schleife ueber alle Zeilen der fertigen
        {                                                                       // Ladungsliste
            System.out.format("%9d%10d%14d\n", ladungsliste[i][0], ladungsliste[i][1], ladungsliste[i][2]);
        } 
        System.out.println();
    }
    
    public static void erstelleLadungsliste_var(int [][] ladungsliste, int max_ladung_pro_lkw, int max_anzahl_paletten_pro_lkw)  
    {
        int anzahlLKW = 10;
        int lkwNr = 1;
        boolean beladen = false;
        int zuladung_kg = 0;
        int zuladung_palette = 0;
        
        while (beladen == false && lkwNr <= anzahlLKW)
        {
            beladen = true;
            zuladung_kg = 0;
            zuladung_palette = 0;
            
            for (int i=0; i <= ladungsliste.length-1; i++)
            {
                if (zuladung_kg + ladungsliste[i][0] <= max_ladung_pro_lkw &&
                    zuladung_palette < max_anzahl_paletten_pro_lkw &&
                    ladungsliste[i][1] == 0)
                {
                    zuladung_kg += ladungsliste[i][0];
                    zuladung_palette++;
                    ladungsliste[i][1] = lkwNr;
                    beladen = false;
                } // Ende if   
            } // Ende for
            lkwNr++;
        } // Ende while
    }
    
}
