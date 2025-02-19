package loop;

import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        double A, power = 1.0;
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        A = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            power *= A;
            System.out.println(power);
        }
    }
}
