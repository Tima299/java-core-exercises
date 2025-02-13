package Boolean;
import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        System.out.println("This is Part 3, Logical expressions");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the task number to run [1-40]");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean1(A) ? "" : " not";
                    System.out.println("It is" + result + " a positive number!");
                }
                case 2 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean2(A) ? "" : " not";
                    System.out.println("It is" + result + " an odd number!");
                }
                case 3 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean3(A) ? "" : " not";
                    System.out.println("It is" + result + " an even number!");
                }
                case 4 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    String result = Boolean4(A, B) ? "" : " not";
                    System.out.println("They are " + result + " A>2 && B<=3 case fulfilled numbers!");
                }
                case 5 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    String result = Boolean5(A, B) ? "" : " not";
                    System.out.println("They are " + result + " A>=0 || B<-2 case fulfilled numbers!");
                }
                case 6 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean6(A, B, C) ? "" : " not";
                    System.out.println("They are " + result + " (double)A <(double)B && (double)B <(double)C case fulfilled numbers!");
                }
                case 7 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean7(A, B, C) ? "" : " not";
                    System.out.println("B is " + result + " between A and C");
                }
                case 8 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    String result = Boolean8(A, B) ? "" : " not";
                    System.out.println("Both numbers are " + result + " odd numbers!");
                }
                case 9 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    String result = Boolean9(A, B) ? "" : " not";
                    System.out.println("At least one of numbers is " + result + " an odd number!");
                }
                case 10 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    String result = Boolean10(A, B) ? "" : " not";
                    System.out.println("Exactly one of the numbers is" + result + " an odd number!");
                }
                case 11 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    String result = Boolean11(A, B) ? "" : " not";
                    System.out.println("The numbers have" + result + " equal parity!");
                }
                case 12 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean12(A, B, C) ? "" : " not";
                    System.out.println("All of these numbers are" + result + " positive numbers!");
                }
                case 13 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean13(A, B, C) ? "" : " not";
                    System.out.println("At least one of these numbers is" + result + " a positive number!");
                }
                case 14 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean14(A, B, C) ? "" : " not";
                    System.out.println("Exactly one of these numbers is" + result + " a positive number!");
                }
                case 15 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean15(A, B, C) ? "" : " not";
                    System.out.println("Exactly two of these numbers are" + result + " positive numbers!");
                }
                case 16 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean16(A) ? "" : " not";
                    System.out.println("The integer is" + result + "  a two-digit even number");
                }
                case 17 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean17(A) ? "" : " not";
                    System.out.println("The integer is" + result + "  a three-digit odd number");
                }
                case 18 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean18(A, B, C) ? "" : " not";
                    System.out.println("Among three given integers there is " + result + " at least one pair of equal ones");
                }
                case 19 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    String result = Boolean19(A, B, C) ? "" : " not";
                    System.out.println("Among three given integers there is " + result + " at least one pair of opposite ones");
                }
                case 20 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean20(A) ? "" : " not";
                    System.out.println("All digits of the number are" + result + " different!");
                }
                case 21 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean21(A) ? "" : " not";
                    System.out.println("All digits of the number are" + result + " ascending!");
                }
                case 22 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    String result = Boolean22(A) ? "" : " not";
                    System.out.println("All digits of the number are" + result + " ascending or descending!");
                }
                case 23 -> {
                    System.out.println("Enter A (4-digit number):");
                    int A = sc.nextInt();
                    String result = Boolean23(A) ? "" : " not";
                    System.out.println("The number is" + result + " a palindrome!");
                }
                case 24 -> {
                    System.out.println("Enter A (A ≠ 0):");
                    double A = sc.nextDouble();
                    System.out.println("Enter B:");
                    double B = sc.nextDouble();
                    System.out.println("Enter C:");
                    double C = sc.nextDouble();
                    String result = Boolean24(A, B, C) ? "" : " not";
                    System.out.println("The quadratic equation has" + result + " real roots!");
                }
                case 25 -> {
                    System.out.println("Enter x:");
                    int x = sc.nextInt();
                    System.out.println("Enter y:");
                    int y = sc.nextInt();
                    String result = Boolean25(x, y) ? "" : " not";
                    System.out.println("The point is" + result + " in the second quadrant!");
                }

                case 26 -> {
                    System.out.println("Enter x:");
                    int x = sc.nextInt();
                    System.out.println("Enter y:");
                    int y = sc.nextInt();
                    String result = Boolean26(x, y) ? "" : " not";
                    System.out.println("The point is" + result + " in the fourth quadrant!");
                }

                case 27 -> {
                    System.out.println("Enter x:");
                    int x = sc.nextInt();
                    System.out.println("Enter y:");
                    int y = sc.nextInt();
                    String result = Boolean27(x, y) ? "" : " not";
                    System.out.println("The point is" + result + " in the second or third quadrant!");
                }

                case 28 -> {
                    System.out.println("Enter x:");
                    int x = sc.nextInt();
                    System.out.println("Enter y:");
                    int y = sc.nextInt();
                    String result = Boolean28(x, y) ? "" : " not";
                    System.out.println("The point is" + result + " in the first or third quadrant!");
                }
                case 29 -> {
                    System.out.println("Enter x:");
                    double x = sc.nextDouble();
                    System.out.println("Enter y:");
                    double y = sc.nextDouble();
                    System.out.println("Enter x1:");
                    double x1 = sc.nextDouble();
                    System.out.println("Enter y1:");
                    double y1 = sc.nextDouble();
                    System.out.println("Enter x2:");
                    double x2 = sc.nextDouble();
                    System.out.println("Enter y2:");
                    double y2 = sc.nextDouble();
                    String result = Boolean29(x, y, x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The point is" + result + " inside the rectangle!");
                }
                case 30 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter c:");
                    int c = sc.nextInt();
                    String result = Boolean30(a, b, c) ? "" : " not";
                    System.out.println("The triangle is" + result + " equilateral!");
                }
                case 31 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter c:");
                    int c = sc.nextInt();
                    String result = Boolean31(a, b, c) ? "" : " not";
                    System.out.println("The triangle is" + result + " isosceles!");
                }
                case 32 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter c:");
                    int c = sc.nextInt();
                    String result = Boolean32(a, b, c) ? "" : " not";
                    System.out.println("The triangle is" + result + " a right triangle!");
                }
                case 33 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter c:");
                    int c = sc.nextInt();
                    String result = Boolean33(a, b, c) ? "" : " not";
                    System.out.println("The triangle" + result + " exists!");
                }
                case 34 -> {
                    System.out.println("Enter x:");
                    int x = sc.nextInt();
                    System.out.println("Enter y:");
                    int y = sc.nextInt();
                    String result = Boolean34(x, y) ? "" : " not";
                    System.out.println("The square is" + result + " white!");
                }
                case 35 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();
                    String result = Boolean35(x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The squares have" + result + " the same color!");
                }
                case 36 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();
                    String result = Boolean36(x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The rook can" + result + " move there in one turn!");
                }
                case 37 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();
                    String result = Boolean37(x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The king can" + result + " move there in one turn!");
                }
                case 38 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();
                    String result = Boolean38(x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The bishop can" + result + " move there in one turn!");
                }
                case 39 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();
                    String result = Boolean39(x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The queen can" + result + " move there in one turn!");
                }
                case 40 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();
                    String result = Boolean40(x1, y1, x2, y2) ? "" : " not";
                    System.out.println("The knight can" + result + " move there in one turn!");
                }
                default -> {
                    System.out.println("Are you joking the range is [1-40]");
                }
            }
        }
    }

    public static boolean Boolean1(int A) {
        return A > 0;
    }

    public static boolean Boolean2(int A) {
        return A % 2 != 0;
    }

    public static boolean Boolean3(int A) {
        return A % 2 == 0;
    }

    public static boolean Boolean4(int A, int B) {
        return A > 2 && B <= 3;
    }

    public static boolean Boolean5(int A, int B) {
        return A >= 0 || B < -2;
    }

    public static boolean Boolean6(int A, int B, int C) {
        return A < B && B < C;
    }

    public static boolean Boolean7(int A, int B, int C) {
        return (A < B && B < C) || (C < B && B < A);
    }

    public static boolean Boolean8(int A, int B) {
        return A % 2 != 0 && B % 2 != 0;
    }

    public static boolean Boolean9(int A, int B) {
        return A % 2 != 0 || B % 2 != 0;
    }

    public static boolean Boolean10(int A, int B) {
        return (A % 2 != 0) ^ (B % 2 != 0);
    }

    public static boolean Boolean11(int A, int B) {
        return (A % 2) == (B % 2);
    }

    public static boolean Boolean12(int A, int B, int C) {
        return (A > 0) && (B > 0) && (C > 0);
    }

    public static boolean Boolean13(int A, int B, int C) {
        return (A > 0) || (B > 0) || (C > 0);
    }

    public static boolean Boolean14(int A, int B, int C) {
        return (A > 0 && B <= 0 && C <= 0) || (B > 0 && A <= 0 && C <= 0) || (C > 0 && A <= 0 && B <= 0);
    }

    public static boolean Boolean15(int A, int B, int C) {
        return (A > 0 && B > 0 && C <= 0) || (A > 0 && C > 0 && B <= 0) || (B > 0 && C > 0 && A <= 0);
    }

    public static boolean Boolean16(int A) {
        return (A >= 10 && A < 100) && (A % 2 == 0);
    }

    public static boolean Boolean17(int A) {
        return (A >= 100 && A < 1000) && (A % 2 != 0);
    }

    public static boolean Boolean18(int A, int B, int C) {
        return (A == B) || (B == C) || (C == A);
    }

    public static boolean Boolean19(int A, int B, int C) {
        return (A + B == 0) || (A + C == 0) || (B + C == 0);
    }

    public static boolean Boolean20(int A) {
        return (A >= 100 && A < 1000) && ((A % 10 != A / 10 % 10) && (A % 10 != A / 100 % 10) && (A / 10 % 10 != A / 100 % 10));
    }

    public static boolean Boolean21(int A) {
        return (A >= 100 && A < 1000) && ((A % 10 > A / 10 % 10) && (A / 10 % 10 > A / 100 % 10));
    }

    public static boolean Boolean22(int A) {
        return (A >= 100 && A < 1000) && (((A % 10 > A / 10 % 10) && (A / 10 % 10 > A / 100 % 10)) || ((A % 10 < A / 10 % 10) && (A / 10 % 10 < A / 100 % 10)));
    }

    public static boolean Boolean23(int A) {
        return (A >= 1000 && A < 10000) && ((A % 10 == A / 1000 % 10) && (A / 10 % 10 == A / 100 % 10));
    }

    public static boolean Boolean24(double A, double B, double C) {
        return (B * B - 4 * A * C) >= 0;
    }

    public static boolean Boolean25(int x, int y) {
        return x < 0 && y > 0;
    }

    public static boolean Boolean26(int x, int y) {
        return x > 0 && y < 0;
    }

    public static boolean Boolean27(int x, int y) {
        return x < 0;
    }

    public static boolean Boolean28(int x, int y) {
        return x * y > 0;
    }

    public static boolean Boolean29(double x, double y, double x1, double y1, double x2, double y2) {
        return x > x1 && x < x2 && y < y1 && y > y2;
    }

    public static boolean Boolean30(int a, int b, int c) {
        return a == b && b == c;
    }

    public static boolean Boolean31(int a, int b, int c) {
        return a == b || b == c || a == c;
    }

    public static boolean Boolean32(int a, int b, int c) {
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }

    public static boolean Boolean33(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static boolean Boolean34(int x, int y) {
        return (x + y) % 2 == 0;
    }

    public static boolean Boolean35(int x1, int y1, int x2, int y2) {
        return (x1 + y1) % 2 == (x2 + y2) % 2;
    }

    public static boolean Boolean36(int x1, int y1, int x2, int y2) {
        return x1 == x2 || y1 == y2;
    }

    public static boolean Boolean37(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1;
    }

    public static boolean Boolean38(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }

    public static boolean Boolean39(int x1, int y1, int x2, int y2) {
        return Boolean36(x1, y1, x2, y2) || Boolean38(x1, y1, x2, y2);
    }

    public static boolean Boolean40(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1) || (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2);
    }
}