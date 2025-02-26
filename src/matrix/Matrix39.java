package matrix;

import java.util.Scanner;

public class Matrix39 {
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

        for (int j = 0; j < N; j++) {
            boolean isUnique = true;
            for (int i = 0; i < M - 1; i++) {
                for (int k = i + 1; k < M; k++) {
                    if (arr[i][j] == arr[k][j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique) {
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }

        System.out.println("Number of columns with all unique elements: " + count);
    }
}
