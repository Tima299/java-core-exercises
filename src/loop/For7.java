package loop;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, sum = 0;
        System.out.println("Enter A");
        A = sc.nextInt();
        System.out.println("Enter B");
        B = sc.nextInt();
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
