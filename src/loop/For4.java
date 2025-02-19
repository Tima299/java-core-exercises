package loop;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price;
        System.out.println("Enter price per kg");
        price = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * price);
        }
    }
}
