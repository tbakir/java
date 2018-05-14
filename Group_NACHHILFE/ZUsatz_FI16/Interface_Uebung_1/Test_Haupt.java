
package Interface_Uebung_1;

public class Test_Haupt 
{
    public static void main(String[] args) 
    {
        Klasse_A var1 = new Klasse_A(10);
        Klasse_B var2 = new Klasse_B(20);
        
        System.out.println(var1);
        System.out.println("Wert von x = "+var1.getX());
        
        System.out.println(var2);
        System.out.println("Wert von x = "+var2.getX());
        
        System.out.println("Methode rechnen() aus Klasse_A:"+var1.rechnen(2,3,4));
        System.out.println("Methode rechnen() aus Klasse_B:"+var2.rechnen(2,3,4));
        
        Anzeigen.ausgeben(var1);
        Anzeigen.ausgeben(var2);
    }
    
}
