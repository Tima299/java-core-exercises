package loop;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        System.out.println("Enter price per kg");
        price = sc.nextDouble();
        for (double i = 1.2; i <= 2; i += 0.2) {
            System.out.printf("%.2f  ", i * price);
        }
    }
}
