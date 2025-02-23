package strings;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Enter an integer N (> 0)");
        int n = sc.nextInt();

        String separator = "*".repeat(n);
        System.out.println(String.join(separator, s.split("")));
    }
}
