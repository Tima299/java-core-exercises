package strings;

import java.util.Scanner;

public class String33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S0:");
        String S0 = s.nextLine();
        if (S.contains(S0)) {
            S = S.replaceFirst(S0, "");
        }
        System.out.println(S);
    }
}
