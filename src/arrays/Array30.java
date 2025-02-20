package arrays;

import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        String str = "";
        int count = 0 ;
        System.out.println("Enter the bound:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                str+=i+1 + " ";
                count++;
            }
        }
        System.out.println(str.trim());
        System.out.println("Total count: "+count);
    }
}
