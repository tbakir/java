package beispiele;

import java.util.Scanner;

public class ArryBsp111 {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        int[] Arrayname;
        Arrayname = new int[5];
        

        for (int i = 0; i < Arrayname.length; i++) {
            System.out.println("Bitte geben Sie ein ganze Zahl ein! ");
            Arrayname[i] = eingabe.nextInt();
            System.out.println(i + " ***Inhalt*** " + Arrayname[i]);
        }
        System.out.println("Eingaben beenden");
        for (int i=0; i<Arrayname.length; i++) {
            System.out.println("Inhalt von Arrayynmae an Index: " + i + " ist  -->  " + Arrayname[i]);
        }

    }

}
