package arrays;

import java.sql.SQLOutput;

public class Array19 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random() * 100) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int last = arr[9];
        int first = arr[0];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (first < arr[i] && arr[i] < last) {
                result = i + 1;
            }
        }
        System.out.println("\nResult is " + result);
    }
}
