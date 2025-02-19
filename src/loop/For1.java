package loop;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        int N, K;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K");
        K = sc.nextInt();
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print(K + " ");
        }
    }
}
