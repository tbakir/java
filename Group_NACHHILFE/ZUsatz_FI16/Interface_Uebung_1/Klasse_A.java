
package Interface_Uebung_1;

public class Klasse_A 
implements Demo
{
    private int x;
    
    public Klasse_A()
    {}
    
    public Klasse_A(int x)
    {
        this.x = x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    public int getX()
    {
        return x;
    }
    
    // Methode rechnen() aus dem Interface Demo implementieren
    @Override
    public int rechnen(int a, int b, int c)
    {
        return a + b + c + x;
    }
    @Override
    public String toString()
    {
        return String.format("Wert des Attributs x = %d",x);
    }
    
}
