package strings;

import java.util.Scanner;

public class String39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();

        int firstSpace = S.indexOf(' ');
        int secondSpace = S.indexOf(' ', firstSpace + 1);

        if (firstSpace != -1 && secondSpace != -1) {
            System.out.println(S.substring(firstSpace + 1, secondSpace));
        } else {
            System.out.println("");
        }
    }
}
