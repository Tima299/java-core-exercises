package matrix;

import java.util.Scanner;

public class Matrix33 {
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
int lastColIndex = -1;
        for (int j = 0; j < N; j++) {
            int countN = 0, countP = 0;
            for (int i = 0; i < M; i++) {
                if (arr[i][j] < 0) countN++;
                else if (arr[i][j] > 0) countP++;
            }
            if (countN == countP) {
                lastColIndex = j+1;
            }
        }
        if (lastColIndex != -1) {
            System.out.println("Last column with equal positive and negative elements: " + lastColIndex);
        } else {
            System.out.println("0");
        }
    }
}
