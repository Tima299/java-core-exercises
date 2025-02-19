package loop;

import java.util.Scanner;

public class For23 {
    public static void main(String[] args) {
        int N, sign = 1;
        double X, sum = 0, term, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        X = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        term = X;
        for (int i = 1; i <= N; i++) {
            fact *= (2 * i - 1);
            sum += sign * term / fact;
            term *= X * X;
            sign *= -1;
        }
        System.out.println(sum);
    }
}
