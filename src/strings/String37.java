package strings;

import java.util.Scanner;

public class String37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S1:");
        String S1 = s.nextLine();
        System.out.println("Enter S2:");
        String S2 = s.nextLine();
        int lastIndex = S.lastIndexOf(S1);
        if (lastIndex != -1) {
            S = S.substring(0, lastIndex) +S2 + S.substring(lastIndex + S1.length());
        }
        System.out.println(S);
    }
}
