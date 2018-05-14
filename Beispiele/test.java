package beispiele;
public class test {
    public static void main(String[] args) {
        int [] x={10,20};
        tausche(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
    }
    public static int [] tausche(int [] x) {
        int c=x[0];
        x[0]=x[1];
        x[1]=c;
        return x;
    }
}
