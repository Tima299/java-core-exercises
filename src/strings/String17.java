package strings;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = s.nextLine();
        StringBuilder upperCase = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ((c >= 'a' && c <= 'z')) {
                c = Character.toUpperCase(string.charAt(i));
            }
            upperCase.append(c);
        }
        System.out.println(upperCase);
    }
}
