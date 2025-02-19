package loop;

import java.util.Scanner;

public class For28 {
    public static void main(String[] args) {
        int N, sign = 1;
        double X, sum = 1, term, num = 1, den = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        X = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        term = X;
        for (int i = 1; i <= N; i++) {
            num *= (2 * i - 3);
            den *= (2 * i);
            sign *= -1;
            sum += sign * num * term / den;
            term *= X;
        }
        System.out.println(sum);
    }
}
