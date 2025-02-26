package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();

        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (int) (Math.random() * 101);
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
        int count = 0;
        int[] lastColumn = new int[M];

        for (int i = 0; i < M; i++) {
            lastColumn[i] = arr[i][N - 1];
        }
        Arrays.sort(lastColumn);

        for (int j = 0; j < N - 1; j++) {
            int[] column = new int[M];
            for (int i = 0; i < M; i++) {
                column[i] = arr[i][j];
            }
            Arrays.sort(column);
            if (Arrays.equals(column, lastColumn)) {
                count++;
            }
        }

        System.out.println("Number of similar columns: " + count);
    }
}
