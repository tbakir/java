
package Interface_Uebungen;

public class Geo_Haupt 
{

    public static void main(String[] args) 
    {
        Rechteck r = new Rechteck(10.5, 4.799);
        Kreis k    = new Kreis(4.0049);
        
        System.out.println(r);
        System.out.println(k);
        
        
        System.out.println("Flaeche des Rechtecks: "+r.getFlaeche());
        System.out.println("Flaeche des Kreises:   "+k.getFlaeche());
        
        
        System.out.println("Ergebnis des Flaechenvergleichs:"+GeoVergleich.vergleiche(r,k));
        
        System.out.println("Ergebnis des Flaechenvergleichs:"+GeoVergleich.vergleiche(k,r));
        
        System.out.println("Ergebnis des Flaechenvergleichs:"+GeoVergleich.vergleiche(k,k));
        
    }
}
