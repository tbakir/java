
package Institut;

public class Institutsverwaltung_neu 
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
        
        // normal for-loop
        for (int i=0; i < p.length; i++)
        {
            if (i % 2 == 0)
            {
               System.out.print("Index i = "+i+ ":");
               System.out.println(p[i].getName()+ " " + p[i].getVorname() + " " + p[i].getGehalt());
            }
        }
        System.out.println();
        // foreach-loop
        for (Personen x:p)
            System.out.println(x.getName()+ " " + x.getVorname() +" " + x.getGehalt());
          
    }
}

    

