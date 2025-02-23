package strings;

import java.util.Scanner;

public class String20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        String str = s.nextLine().trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i) + " ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
