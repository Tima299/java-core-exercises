package strings;

import java.util.Scanner;

public class String31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S0:");
        String S0 = s.nextLine();

        boolean result = S.contains(S0);
        System.out.println(result);
    }
}
