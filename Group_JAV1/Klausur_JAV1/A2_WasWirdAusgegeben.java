package Klausur_JAV1;

public class A2_WasWirdAusgegeben {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        String antwort = "";
        double c = 7;
        if (c == a + b) {
            antwort = "Das stimmt";
        } else if (a == 5) {
            antwort = "a ist 5 jawollja";
        }
        else {
            antwort = "Java lügt";
        }
        System.out.println(antwort);
    }
}