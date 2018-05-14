package Klausur_JAV1;
public class A8_3malHintereinander {
    public static void main(String[] args) 
    {
        int[] Garry={4,7,1,2};
	int j=0;
	int i=0;
        
        
        int[] Carry = new int[3*Garry.length];
        for (i=0; i<Carry.length; i++) {
            Carry[i] = Garry[i%Garry.length];
            
        }        
    }
}
