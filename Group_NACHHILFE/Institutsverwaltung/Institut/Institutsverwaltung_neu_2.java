
package Institut;

public class Institutsverwaltung_neu_2 
{

    public static void main(String[] args) 
    {
        Personen [] p = new Personen[5] ; // p ist ein Array von Referenznen
                                          // auf Objekte vom Typ Personen
        // p kann aber auch Referenzen auf Objekte der Kindklassen                                  
        // der Klasse Personen aufnehmen:   UPCAST!!
        
        p[0] = new Mitarbeiter("Huber","Karl","90345 Nuernberg Weg 10",3400.0, 1);
        
        String [] th = {"Java","C++","C#","Windows 10"};
        p[1] = new Trainer("Mueller","Peter","10897 Berlin",2600.0,th);
        
        p[2] = new Teilnehmer("Baum","Werner","20098 Hamburg Kai 33","Buchhaltung");
        p[3] = new Teilnehmer("Mayer","Kirstin","38097 Bremen Berg 5","Informatikkauffrau");
        
        String [] th1 = {"Lohn+Gehalt","Controlling","Buchhaltung","Volkswirtschaft"};
        p[4] = new Trainer("Petersen","Friedrich","70889 Stuttgart Kessel 5",2300.0, th1);
        
        for (Personen x:p)
        {
            if (x instanceof Mitarbeiter)
            {
                System.out.print(x.getName()+ " " + x.getVorname() +" ");
                Mitarbeiter ma = (Mitarbeiter)x;   // Erlaubter Down-Cast mit explizitem Casting
                System.out.println(ma.getGehalt()); // Compiler stellt fest: In Klasse
            }                                       // Mitarbeiter existiert eine Methode getGehalt()
        }    
          
    }
    
}
