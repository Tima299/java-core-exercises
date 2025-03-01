package revision;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();
        int[][] array = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Generated Array: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Solution: ");
        int[] arr = new int[N];
        for (int j = 0; j < N; j++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < M; i++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            int diff = max - min;
            arr[j] = diff;
            System.out.println("Column = " + j + ", Max = " + max + ", Min = " + min + ", diff = " + diff);
        }
        System.out.println("Asked 1D array: ");
        System.out.println(Arrays.toString(arr));
    }
}
