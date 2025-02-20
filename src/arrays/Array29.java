package arrays;

import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        int MAX = Integer.MIN_VALUE;
        System.out.println("Enter the bound:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < N; i += 2) {
            MAX = Math.max(arr[i], MAX);
        }
        System.out.println(MAX == Integer.MIN_VALUE ? "Error!!!" : MAX);
    }
}
