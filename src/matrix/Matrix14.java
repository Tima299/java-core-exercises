package matrix;

import java.util.Scanner;

public class Matrix14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        int[][] arr = new int[M][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Generated Matrix");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        System.out.println("\nExpected");
        int top = 0, bottom = M - 1, left = 0, right = M - 1;
        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][left] + "\t");
            }
            left++;

            for (int j = left; j <= right; j++) {
                System.out.print(arr[bottom][j] + "\t");
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][right] + "\t");
                }
                right--;
            }

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[top][j] + "\t");
                }
                top++;
            }
        }
    }
}
