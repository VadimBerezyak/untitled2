package berezyak.vadim;
//Написать программу, которая описывает введенное число.
//  Отрицательное оно число или положительное (или нулевое),
//  чётное или нечётное.

public class Main1 {
    public static void main(String[] args) {
        int number = -7;
        if(number>0){
            switch (number%2){
                case 0:
                    System.out.println("Number is positive and even!");
                    break;
                case 1:
                    System.out.println("Number is positive and odd!");
                default:
                        System.out.println("error");
            }

        }else if(number<0){
            switch (number%2){
                case 0:
                    System.out.println("Number is negative and even!");
                    break;
                case -1:
                    System.out.println("Number is negative and odd!");
                    break;
                default:
                    System.out.println("error");
            }

        } else{
            System.out.println("Number is zero");
        }
    }
}
