
import java.util.Scanner;

public class B3_A2_Briefanrede {

    public static void main(String[] args) {
        String name;
        Scanner empf = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Empfängerart ein \n w für weiblich\n m für männlich\n f für Firma");
        String eingabe = empf.next();

        if (eingabe.equals("w")) {
            System.out.println("Bitte geben Sie ein Name ein");
            name = empf.next();
            System.out.println("Sehr geehrte Frau " + name);
        } else if (eingabe.equals("m")) {
            System.out.println("Bitte geben Sie ein Name ein");
            name = empf.next();
            System.out.println("Sehr geehrter Herr " + name);
        } else if (eingabe.equals("f")) {
            System.out.println("Bitte geben Sie ein Name ein");
            name = empf.next();
            System.out.println("Sehr geehrte Damen und Herren aus der Firma " + name);
        } else {
            System.out.println("Briefanrede unbekannt!");

        }
    }
}
