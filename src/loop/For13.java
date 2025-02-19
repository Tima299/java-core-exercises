package loop;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        int N;
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(-1, i - 1) * (1.0 + i / 10.0);
        }
        System.out.println(sum);
    }
}
