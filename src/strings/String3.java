package strings;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char C = scanner.next().charAt(0);
        System.out.println("Left side : " + (int) (C - 1) + " -> " + (char) (C - 1));
        System.out.println("Chosen : " + (int) C + " -> " + (char) (C));
        System.out.println("Right side : " + (int) (C + 1) + " -> " + (char) (C + 1));
    }
}
