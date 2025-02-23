package strings;

import java.util.Scanner;

public class String19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str = s.nextLine().trim();

        if (str.matches("[+-]?\\d+")) {
            System.out.println(1);
        } else if (str.matches("[+-]?\\d+\\.\\d*[1-9]")) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
