package strings;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = s.nextInt();
        if(N<32 || N>126){
            System.out.println("Invalid input!");
            return;
        }
        System.out.println("Result : " + (char) N);
    }
}
