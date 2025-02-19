package arrays;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] F = new int[N];
        F[0] = F[1] = 1;
        for (int i = 2; i < N; i++) {
            F[i] = F[i - 2] + F[i - 1];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(F[i] + " ");
        }
    }
}
