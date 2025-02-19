package loop;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        int N;
        double factorial = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
