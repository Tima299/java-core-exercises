package revision_;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
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
                array[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Generated Array: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                if (!((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))) {
                    sb.append(array[i][j]).append(" ");
                }
            }
        }
        System.out.println("Result: ");
        System.out.println(sb);
    }
}
