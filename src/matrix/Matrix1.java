package matrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Raw # (M)");
        int M = sc.nextInt();
        System.out.println("Enter Columns # (N)");
        int N = sc.nextInt();

        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            int value = 10*(i+1);
            for (int j = 0; j < N; j++) {
                arr[i][j] = value;
            }
            System.out.println();
        }
        System.out.println("Generated matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
