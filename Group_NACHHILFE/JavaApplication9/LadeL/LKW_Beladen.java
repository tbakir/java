
package LadeL;

public class LKW_Beladen 
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
        
        erstelleLadungsliste(ladungsliste, max_ladung_pro_lkw, max_anzahl_paletten_pro_lkw);
        
        // Ausgabe der fertigen Ladungsliste
        
        System.out.println("Gewicht Palette LKW-Nr.  Paletten-Nr.");
        for (int i=0; i < ladungsliste.length; i++)                             // Schleife ueber alle Zeilen der fertigen
        {                                                                       // Ladungsliste
            System.out.format("%9d%10d%14d\n", ladungsliste[i][0], ladungsliste[i][1], ladungsliste[i][2]);
        } 
        System.out.println();
    }

    public static void erstelleLadungsliste(int [][] ladungsliste, int max_ladung_pro_lkw, int max_anzahl_paletten_pro_lkw)  
    {
        int lkw = 1;                                                            // Es beginnt mit LKW Nr. 1
        int ladung_pro_lkw = 0;                                                 // Anfaenglich ein Gewicht von 0 auf dem LKW
        int anzahl_paletten_pro_lkw = 0;                                        // Anfaenglich 0 Paletten auf dem LKW
        
        int anzahl_zeilen_ladungsliste = ladungsliste.length;                   // Anzahl der Zeilen der unfertigen Ladungsliste berechnen
        
        for (int i=0; i < anzahl_zeilen_ladungsliste && lkw <= 10; i++)         // Schleife ueber alle Zeilen der unfertigen Ladungsliste
        {
            if (ladung_pro_lkw + ladungsliste[i][0] <= max_ladung_pro_lkw &&    // Test; Koennte noch etwas auf den LKW geladen werden?
                    anzahl_paletten_pro_lkw + 1 <= max_anzahl_paletten_pro_lkw) // Koennte noch eine Palette auf den LKW geladen werden?
            {                                                                   // Wenn ja, dann
                ladung_pro_lkw = ladung_pro_lkw + ladungsliste[i][0];           // Gewicht auf aktuellem LKW hochzaehlen
                anzahl_paletten_pro_lkw = anzahl_paletten_pro_lkw + 1;          // Anzahl Paletten auf aktuellem LKW um 1 erhoehen  
                ladungsliste[i][1] = lkw;                                       // LKW-Nummer in ladungsliste eintragen (Zeile mit Index i,
            }                                                                   // Spalte mit Index 1 [mittlere Spalte]) 
            else                                                                // Wenn nein, dann
            {
                lkw = lkw + 1;                                                  // LKW-Nummer erhoehen (neuer LKW) 
                ladung_pro_lkw = 0;                                             // Ladung für den neuen LKW auf 0 setzen
                anzahl_paletten_pro_lkw = 0;                                    // Anzahl der Paletten für den neuen LKW auf 0 setzen
                i = i-1;                                                        // Da Zeile mit Index i noch nicht bearbeitet wurde
                                                                                // im Schleifenkopf wird dann ja i wieder erhoeht.
                
            }
        }
    }
}
