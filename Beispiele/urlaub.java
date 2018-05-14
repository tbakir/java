package beispiele;
public class urlaub {
    public static void main(String[] args) {
        int alter = 52;
        if (alter >= 67) {
            System.out.println("Rente");
        } else if (alter > 60) {
            System.out.println("Urlaub = 36");
        } else if (alter > 55) {
            System.out.println("Urlaub = 34");
        } else if (alter > 50) {
            System.out.println("Urlaub = 32");
        } else {
            System.out.println("Urlaub = 30");
        }
        
    }
}
