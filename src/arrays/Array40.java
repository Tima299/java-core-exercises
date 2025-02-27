package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the element which is searched");
        int element = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Generated Array is " + Arrays.toString(arr));
        if (size < 2) {
            System.out.println("We can not say anything on it");
            return;
        }
        int min = Integer.MAX_VALUE;
        int nearestElement = arr[0];
        for (int i = 0; i < size; i++) {
            int diff = Math.abs(arr[i] - element);
            if (min > diff) {
                min = diff;
                nearestElement = arr[i];
            }
        }
        System.out.println("The nearest element to " + element + " is "+ nearestElement);
    }
}
