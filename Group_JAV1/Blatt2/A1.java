package blatt2;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
      int tore1=0;
      int tore2=0;
      Scanner eingabe=new Scanner(System.in);
        System.out.println("Wieviele Tore hat Gegner?");              
      int toregegner=eingabe.nextInt();
        
        System.out.println("Wieviele Tore hat Home?");
      int torehome=eingabe.nextInt();      

      if (torehome>toregegner+9) {
          System.out.println("Home 10 mehr Tore geschossen! Singen!");
       }  else {
          System.out.println("nicht singen");
      }}}