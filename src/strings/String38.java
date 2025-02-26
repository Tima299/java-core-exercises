package strings;

import java.util.Scanner;

public class String38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter S:");
        String S = s.nextLine();
        System.out.println("Enter S1:");
        String S1 = s.nextLine();
        System.out.println("Enter S2:");
        String S2 = s.nextLine();
        if (S.contains(S1)) {
            S = S.replaceAll(S1, S2);
        }
        System.out.println(S);
    }
}
