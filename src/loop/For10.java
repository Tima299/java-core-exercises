package loop;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        double harmonicSum = 0;
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            harmonicSum += 1.0 / i;
        }
        System.out.println(harmonicSum);
    }
}
