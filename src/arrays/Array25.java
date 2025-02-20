package arrays;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        System.out.println("Enter the bound:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int g = arr[1] / arr[0];
        for (int i = 1; i < N - 1; i++) {
            if ((arr[i + 1] / arr[i]) != g || arr[i + 1] % arr[i] != 0) {
                System.out.println(0);
                return;
            }
        }
        System.out.println("Common ratio is " + g);
    }
}
