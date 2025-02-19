package loop;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price per kg");
        price = sc.nextDouble();
        for (double i = 0.1; i <= 1; i += 0.1) {
            System.out.printf("%.2f  ", i * price);
        }
    }
}
