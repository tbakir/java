package beispiele;
import java.util.Scanner;
public class Übungsblatt3_A2 {
    public static void main(String[] args) {
        String str;
        String name;
        name = "";
        System.out.println("Geben Sie w,m,f ein!");
        str = new Scanner(System.in).next();
        if (str.equalsIgnoreCase("w") || str.equalsIgnoreCase("m")) {
            System.out.println("Geben Sie einen Namen ein!");
            name = new Scanner(System.in).nextLine();
        }
        String defaultString = "Sehr geehrte";
        switch (str) {
            case "w":
                System.out.format("%s Frau %s%n",defaultString, name);
                break;
            case "m":
                System.out.format("%sr Herr %s%n",defaultString, name);
                break;
            case "f":
                System.out.format("%s Damen und Herren%n",defaultString);
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}
