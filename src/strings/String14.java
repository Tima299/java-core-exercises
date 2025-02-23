package strings;

import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = s.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                count++;
            }
        }
        System.out.println("There is/are " + count + " LATIN CAPITAL LETTER(s) total");
    }
}
