package loop;

import java.util.Scanner;

public class For27 {
    public static void main(String[] args) {
        int N;
        double X, sum = 0, term, num = 1, den = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        X = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        term = X;
        for (int i = 1; i <= N; i++) {
            num *= (2 * i - 1);
            den *= (2 * i);
            sum += num * term / (den * (2 * i + 1));
            term *= X * X;
        }
        System.out.println(sum);
    }
}

