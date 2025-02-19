package loop;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        int N, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = N; i <= 2 * N; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
