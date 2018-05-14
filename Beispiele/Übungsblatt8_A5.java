package beispiele;
public class Übungsblatt8_A5 {
    public static void main(String[] args) {
        String [] quelle = {"b","e","i","l"};
        String [] ziel = new String [quelle.length];
        for (int i = 0; i < quelle.length; i++) {
            ziel[quelle.length -1 -i] = quelle[i];
        }
        for (int i = 0; i < ziel.length; i++) {
            System.out.print(ziel[i]);
        }
        System.out.println("\n");        
    }
}
