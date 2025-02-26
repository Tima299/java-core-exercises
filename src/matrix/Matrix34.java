package matrix;

import java.util.Scanner;

public class Matrix34 {
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
        int lastRowIndex = -1;
        for (int i = 0; i < M; i++) {
            boolean allEven = true;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                lastRowIndex = i + 1;
            }
        }
        System.out.println("Result = " + (lastRowIndex != -1 ? lastRowIndex : 0));
    }
}
