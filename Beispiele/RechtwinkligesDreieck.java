package beispiele;
import java.util.Arrays;
import java.util.Scanner;
public class RechtwinkligesDreieck {
    public static void main(String[] args) {
        float ax,ay,bx,by,cx,cy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir einen Punkt A im Koordinatensystem");
        System.out.println("x-Koordinate?");
        ax = sc.nextFloat();
        System.out.println("y-Koordinate?");
        ay = sc.nextFloat();
        System.out.println("Gib mir einen Punkt B im Koordinatensystem");
        System.out.println("x-Koordinate?");
        bx = sc.nextFloat();
        System.out.println("y-Koordinate?");
        by = sc.nextFloat();
        System.out.println("Gib mir einen Punkt C im Koordinatensystem");
        System.out.println("x-Koordinate?");
        cx = sc.nextFloat();
        System.out.println("y-Koordinate?");
        cy = sc.nextFloat();
        double [] dreieckslaengen = {getLaenge(ax,bx,ay,by),getLaenge(ax,cx,ay,cy),getLaenge(cx,bx,cy,by)};
        Arrays.sort(dreieckslaengen);
        if(Math.abs(Math.pow(dreieckslaengen[0], 2) + Math.pow(dreieckslaengen[1], 2) - Math.pow(dreieckslaengen[2], 2)) < 0.00000002) {
            System.out.println("Dein Dreieck ABC ist rechtwinklig.");
        } else {
            System.out.println("Du hast Dir kein rechtwinkliges Dreieck ausgedacht.");
        }
    }
    public static double getLaenge(double ax, double bx, double ay, double by) {
        return Math.sqrt(Math.pow((ax-bx),2)+Math.pow((ay-by),2));
    }
}
