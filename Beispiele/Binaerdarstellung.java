package beispiele;
public class Binaerdarstellung {
    public static void main(String[] args) {
        int [] bin ={0,0,0,0,0,0,0,0};
        int x=210;
        for (int i = 0; i < bin.length; i++) {
            bin[bin.length-i-1]=x%2;
            x=x/2;
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(bin[i]);
        }
        System.out.println("\n");
    }
}
