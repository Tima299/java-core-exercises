package strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a char");
        char C = s.next().charAt(0);
        System.out.println((int) C);
    }
}
