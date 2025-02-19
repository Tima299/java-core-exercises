package loop;

import java.util.Scanner;

public class For32 {
    public static void main(String[] args) {
        int N;
        double A = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            A = (A + 1) / i;
            System.out.print(A + " ");
        }
    }
}
