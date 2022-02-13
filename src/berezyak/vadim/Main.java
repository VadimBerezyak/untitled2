package berezyak.vadim;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int min = 0;
        if(a<b){
            min = a;
            System.out.println("Minimum = " + min);
        } else if(a>b){
            min = b;
            System.out.println("Minimum = " + min);
        } else {
            System.out.println("Numbers are equal: " + a +" = "+b);
        }
    }

}
