package arrays;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        int[] arr = new int[N];
        arr[0] = A;
        arr[1] = B;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
