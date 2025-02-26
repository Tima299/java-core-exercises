package matrix;

import java.util.Scanner;

public class Matrix35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();

        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (int) (Math.random() * 21 - 10);
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
        int firstColumnIndex = -1;
        for (int j = 0; j < N; j++) {
            boolean allOdd = true;
            for (int i = 0; i < M; i++) {
                if (arr[i][j] % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) {
                firstColumnIndex = j + 1;
                break;
            }
        }
        System.out.println("Result = " + firstColumnIndex);
    }
}
