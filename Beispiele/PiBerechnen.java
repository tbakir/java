package beispiele;
public class PiBerechnen {
    public static void main(String[] args) {
        double umfang, pi, alpha, beta, seite, anz;
        for (int j = 0; j < 30; j++) {
            anz = 4* Math.pow(2, j);
            alpha = 360 /anz;
            beta = (180 - alpha) /2;
            seite = Math.sin(Math.toRadians(alpha))/Math.sin(Math.toRadians(beta));
            umfang = seite * anz;
            System.out.format("Durchlauf %2d: Pi ist %.30f%n",j,  umfang /2 );
        }
    }
}
