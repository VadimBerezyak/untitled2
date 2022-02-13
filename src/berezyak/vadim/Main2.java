package berezyak.vadim;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.printf("%-1d*%1d=%2d", j, i, j*i);
                System.out.print("  ");


            }
            System.out.println();

        }
    }
}
