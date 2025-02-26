package strings;

import java.util.Scanner;

public class String35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S0:");
        String S0 = s.nextLine();
        if (S.contains(S0)) {
            S = S.replaceAll(S0, "");
        }
        System.out.println(S);
    }
}
