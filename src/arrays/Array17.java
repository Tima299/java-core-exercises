package arrays;

import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextDouble();
        }
        for (int i = 0, j = 1, k = N - 1; j < k; i += 2, j += 2, k -= 2) {
            System.out.print(A[i] + " " + A[j] + " " + A[k] + " " + A[k - 1] + " ");
        }
        if (N % 4 == 1) {
            System.out.print(A[N / 2]);
        }
        if (N % 4 == 3) {
            System.out.print(A[N / 2] + " " + A[N / 2 + 1]);
        }
    }
}
