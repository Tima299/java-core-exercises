package arrays;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double A = sc.nextDouble(), D = sc.nextDouble();
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = A + i * D;
            System.out.print(arr[i] + " ");
        }
    }
}
