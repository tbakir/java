
package Sortieren;

import adress_verwaltung.Adressen;
import adress_verwaltung.adressen_sort;

public class MySort_4 
{

    public static void main(String[] args) 
    {
        Adressen [] arr = new Adressen[10];
        
        // Array fuellem
        arr[0] = new Adressen("Fischer","Fritz",80456,"Muenchen","Oedeonsplatz 4");
        arr[1] = new Adressen("Huber","Anna",20900,"Hamburg","Kai 2817");
        arr[2] = new Adressen("Mueller","Karl",80347,"Muenchen","Isarweg 12");
        arr[3] = new Adressen("Carstens","Lena",10155,"Berlin","Alt-Moabit 45");
        arr[4] = new Adressen("Bauer","Friedrich",71209,"Stuttgart","Haubenweg 89");
        
        arr[5] = new Adressen("Fischer","Paul",40456,"Duesseldorf","Henkelplatz 4");
        arr[6] = new Adressen("Huber","Brigitte",30900,"Bremen","Fischergasse 17");
        arr[7] = new Adressen("Mueller","Hans",80348,"Muenchen","Isarweg 80");
        arr[8] = new Adressen("Carstens","Olga",60157,"Frankfurt","Roemergasse 30");
        arr[9] = new Adressen("Bauer","Erwin",71210,"Stuttgart","Traubenweg 4");
        
        adressen_sort var = new adressen_sort();
        var.adressen_sortieren_1(arr);
        
        for (Adressen x : arr)
            System.out.println(x.toString());
    }
    
    
}