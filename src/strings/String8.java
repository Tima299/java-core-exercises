package strings;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char C = scanner.next().charAt(0);

        String result = String.valueOf(C).repeat(N);
        System.out.println(result);
    }
}
