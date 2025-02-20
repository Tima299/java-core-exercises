package strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        System.out.println("Enter a numeric value: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 65; i < 65 + N; i++) {
            System.out.print((char) i + " ");
        }
    }
}
