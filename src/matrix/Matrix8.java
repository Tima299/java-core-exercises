package matrix;

import java.util.Scanner;

public class Matrix8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();
        System.out.println("Enter K");
        int K = sc.nextInt();
        if (K < 1 || K > M) {
            System.out.println("Invalid Range!");
            return;
        }
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (int) (Math.round(Math.random() * 100 - 1));
            }
        }
        System.out.println("Generated Matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nExpected Output:");
        for (int i = 0; i < M; i++) {
            System.out.println(arr[i][K-1] + "\t");
        }
        System.out.println();
    }
}
