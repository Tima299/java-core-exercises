package strings;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        int N = scanner.nextInt();
        for (int i = 122; i > 122 - N; i--) {
            System.out.print((char) i + " ");
        }
    }
}
