package strings;

import java.util.Scanner;

public class String24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.nextLine().trim();
        int count = 0, sum = 0;
        for (int i = str.length()-1; i > -1; i--) {
            if (str.charAt(i) == '1') {
                sum += Math.pow(2, count);
            } else if (str.charAt(i) == '0') {
            }else{
                System.out.println("You got some error!");
                return;
            }
                count++;
        }
        System.out.println("Result is " + sum);
    }
}
