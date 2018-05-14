
public class A6 {

    public static void main(String[] args) {
        int a = 7;
        int b = 12;
        int c = -34;
        int d = 19;
        int f;

        f = ++d % --a + 3*d++ / (++c + 37) * ++b;         
        System.out.println("a = "+a+"b = "+b+"c = "+c+"d = "+d+"f ="+f);

    }

}
