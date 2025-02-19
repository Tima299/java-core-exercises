package loop;

import java.util.Scanner;

public class For22 {
    public static void main(String[] args) {
        int N;
        double X, sum = 1, term = 1, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        X = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            fact *= i;
            term *= X;
            sum += term / fact;
        }
        System.out.println(sum);
    }
}
