
package klausurvorbereitung;
public class Vorbereitung_4_1_min_max {
    public static void main(String[] args) {
        // Da findest du kleinste und größte Zahlen
             int [] ZweiOderNichtZwei = {2,3,2,5,6,2,7,1,2,6,8};
             int i = 0;                              // Zähler
             int laenge = ZweiOderNichtZwei.length;
             int min = ZweiOderNichtZwei[i];        // i ist nicht null gesetzt sondern mit 2 angefangen
             while (i<laenge) {
                 if (ZweiOderNichtZwei[i] < min) {
                     min=ZweiOderNichtZwei[i];
                 }
                 //if (ZweiOderNichtZwei[i]>max){
                 //    max=ZweiOderNichtZwei[i];
                 //}
                 
                
               i=i+1;
              }
             System.out.println("Die Kleinste Zahl im Array ist die " + min);
     
        }
    }
