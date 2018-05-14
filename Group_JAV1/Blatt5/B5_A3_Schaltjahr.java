import java.util.*;  //Importiert Scanner zum Einlesen der Eingabe
 
public class B5_A3_Schaltjahr {       //Die "ausführende Klasse"
     
    public static boolean isSchaltjahr(int year)                //Die Methode zur Überprüfung, vom typ boolean
    {
        if (year%4 == 0 && (year%100 != 0 || year%400 == 0))    //Kontrollabfrage mit booleschen Operatoren (s.u.)
                return true;                                    //Rückgabe WAHR, wenn die Regeln zutreffen, -> Methode endet HIER
        return false;                                           //Rückgabe FALSCH, else entfällt, da die Methode bei return autom. endet
    }       //Ende isSchaltjahr-Methode
     
//-------OPTIONAL:----------------------------------------------------- 
 
    public static void main(String[] args)                              //main-Methode
    {
        System.out.print("Bitte Jahr eingeben");                        //Ausgabe des Strings
        Scanner s = new Scanner(System.in);                             //legt das Scanner-Objekt an
        int y = s.nextInt();                                            //liest die manuelle Eingabe ein und speichert sie in der Variablen y
        if (isSchaltjahr(y)) System.out.print(y+" ist ein Schaltjahr"); //Abfrage, kein Vgl. nötig, da dieser auch nur dazu dient  
                                                                        //if einen true/false Wert zu übergeben, Ausgabe, wenn Schaltjahr
        else System.out.print(y+" ist kein Schaltjahr");                //Ausgabe, wenn kein Schaltjahr
        //Hier ist else nötig, da die Methode nach der Ausgabe weiterläuft und sonst beides anzeigen würde
    }   //Ende main-Methode
}   //Ende Klasse
 
/**
Die verwendeten booleschen Operatoren:
- && -> Und, verbindet mehrere Bedingungen
- || -> Oder, es reicht wenn EINE der beiden Bedingungen zutrifft (im Gegensatz zu XOR!)
 
Weitere Operatoren:
a&b -> gibt den Rest zurück, so lässt sich mit einer 0-Abfrage kontrollieren ob a ein Teiler von b ist
*/