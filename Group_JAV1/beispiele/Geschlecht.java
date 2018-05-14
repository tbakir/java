
package beispiele;

import java.util.Scanner;

public class Geschlecht {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String Name;
        int Geschlecht;
        Scanner eingabe;
        
       
        eingabe=new Scanner(System.in);
        
        System.out.println("Bitte eine Name eingeben!");
        Name=eingabe.next();
        System.out.println("Bitte ein Geschlecht eingeben!");
        Geschlecht=eingabe.nextInt();
        
        //System.out.println(Name);
        //System.out.println(Geschlecht);
        if (Geschlecht==1){
            System.out.format("Hallo Herr %s",Name);
        } else if (Geschlecht==2){
            System.out.format("Hallo Frau %s",Name);
        } else {
            System.out.format("Hallo %s, Du bist Doof",Name);
        }
        
    }
    
}
