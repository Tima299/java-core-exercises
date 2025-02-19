package loop;

import java.util.Scanner;

public class For26 {
    public static void main(String[] args) {
        int N, sign = 1;
        double X, sum = 0, term;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        X = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        term = X;
        for (int i = 1; i <= N; i++) {
            sum += sign * term / (2 * i - 1);
            term *= X * X;
            sign *= -1;
        }
        System.out.println(sum);
    }
}
