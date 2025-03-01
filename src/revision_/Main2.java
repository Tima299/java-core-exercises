package revision_;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Number must be positive! Otherwise, you may get some errors, Please Retry!");
            return;
        }
        System.out.println(factorial(a));
    }
    private static int factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }
}
