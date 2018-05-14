package zweidimensionale;
import java.util.Scanner;
public class ZweiDimensionale_ArrayLaengeSelberEingeben {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // bunun cevabi d3.pdf
        
        
        
       String filiale = "";
       
       int [][] rewe = {{25,30,12,31,22,24,19,25,16,23,33,40}, {42,12,25,84,23,22,12,65,125,23,44,95}, {70,33,51,25,26,44,85,24,123,25,66,201}};
        System.out.println("Umsätze unserer drei Rewe-Filialen in 2016 in tausend\n25 bedeutet also 25.000");
        Scanner eingabe=new Scanner(System.in);
        System.out.println("Welche Filiale interessiert Sie (1,2 oder 3 ? :");
        int filNr=eingabe.nextInt();
        
        switch(filNr){
            case 1:
                filNr=filNr-1;
                filiale="Nürnberg";
                break;
            case 2:
                filNr=filNr-1;
                filiale="";
        }
        
    }
    
}
