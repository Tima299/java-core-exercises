package loop;

import java.util.Scanner;

public class For34 {
    public static void main(String[] args) {
        int N, a = 1, b = 2, c = 3, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= N; i++) {
            d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}
