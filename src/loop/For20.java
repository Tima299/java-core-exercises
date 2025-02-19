package loop;

import java.util.Scanner;

public class For20 {
    public static void main(String[] args) {
        int N;
        double sum = 0.0, factorial = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            factorial *= i;
            sum += factorial;
        }
        System.out.println(sum);
    }
}
