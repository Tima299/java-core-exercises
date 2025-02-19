package loop;

import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        int N;
        double sum = 1, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            fact *= i;
            sum += 1 / fact;
        }
        System.out.println(sum);
    }
}
