package arrays;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextDouble();
        }
        for (int i = 1; i < N; i += 2) {
            System.out.print(A[i] + " ");
        }
        for (int i = 0; i < N; i += 2) {
            System.out.print(A[i] + " ");
        }
    }
}
