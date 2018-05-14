package beispiele;
public class Übungsaufgabe8_A3 {
    public static void main(String[] args) {
        String [] quelle = {"j","a","v","a"};
        String [] ziel = new String [quelle.length];
        for (int i = 0; i < quelle.length; i++) {
            ziel[i] = quelle[i];
        }
        for (int i = 0; i < ziel.length; i++) {
            System.out.print(ziel[i]);
        }
        System.out.println("\n");
    }
}
