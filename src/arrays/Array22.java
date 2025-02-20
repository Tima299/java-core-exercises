package arrays;

import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the bound:");
        int N = s.nextInt();
        System.out.println("Enter K (1<=K<=L<=N) :");
        int K = s.nextInt();
        if (K > N || K < 1) {
            System.out.println("Come on K must be less than N!");
            return;
        }
        System.out.println("Enter L (1<=K<=L<=N) :");
        int L = s.nextInt();
        if (L > N || L < K) {
            System.out.println("Come on L must be in this range 1<=K<=L<=N");
            return;
        }
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random() * 100) + 1);
        }
        System.out.println("Original array's elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i < K - 1 || i >= L) {
                sum += arr[i];
            }
            /*if (isOn(i, K, L)) {
                sum += arr[i];
            }*/
        }

        System.out.println("\n Sum except from K to L : " + sum);
    }
    /*public static boolean isOn(int index, int K, int L) {
        return index < K - 1 || index >= L;  // Exclude elements in range [K, L]
    }*/
}
