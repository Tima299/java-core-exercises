package loop;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        A = sc.nextInt();
        System.out.println("Enter B");
        B = sc.nextInt();
        if (A >= B) {
            System.out.println("A must be less than B");
            return;
        }
        int count = 0;
        for (int i = B - 1; i > A; i--) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println("\nCount: " + count);
    }
}
