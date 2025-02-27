package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Generated Array is " + Arrays.toString(arr));
        if (size < 2) {
            System.out.println("We can not say anything on it");
            return;
        }
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i ] > arr[i + 1]) {
                if (!flag) {
                    count++;
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        System.out.println("Number of descending parts: " + count);
    }
}
