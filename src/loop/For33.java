package loop;

import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        int N, a = 1, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= N; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
