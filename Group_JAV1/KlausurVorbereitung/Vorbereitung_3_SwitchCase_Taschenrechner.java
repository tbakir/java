/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausurvorbereitung;
import java.util.Scanner;
public class Vorbereitung_3_SwitchCase_Taschenrechner {
    public static void main(String[] args) {
        int erg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Zahl ein");
        int a = sc.nextInt();
        System.out.println("Bitte geben Sie Rechenverfahren (+,-,*,/) ");
        String op = sc.next();
        char rechenverfahren = op.charAt(0);        // nimmt nur erste zeichen also i'nin 0 posisyonu
        System.out.println("Gewähltes Rechenverfahren: "+ rechenverfahren);
        System.out.println("Bitte geben Sie eine weitere Zahl ein:");
        int b = sc.nextInt();
        
        switch(rechenverfahren) {
            case '+':
                erg = a+b;
                System.out.println(a + " " + rechenverfahren + " " + b + " = " + erg);
                break;
            case '-':
                erg = a - b;
                System.out.println(a + " " + rechenverfahren + " " + b + " = " + erg);
                break;
            case '*':
                erg = a * b;
                System.out.println(a + " " + rechenverfahren + " " + b + " = " + erg);
                break;
            case '/':
                erg = a / b;
                System.out.println(a + " " + rechenverfahren + " " + b + " = " + erg);
        }
        sc.close();
    }
    
}
