package loop;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumSquares = 0, A, B;
        System.out.println("Enter A");
        A = sc.nextInt();
        System.out.println("Enter B");
        B = sc.nextInt();
        for (int i = A; i <= B; i++) {
            sumSquares += i * i;
        }
        System.out.println(sumSquares);
    }
}
