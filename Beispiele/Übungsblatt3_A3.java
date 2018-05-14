package beispiele;
import java.util.Scanner;
public class Übungsblatt3_A3 {
    public static void main(String[] args) {
        int operand1, operand2, erg;
        String operator;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Operand1:");
        operand1 = eingabe.nextInt();
        System.out.println("Operand2:");
        operand2 = eingabe.nextInt();
        System.out.println("Operator:");
        operator = eingabe.next();
        switch (operator) {
            case "+":
                erg = operand1 +  operand2;
                System.out.format("%d %s %d = %d\n",operand1, operator, operand2, erg);
                break;
            case "-":
                erg = operand1 -  operand2;
                System.out.format("%d %s %d = %d\n",operand1, operator, operand2, erg);
                break;
            case "*":
                erg = operand1 *  operand2;
                System.out.format("%d %s %d = %d\n",operand1, operator, operand2, erg);
                break;
            case "/":
                if (operand2 != 0) {
                    erg = operand1 / operand2;
                    System.out.format("%d %s %d = %d\n",operand1, operator, operand2, erg);                    
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                }
                break;
            default: 
                System.out.println("Falscher Operator");
        }
    }
}
