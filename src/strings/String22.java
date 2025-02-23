package strings;

import java.util.Scanner;

public class String22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        String str = s.nextLine().trim();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
           /* int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += temp;*/
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
