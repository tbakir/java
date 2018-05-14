package beispiele;
public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z;
        int limit = 15;
        System.out.print(x + ", " + y);
        for (int i = 0; i < limit; i++) {
            z= x+y;
            System.out.print(", " + z);
            x=y;
            y=z;
        }
        System.out.println("\n");
    }
}
