package strings;

import java.util.Scanner;

public class String40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();

        int firstSpace = S.indexOf(' ');
        int lastSpace = S.lastIndexOf(' ');

        if (firstSpace != -1 && lastSpace != -1 && firstSpace != lastSpace) {
            System.out.println(S.substring(firstSpace + 1, lastSpace));
        } else {
            System.out.println("");
        }
    }
}
