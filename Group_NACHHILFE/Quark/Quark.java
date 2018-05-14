
package quark;

public class Quark 
{
    public static void main(String[] args) 
    {
        int a = 15;
        int b = 7;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        a = a - b;
        b = b + a;
        a = b - a;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}
