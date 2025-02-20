package arrays;

import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        System.out.println("Enter the bound:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] * arr[i] > 0) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}
