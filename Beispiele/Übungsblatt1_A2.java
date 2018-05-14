package beispiele;
public class Übungsblatt1_A2 {
    public static void main(String[] args) {
        int zahl = 90125, sec=0, min=0, std=0, days=0, temp=0;
        sec = zahl%60;
        temp = zahl/60;
        min = temp % 60;
        temp = temp/60;
        std = temp % 24;
        temp = (temp/24);
        days = temp % 24;
        System.out.format("%d Sekunden sind %d Tag/e, %d Stunde/n, %d Minute/n und %d Sekunden%n", zahl, days, std, min, sec );
    }
}
