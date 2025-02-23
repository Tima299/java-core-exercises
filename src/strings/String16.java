package strings;

import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = s.nextLine();
        StringBuilder lowerCase = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ((c >= 'A' && c <= 'Z')) {
                c = Character.toLowerCase(string.charAt(i));
            }
            lowerCase.append(c);
        }
        System.out.println(lowerCase);
    }
}
