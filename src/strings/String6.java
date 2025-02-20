package strings;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char C = scanner.next().charAt(0);

        if (C >= '0' && C <= '9') {
            System.out.println("digit");
        } else if (C >= 'A' && C <= 'Z') {
            System.out.println("capital");
        } else {
            System.out.println("small");
        }
    }
}
