package matrix;

import java.util.Scanner;

public class Matrix3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row");
        int M = s.nextInt();
        System.out.println("Enter column");
        int N = s.nextInt();
        int[] sequence = new int[M];
        System.out.println("Enter " + M + " real numbers: ");
        for (int i = 0; i < M; i++) {
            sequence[i] = s.nextInt();
        }
        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sequence[i];
            }
        }
        System.out.println("Generated Matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
