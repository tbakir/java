package beispiele;
public class BinaerToDezimal {
    public static void main(String[] args) {
        int bin [] = {0,0,0,1,0,1,1,1};
        int erg=0;
        int faktor=1;
        for (int i = 1; i < 9; i++) {
            erg = erg + bin[8-i] * faktor;
            faktor = faktor *2;
        }
        System.out.println(erg);
    }
}
