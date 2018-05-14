
import java.util.Scanner;

public class A1_4__ArrString {

    public static void main(String[] args) {
        //String[] orte = {"Rom","Wien","Berlin","Jena"};
        String[] orte = new String[4];
        Scanner eingabe = new Scanner(System.in);

        for (int i = 0; i < orte.length; i++) {
            orte[i] = eingabe.nextLine();
        }

        for (int i = 0; i < orte.length; i++) {
            System.out.println("An der Position " + i + " steht der Wert: " + orte[i]);
        }

    }

}
