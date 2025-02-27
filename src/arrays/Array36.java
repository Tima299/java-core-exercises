package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Generated Array is " + Arrays.toString(arr));
        if (size < 3) {
            System.out.println("No local minimum exists for array size < 3");
            return;
        }
        int max = Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                found = true;
            }
        }
        if (found) {
            System.out.println("Maximum: " + max);
        } else {
            System.out.println("No local maximum found.");
        }
    }
}
