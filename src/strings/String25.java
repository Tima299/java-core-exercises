package strings;

import java.util.Scanner;

public class String25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = Integer.parseInt(s.nextLine().trim());
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        System.out.println(binary);
    }
}
