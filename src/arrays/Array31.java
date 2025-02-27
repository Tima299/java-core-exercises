package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Generated Array is " + Arrays.toString(arr));
        int count = 0;
        String result = "";
        for (int i = size - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                result += i + " ";
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Indices in descending order : " + result.trim());
            System.out.println("Total count: " + count);
        } else {
            System.out.println("No such elements found");
        }
    }
}
