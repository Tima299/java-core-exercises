package matrix;

import java.util.Scanner;

public class Matrix31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();

        int[][] arr = new int[M][N];
        int sum = 0;
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
        double avg = (double) sum / (M * N);
        int rowIndex = 0, columnIndex = 0;
        double minDiff = Double.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                double diff = Math.abs(arr[i][j] - avg);
                if(diff <  minDiff){
                    minDiff =diff;
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }System.out.println("Element closest to the average is at row index " + rowIndex +
                " and column index " + columnIndex + " : " + arr[rowIndex][columnIndex]);
    }
}
