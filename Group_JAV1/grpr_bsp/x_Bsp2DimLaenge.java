package grpr_bsp;
import java.util.Scanner;
public class x_Bsp2DimLaenge {
        
    public static void main(String[] args) {
       
      //2DimAray
        Scanner eingabe =new Scanner(System.in);
        int i=0,j=0;
        System.out.println("Bitte geben Sie die Anzahl Zeilen ein.");
        i=eingabe.nextInt();
        System.out.println("Bitte geben Sie die Anzahl Spalten pro Zeile ein.");
        j=eingabe.nextInt();
        int meineZahl=2;
        int [][] Bsp2A = new int [i][j] ;
        for(  i = 0; i < Bsp2A.length; i++){
 
            for(  j = 0; j <  Bsp2A[i].length; j++)
            {
                meineZahl=meineZahl*2;
                    Bsp2A[i][j]=meineZahl;
                    
            }

           
        }
               System.out.println("*******");
       for(  i = 0; i < Bsp2A.length; i++){
           System.out.println("");
            for(  j = 0; j <  Bsp2A[i].length; j++)
            {
                System.out.print(Bsp2A[i][j] + " ");
 
                    
            }

           System.out.println("");
        }
    }
}    
       