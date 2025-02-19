package loop;

import java.util.Scanner;

public class For31 {
    public static void main(String[] args) {
        int N;
        double A = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            A = 2 + 1 / A;
            System.out.print(A + " ");
        }
    }
}
