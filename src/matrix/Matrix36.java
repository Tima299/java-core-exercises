package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix36 {
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
        int[] firstRow = Arrays.copyOf(arr[0], N);
        Arrays.sort(firstRow);

        for (int i = 1; i < M; i++) {
            int[] row = Arrays.copyOf(arr[i], N);
            Arrays.sort(row);
            if (Arrays.equals(row, firstRow)) {
                count++;
            }
        }

        System.out.println("Number of similar rows: " + count);
    }
}
