package beispiele;

import java.util.Scanner;

public class ArryBsp1111 {

    public static void main(String[] args) {
        int x = 0;
        Scanner eingabe=new Scanner(System.in);
        System.out.println("Bitte geben Sie ein ganze Zahl ein!");
        x = eingabe.nextInt();
        int [] Erray = new int[x];
        System.out.println("Erray beteht aus  " + Erray.length + " Elementen");
        int [] Orray = new int [Erray.length*2];
        System.out.println("Orrey besteht aus " + Orray.length + " Elementen");
        }

    }

}
