package strings;

import java.util.Scanner;

public class String26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = Integer.parseInt(s.nextLine().trim());
        System.out.println("Enter S: ");
        String str = s.nextLine().trim();
        if (str.length() > n) {
            str = str.substring(str.length() - n);
        } else {
            while (str.length() < n) {
                str = "." + str;
            }
        }
        System.out.println(str);
    }
}
