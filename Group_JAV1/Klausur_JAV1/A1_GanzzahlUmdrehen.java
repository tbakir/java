package Klausur_JAV1;
import java.util.Scanner;
public class A1_GanzzahlUmdrehen {
    public static void main(String[] args) 
    {        
        int zahl=0;
        System.out.println("Bitte geben Sie einen Ganzzahl ein");
        Scanner eingabe = new Scanner(System.in);
        zahl = eingabe.nextInt();
        
        System.out.print("Umgedrehte Zahl: ");
        while (zahl != 0){
            System.out.print(zahl%10);
            zahl = zahl/10;
        }     
    }
}
