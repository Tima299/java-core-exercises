package loop;

import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        int N, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            sum += 2 * i - 1;
            System.out.println(sum);
        }
    }
}
