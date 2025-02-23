package strings;

import java.util.Scanner;

public class String19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = s.nextLine().trim();
        try {
            if (str.contains(".")) {
                double num = Double.parseDouble(str);
                System.out.println(num == (int) num ? 0 : 2);
            } else {
                Integer.parseInt(str);
                System.out.println(1);
            }
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}
