package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array33 {
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
            System.out.println("No local maximum exists for array size < 3");
            return;
        }
        for (int i = size - 2 ; i > 0 ; i--) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println("Last local maximum index: " + i);
                return;
            }
        }
        System.out.println("No local maximum found.");
    }
}
