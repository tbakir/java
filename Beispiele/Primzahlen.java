package beispiele;
public class Primzahlen {
    public static void main(String[] args) {
        int max = 100;
        int [] prime = new int [max+1];
        for (int i = 0; i < max+1; i++) {
            prime[i]=i;
        }
        prime[1]=0;
        for (int i = 2; i < max/2; i++) {
            if (prime[i]!=0) {
                for (int j = i*2; j < max+1; j=j+i) {
                    prime[j]=0;
                }
            }
        }
        for (int i = 0; i < max+1; i++) {
            if (prime[i]!=0) {
                System.out.println(prime[i]);
            }
        }
    }
}
