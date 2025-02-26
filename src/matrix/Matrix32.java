package matrix;

import java.util.Scanner;

public class Matrix32 {
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

        for (int i = 0; i < M; i++) {
            int countN = 0, countP = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] < 0) countN++;
                else if (arr[i][j] > 0) countP++;
            }
            if (countN == countP) {
                System.out.println("First row with equal positive and negative elements: " + (i + 1));
                return;
            }
        }
        System.out.println("0");
    }
}
