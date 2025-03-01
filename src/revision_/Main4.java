package revision_;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Result ->  " + digitSquare(s));
    }
    private static int digitSquare(String s) {
        int sum = 0;
        int pow = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                pow = (int) Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), 2);
                sum += pow;
            }
        }
        return sum;
    }
}
