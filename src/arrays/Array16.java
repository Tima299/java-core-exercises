package arrays;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextDouble();
        }
        for (int i = 0, j = N - 1; i <= j; i++, j--) {
            System.out.print(A[i] + " ");
            if (i != j) {
                System.out.print(A[j] + " ");
            }
        }
    }
}
