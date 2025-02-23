package strings;

import java.util.Scanner;

public class String23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression: ");
        String str = s.nextLine().replace(" ", "").replace("-", "+-");
        int sum = 0;
        for (String num : str.split("\\+")) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num.trim());
            }
        }
        System.out.println("The result: " + sum);
    }
}
