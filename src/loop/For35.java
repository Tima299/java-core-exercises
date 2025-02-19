package loop;

import java.util.Scanner;

public class For35 {
    public static void main(String[] args) {
        int N, K, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        System.out.println("Enter K");
        K = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, K);
        }
        System.out.println(sum);
    }
}
