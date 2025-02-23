package strings;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = s.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                count++;
            }
        }
        System.out.println("There is/are " + count + " LATIN LETTER(s) total");
    }
}
