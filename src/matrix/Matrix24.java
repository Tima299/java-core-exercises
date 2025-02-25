package matrix;

import java.util.Scanner;

public class Matrix24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();

        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (int) (Math.round(Math.random() * 10));
            }
        }
        System.out.println("Generated Matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nExpected");

        for (int j = 0; j < N; j++) {
            int max = arr[0][j];
            for (int i = 0; i < M; i++) {
                max = Math.max(max, arr[i][j]);
            }
            System.out.println("Max element is " + max);
        }
    }
}
