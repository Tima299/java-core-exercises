package strings;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int firstCharValue = (int) str.charAt(0);
        int lastCharValue = (int) str.charAt(str.length() - 1);

        System.out.println(firstCharValue + " " + lastCharValue);
    }
}
