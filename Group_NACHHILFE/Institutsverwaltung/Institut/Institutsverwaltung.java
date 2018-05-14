
package Institut;

public class Institutsverwaltung 
{

    public static void main(String[] args) 
    {
        Personen p;
        // p = new Personen("Mueller","Fridolin","90411 Nürnberg Weg 2");
        // Geht nur, wenn Personen nicht abstrakt ist
        
        // System.out.println(p);
        // System.out.println(p.toString());
        
        Mitarbeiter m;
        m = new Mitarbeiter("Fischer","Carmen","90567 Nuernberg Platz 1", 3200.0,3);
        p = m; // Beispiel fuer Up-Cast
        
        System.out.println(m);
        System.out.println(p);
        
        Trainer t;
        String [] kurse = {"Java", "C++", "C#","Datenbanken"};
        t = new Trainer("Huber","Klaus","90678 Nuernberg Kirchplatz 4", 2400.0,kurse);
        
        System.out.println(t);
        
        Teilnehmer tn;
        tn = new Teilnehmer("Lehmann","Caroline","90222 Nuernberg Gasse 78","Buchhaltung");
        
        System.out.println(tn);
        
    }
    
}
