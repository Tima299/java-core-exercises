package strings;

import java.util.Scanner;

public class String34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S0:");
        String S0 = s.nextLine();
        int lastIndex = S.lastIndexOf(S0);
        if (lastIndex != -1) {
            S = S.substring(0, lastIndex) + S.substring(lastIndex + S0.length());
        }
        System.out.println(S);
    }
}
