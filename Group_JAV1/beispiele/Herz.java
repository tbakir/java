package beispiele;


public class Herz {

    public static void main(String[] args) throws InterruptedException{
 
        for (int z=0;z<5;z++){
            System.out.print("\r"); // zum leeren der Anzeige
            String x="♥";
            for (int i=0;i<3;i++){
                System.out.print(x); 
                Thread.sleep(1000);
                x=x+x;
            }
         }   
        System.out.println("\nFettisch");
    }
}
