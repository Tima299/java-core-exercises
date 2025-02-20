package arrays;

import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        int MIN = Integer.MAX_VALUE;
        System.out.println("Enter the bound:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 1; i < N; i+=2) {
                MIN = Math.min(arr[i], MIN);
        }
        System.out.println(MIN == Integer.MAX_VALUE ? "Error!!!" : MIN);
    }
}
