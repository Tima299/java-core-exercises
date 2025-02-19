package arrays;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double A = sc.nextDouble(), R = sc.nextDouble();
        double[] arr = new double[N];
        arr[0] = A;
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] * R;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
