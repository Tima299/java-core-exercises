package loop;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        int N;
        double product = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            product *= (1.0 + i / 10.0);
        }
        System.out.println(product);
    }
}
