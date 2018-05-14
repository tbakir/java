
package beispiele;
public class ArryBsp1 {
    public static void main(String[] args) {
        int[] zahlen ={5,0,3,8,1,5};
        System.out.println("Arraylänge:" + zahlen.length);
        int i=0;
        while (i<zahlen.length){
            System.out.println("i: " + i + " hat den Wert " + zahlen[i]);
            i++;
        }
    }
    
}
