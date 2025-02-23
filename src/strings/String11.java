package strings;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        if(s.isEmpty()){
            System.out.println("Your string is Empty, Retry!");
            return;
        }
        /*for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if(i < s.length() - 1){
                System.out.print(" ");
            }
        }*/
        System.out.println(String.join(" ", s.split("")));
    }
}
