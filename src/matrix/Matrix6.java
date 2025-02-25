package matrix;

import java.util.Scanner;

public class Matrix6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row");
        int M = s.nextInt();
        System.out.println("Enter column");
        int N = s.nextInt();
        System.out.println("Enter R");
        double R = s.nextDouble();
        double[][] matrix = new double[M][N];
        System.out.println("Enter " + N + " real numbers: ");
        for (int j = 0; j < N; j++) {
            matrix[0][j] = s.nextDouble();
        }
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N ; j++) {
                matrix[i][j] = matrix[i-1][j] * R;
            }

        }
        System.out.println("Generated Matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
