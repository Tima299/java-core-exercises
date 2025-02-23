package strings;

import java.util.Scanner;

public class String27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter N1: ");
        int n1 = Integer.parseInt(s.nextLine().trim());
        System.out.println("Enter S1: ");
        String s1 = s.nextLine().trim();

        System.out.println("Enter N2: ");
        int n2 = Integer.parseInt(s.nextLine().trim());
        System.out.println("Enter S2: ");
        String s2 = s.nextLine().trim();

        String part1 = s1.substring(0, Math.min(n1, s1.length()));
        String part2 = s2.substring(Math.max(0, s2.length() - n2));
        System.out.println(part1 + part2);
    }
}
