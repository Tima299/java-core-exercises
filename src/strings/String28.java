package strings;

import java.util.Scanner;

public class String28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter C: ");
        char c = s.nextLine().trim().charAt(0);
        System.out.println("Enter S: ");
        String str = s.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            if (str.charAt(i) == c) {
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
