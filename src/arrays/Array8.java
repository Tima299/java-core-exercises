package arrays;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                K++;
            }
        }
        System.out.println("\n" + K);
    }
}
