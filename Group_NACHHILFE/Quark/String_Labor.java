
package quark;

import java.util.*;
public class String_Labor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String  halt = "";
        
        //----------------------------------------------------------------------
        // Referenzvariablen vergleichen
        
        String s1 = "Hallo";    // Wird bereits vom Compiler ausgewertet
        String s2 = "Hallo";    // Compiler optiniert, siehe Unterricht!
        
        String s3 = new String("Hallo");  // Wird zur Laufzeit von JVM ausgefuehrt
        String s4 = new String("Hallo");  // Wird zu Laufzeit von der JVM ausgefuehrt
        
        if (s1 == s2)   // Vergleich des Inhalts von Referenzvariablen, 
                        // d.h. hier werden Referenzen verglichen!!
            System.out.println("Referenz in s1 ist gleich Referenz in s2");
        else
            System.out.println("Referenz in s1 ist nicht gleich Referenz in s2");
        
        if (s3 == s4)   // Vergleich des Inhalts von Referenzvariablen,
                        // d.h. hier werden Referenzen verglichen!!
            System.out.println("Referenz in s3 ist gleich Referenz in s4");
        else
            System.out.println("Referenz in s3 ist nicht gleich Referenz in s4");
        
        halt = sc.nextLine();
        
        //----------------------------------------------------------------------
        // Zwie Stings auf Gleichheit vergleichen
        
        if (s1.equals(s2))     // Hier werden die Strings, auf die s1 und s2 zeigen,
                               // verglichen (Test auf Gleichheit)
            System.out.println("Strings, auf die s1 und s2 zeigen, sind gleich");
        else
            System.out.println("Strings, auf die s1 und s2 zeigen, sind nicht gleich");
        
        if (s3.equals(s4))    // Hier werden die Strings, auf die s3 und s4 zeigen,
                              // vergöichen (test auf Gleichheit)
            System.out.println("Strings, auf die s3 und s4 zeigen, sind gleich");
        else
            System.out.println("Strings, auf die s3 und s4"
                    + " zeigen, sind nicht gleich");
        
        halt = sc.nextLine();
        
        //----------------------------------------------------------------------
        // Einen leeren String erzeugen
        
        String s5 = "";
        String s6 = new String();
        
        //----------------------------------------------------------------------
        // Zwei Strings lexikalisch vergleichen (Zeichen für Zeichen)
        
        String s7;  // Hier werden nur die Referenzvariablen s7 und s8 angelegt
        String s8;  // In den Variablen sind noch keine Adressen auf Strings enthalten
        
        System.out.print("Bitte einen String eingeben: ");
        s5 = sc.nextLine();
        
        System.out.print("Bitte noch einen String eingeben: ");
        s6 = sc.nextLine();
        
        System.out.println("Die eingegebenen Strings werden nun lexikalisch verglichen");
        int vgl;
        if ((vgl =s5.compareTo(s6)) > 0)
            System.out.println("String, auf den s5 zeigt, ist groesser als String, auf den s6 zeigt!");
        else if (vgl < 0)
            System.out.println("String, auf den s5 zeigt, ist kleiner als String, auf den s6 zeigt!");
        else
            System.out.println("String, auf den s5 zeigt, ist gleich dem String, auf den s6 zeigt!");
        
        halt = sc.nextLine();
        
        //----------------------------------------------------------------------
        // Auf einzelne Zeichen in einem String zugreifen
        
        String s9  = "Das ist ein Beispiel";
        String s10 = "Beispiel";
        char c;
        
        System.out.println("Laenge von "+s9+" = "+s9.length());  // Stringlaenge ermitteln
        
        for (int i=0; i < s9.length(); i++)
        {
            c = s9.charAt(i);
            System.out.println("Zeichen an Indexposition "+i+" = "+c);
        }
        
        halt = sc.nextLine();
                    
        String s11 = "";
        
        for (int j=0; j < 8; j++)  // 8 Zeichen in einem String speichern
        {                          
            c = (char)(65+j);
            s11 = s11 + c;
        }
        System.out.println(s11);
        
        halt = sc.nextLine();
        
        //----------------------------------------------------------------------
        // Einen Teilstring aus einem String ermitteln
        
        System.out.println(s9.substring(4,7));
        
        halt = sc.nextLine();
        
        //----------------------------------------------------------------------
        // In einem String nach einem Teilstring suchen
        
        String s12 = "Das Arbeiten mit Zeichenketten ist ein Bestandteil von Java";
        
        int pos = s12.indexOf("Arbeiten");
        System.out.println(pos);
        
        halt = sc.nextLine();
        
        pos = s12.indexOf("Teil");
        System.out.println(pos);
        
        halt = sc.nextLine();
        
   //---------------------------------------------------------------------------
   // Teilstrings in einem String ersetzen
   
       String s13 = "C++ und C# und Java sind objektorientierte Programmsprachen";
   
       System.out.println(s13.replace("und", "sowie"));
   
       halt = sc.nextLine();
   
   //---------------------------------------------------------------------------
   // In einem String Kleinbuchstaben in Grossbuchstaben konvertieren
   // In einem String Grossbuchstaben in Kleinbuchstaben konvertieren
   
       String s14 = "das ist aber eine String nur mit Kleinbuchstaben";
       String s15 = "ZUR ABWECHSLUNG EIN STRING NUR AUS GROSSBUCHSTABEN";
       String s16 = "Ein String aus Klein- und Grossbuchstaben!";
   
       System.out.println(s14.toUpperCase());
       System.out.println(s15.toLowerCase());
       System.out.println(s16.toLowerCase());
       System.out.println(s16.toUpperCase());
   
       halt = sc.nextLine();
   
   //---------------------------------------------------------------------------
   // Einen String in Teilstrings zerlegen
   
       String s17 = "Es ist ein Maerchen aus uralten Zeiten, dass Java Spass macht!";
   
       String [] teilstrings = s17.split("\\s");
   
       for (String t: teilstrings)
           System.out.println(t);
   
       halt = sc.nextLine();
   
   //---------------------------------------------------------------------------
   // Mehrere aufeinanderfolgende Leerzeichen in einem String durch ein Lerrzeichen
   // ersetzen, fuehrende Leerzeichen ignorieren
   
      String s18 = "     Das   ist  ein   String   mit   vielen   Blanks";
      String s19 = "";
      char z; 
      char zz = ' ';
   
      boolean blank = true;  // Ist true, wenn das zuvor gelesene Zeichen ein Blank
                             // war; ist false, wenn das zuvor gelesene Zeichen 
                             // kein Blank war
           
      for (int i = 0; i < s18.length(); i++)        
      {
          if ((z = s18.charAt(i)) != zz)
          {
             s19 = s19 + z;
             blank = false;
          }
          else
          {
              if (blank == false)
              {
                  s19 = s19 + z;
                  blank = true;
              }               
              else
              {
                  ;
              }
                 
          }
       
      }
      
      System.out.println(s18);
      System.out.println(s19);
      
      System.out.println("Ende, Aus und auf Wiedersehen!");
   }
    
}
