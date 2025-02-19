package arrays;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
