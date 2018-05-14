package beispiele;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        int fil = 0;
        int mon = 0;
        Scanner sc = new Scanner(System.in);
        int[][] Arrayname = {{1,2,3,4,5,6,7,8,9,10,11,12}, {13,14,15,16,17,18,19,20,21,22,23,24}, {25,26,27,28,29,30,31,32,33,34,35,36}};
        System.out.println("Welche Filiale (1,2,3)?");
        while (fil<1 || fil>3) {
            fil = sc.nextInt();  
        }
        System.out.println("Welcher Monat (1 bis 12)?");
        while (mon<1 || mon>12) {
            mon = sc.nextInt();  
        }
        System.out.println("Der Umsatz für Filiale " + fil + " im Monat " +mon+ " ist " + Arrayname[fil-1][mon-1]);
    }
}