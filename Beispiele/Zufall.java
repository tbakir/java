package beispiele;
import java.util.Random; 
public class Zufall { 
    public static void main(String[] args) { 
        Random rZahl = new Random(); 
        //generiert eine Zahlzwischen 0 und n-1 und addiert 5 drauf
        int zahl1 = rZahl.nextInt(5) + 5;
        //eine Normalverteilte Zufallszahl um die Null herum
        double test = rZahl.nextGaussian();
        System.out.println("zahl1: " + zahl1); 
        System.out.println(test); 
    } 
}          
        
        
