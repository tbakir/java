package beispiele;

public class ArryBsp11 {

    public static void main(String[] args) {
        String[] zeichen = {"1", "t", "xxx", "2", "4", "h", "a", "l", "l", "o", "j", "v"};
        System.out.println("Arraylänge:" + zeichen.length);

        int i = 0;
        while (i < zeichen.length) {
            System.out.println("i: " + i + " Wert " + zeichen[i]);
            i++;
        }
        System.out.println("*******************************");
        System.out.println("In Index 5 steht ein " + zeichen[5]);
    }

}
