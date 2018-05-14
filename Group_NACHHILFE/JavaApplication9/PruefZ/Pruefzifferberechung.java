
package PruefZ;

import java.util.*;
public class Pruefzifferberechung 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String id_card_nummer;
        boolean korrekt = false;
        
        System.out.print("ID-Card-Nummer eingeben: ");
        id_card_nummer = sc.nextLine();
        
        korrekt = pruefID(id_card_nummer);
        
        if (korrekt)
            System.out.println("ID-Card_nummer "+id_card_nummer+" ist korrekt");
        else
            System.out.println("ID-Card-Nummer "+id_card_nummer+" nicht korrekt");
        
    }
    public static boolean pruefID(String id)
    {
        int sum  = 0;
        int sum2 = 0;
        int anzahlZiffern = id.length();
        int ziffer;
        char stelle;
        
        for (int i=0; i < anzahlZiffern - 2; i++)
        {
            stelle = id.charAt(i);
            ziffer = stelle - '0'; // Ziffernwert aus Ziffernzeichen gewinnen
            if (i % 2 == 0)
            {
                ziffer *= 2;
                if (ziffer > 9)
                    ziffer = ziffer - 9;
            }
            sum += ziffer;
        }
        
        sum2 = sum;
        if (sum % 10 != 0)
            sum2 = sum + 10 - sum%10;
        
        stelle = id.charAt(anzahlZiffern - 1);
        ziffer = stelle - '0';
        
        return ((sum2 - sum) == ziffer);
        
    }
    
}
