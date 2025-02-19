package loop;

import java.util.Scanner;

public class For30 {
    public static void main(String[] args) {
        int N;
        double A, B, H;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        A = sc.nextDouble();
        System.out.println("Enter B");
        B = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        H = (B - A) / N;
        System.out.println("H: " + H);
        for (int i = 0; i <= N; i++) {
            System.out.print(1 - Math.sin(A + i * H) + " ");
        }
    }
}
