
package Sortieren;

import adress_verwaltung.*;
public class MySort_2 
{
    public static void main(String[] args) 
    {
        Adressen var1 = new Adressen("Huber","Hans",90477,"Nuernberg","Weg 10");
        Adressen var2 = new Adressen("Mueller","Franz",90567,"Nuernberg","Platz 17");
        
        System.out.println(var1.toString());
        System.out.println(var2.toString());
        
        if (var1.compareTo(var2) < 0)
            System.out.println("Erste Adresse ist kleiner als zweite)");
        else
            System.out.println("Zweite Adresse ist kleiner als erste");
    }
   
}
