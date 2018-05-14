package beispiele;
import java.util.Scanner;
public class TaschenRechner {
    public static void main(String[] args) {
        // TODO code application logic here
        double zahl1=0;
        double zahl2;
        zahl2=0;
              
        String operator;
        double erg=0;
        Scanner eingabe= new Scanner(System.in);
        
        System.out.println("Geben Sie erste Zahl ein");
        zahl1=eingabe.nextInt();
        System.out.println("Geben Sie zweite Zahl ein");
        zahl2=eingabe.nextInt();
        System.out.println("Geben Sie ein Operator ein");
        operator=eingabe.next();
       
        
        switch(operator)
        {
            case "+":
                erg=zahl1+zahl2;
                break;
            case "-":
                erg=zahl1-zahl2;
                break;
            case "*":
                erg=zahl1*zahl2;
                break;
            case "/":
                erg=zahl1/zahl2;
                break;    
            default:
                System.out.println("Falsche Operator");
        }
         
        System.out.println("Ergebniss " +erg);
        
        
        
        
    }
    
}
