package matrix;

import java.util.Scanner;

public class Matrix5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row");
        int M = s.nextInt();
        System.out.println("Enter column");
        int N = s.nextInt();
        System.out.println("Enter D");
        double D = s.nextDouble();
        double[] sequence = new double[M];
        System.out.println("Enter " + M + " real numbers: ");

        for (int i = 0; i < M; i++) {
            sequence[i] = s.nextDouble();
        }

        double[][] matrix = new double[M][N];

        for (int i = 0; i < M; i++) {
            double value = sequence[i];
            for (int j = 0; j < N; j++) {
                matrix[i][j] = value;
                value += D;
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
