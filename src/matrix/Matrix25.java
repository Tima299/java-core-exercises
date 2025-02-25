package matrix;

import java.util.Scanner;

public class Matrix25 {
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
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("Row " + (maxRow + 1) + " has the maximum sum: " + maxSum);
    }
}
