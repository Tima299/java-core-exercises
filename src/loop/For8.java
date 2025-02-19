package loop;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        int A, B;
        System.out.println("Enter A");
        A = sc.nextInt();
        System.out.println("Enter B");
        B = sc.nextInt();
        for (int i = A; i <= B; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
