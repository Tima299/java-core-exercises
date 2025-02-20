package strings;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char C1 = scanner.next().charAt(0);
        char C2 = scanner.next().charAt(0);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(i % 2 == 0 ? C1 : C2);
        }
        System.out.println(result);
    }
}
