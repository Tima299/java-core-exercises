package strings;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to count digits: ");
        String string = s.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            /*if (string.charAt(i) == '0' || string.charAt(i) == '1' ||
                    string.charAt(i) == '2' || string.charAt(i) == '3' ||
                    string.charAt(i) == '4' || string.charAt(i) == '5' ||
                    string.charAt(i) == '6' || string.charAt(i) == '7' ||
                    string.charAt(i) == '8' || string.charAt(i) == '9') {
                count++;
            }*/
            if(Character.isDigit(string.charAt(i))){
                count++;
            }
        }
        System.out.println("There is/are " + count + " digit(s) total");
    }
}
