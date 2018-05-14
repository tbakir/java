package beispiele;
public class Übungsblatt8_A4 {
    public static void main(String[] args) {
        String [] quelle = {"j","a","v","a"};
        String [] ziel = new String [quelle.length+2];
        ziel[0]= ziel[ziel.length-1] ="*";
        for (int i = 1; i < quelle.length +1; i++) {
            ziel[i] = quelle[i-1];
        }
        for (int i = 0; i < ziel.length; i++) {
            System.out.print(ziel[i]);
        }        
        System.out.println("\n");
    }
}
