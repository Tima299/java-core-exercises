package strings;

import java.util.Scanner;

public class String32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S0:");
        String S0 = s.nextLine();

        int count = 0;
        for (int i = 0; i <= S.length() - S0.length(); i++) {
            if (S.substring(i, i + S0.length()).equals(S0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
