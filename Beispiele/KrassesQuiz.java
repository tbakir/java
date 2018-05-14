package beispiele;
import java.util.Random;
import java.util.Scanner;
public class KrassesQuiz {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int j, pos, a, temp, userantwort, punkte=0;
        int ant[] = new int[4];
        int ques[] = new int[5];
        String antworten[] = {"Bonn", "Bielefeld", "Berlin", "Hamburg", "München", "Frankfurt/Main",
            "Karlsruhe", "Ingolstadt", "Flensburg", "Wuppertal", "Aachen", "Hannover"};
        String fragen[] = {"Wo steht der \"Lange Eugen\"?", "Welche Stadt existiert nur der Legende nach?",
            "Wo liegt die \"Museeumsinsel\"?", "Welche Stadt ist Hansestadt?",
            "In welcher Stadt steht die \"Bavaria\"?", "Wie heißt die deutsche Bankenhauptstadt?",
            "Wo ist das Bundesverfassungsgericht?", "Wo liegt der Haupsitz von \"Audi\"?",
            "Wo ist der Sitz des Verkehrszentralregisters?", "Welche Stadt hat eine berühmte Schwebebahn?",
            "Was ist die westlichste Stadt Deutschlands?", "Wo fand die letzte EXPO in Deutschland statt?"};
        for (int i = 0; i < 5; i++) {
            ques[i]=-1;
        }
        for (int i = 0; i < 5; i++) {
            do {
                a=rd.nextInt(12);
                if (ques[0]!=a && ques[1]!=a && ques[2]!=a && ques[3]!=a && ques[4]!=a) {
                    ques[i]=a;
                }
            } while (ques[i]==-1);
        }        
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 4; k++) {
                ant[k]=-1;
            }
            System.out.println(fragen[ques[i]]);
            pos=rd.nextInt(4);
            for (int k = 0; k < 4; k++) {
                do {
                    a=rd.nextInt(12);
                    if (ant[0]!=a && ant[1]!=a && ant[2]!=a && ant[3]!=a && a!=ques[i]) {
                        ant[k]=a;
                    }
                } while (ant[k]==-1);
            }
            ant[pos]=ques[i];
            for (int k = 0; k < 4; k++) {
                temp = k+1;
                System.out.println(temp + ") " + antworten[ant[k]]);
            }
            do {
                userantwort= sc.nextInt();
                if (userantwort <1 || userantwort >4) {
                    System.out.println("Falsche Eingabe. Nochmal!");
                }
            } while (userantwort <1 || userantwort >4);
            if (ant[userantwort-1] == ques[i]) {
                System.out.println("Richtig!");
                punkte++;
            } else {
                System.out.println("Falsch!");
                System.out.println("Die richtige Antwort wäre " + antworten[ques[i]] + " gewesen.");
            }
        }
        System.out.format("Sie haben %d von 5 Fragen richtig beantwortet.%n", punkte);
    }
}
