package beispiele;
import java.util.Scanner;
public class Auswahl1 {
    public static void main(String[] args) {
        // TODO code application logic here
        String geschlecht="";
        System.out.println("Bitte geben Sie ein Geschlecht Buchstabe ein!");
        Scanner eingabe=new Scanner(System.in);
         geschlecht=eingabe.next();
        switch (geschlecht.toLowerCase())
        {
            case "w":
                System.out.println("Frau");
                break;
            case "m":
                System.out.println("Herr");
                break;
            default:
                System.out.println("Sonstiges");
        }
    }
    
}
