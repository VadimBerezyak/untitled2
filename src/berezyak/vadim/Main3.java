package berezyak.vadim;

public class Main3 {
    public static void main(String[] args) {
        int a1 = 1; // arithmetic progression
        int d = 5;
        int n = 10;
        System.out.println("Arithmetic progression:");
        for (int i = 1; i <= n ; i++) {
            System.out.println("a" + i + " = " + a1 );
            a1 = a1 + d;
        }

        int b1 = 2; // geometric progression
        int q = 2;
        int m = 10;
        System.out.println("Geometric progression:");
        for (int j = 1; j <= m ; j++) {
            System.out.println("b" + j + " = " + b1 );
            b1 = b1 * 2;
        }

    }
}
