package if_;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("This is \"If\" part of Abramyan's Problems Book");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter exercise number:");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Result = " + If1(a));
                }
                case 2 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Result = " + If2(a));
                }
                case 3 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Result = " + If3(a));
                }
                case 4 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    System.out.println("Result = " + If4(a, b, c));
                }
                case 5 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    If5(a, b, c);
                }
                case 6 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Larger one is " + If6(a, b));
                }
                case 7 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Smaller one is " + If7(a, b));
                }
                case 8 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    If8(a, b);
                }
                case 9 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    If9(a, b);
                }
                case 10 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    If10(a, b);
                }
                case 11 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    If11(a, b);
                }
                case 12 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    System.out.println("Min = " + If12(a, b, c));
                }
                case 13 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    System.out.println("Middle number = " + If13(a, b, c));
                }
                case 14 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    If14(a, b, c);
                }
                case 15 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    System.out.println(If15(a, b, c));
                }
                case 16 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    If16(a, b, c);
                }
                case 17 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    If17(a, b, c);
                }
                case 18 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    If18(a, b, c);
                }
                case 19 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    System.out.println("Enter d number: ");
                    int d = sc.nextInt();
                    If19(a, b, c, d);
                }
                case 20 -> {
                    System.out.println("Enter a number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter b number: ");
                    int b = sc.nextInt();
                    System.out.println("Enter c number: ");
                    int c = sc.nextInt();
                    If20(a, b, c);
                }
                case 21 -> {
                    System.out.println("Enter x number: ");
                    int x = sc.nextInt();
                    System.out.println("Enter y number: ");
                    int y = sc.nextInt();
                    System.out.println("Result = " + If21(x, y));
                }
                case 22 -> {
                    System.out.println("Enter x number: ");
                    int x = sc.nextInt();
                    System.out.println("Enter y number: ");
                    int y = sc.nextInt();
                    System.out.println("Result = " + If22(x, y));
                }
                case 23 -> {
                    System.out.println("Enter x1, y1: ");
                    int x1 = sc.nextInt(), y1 = sc.nextInt();
                    System.out.println("Enter x2, y2: ");
                    int x2 = sc.nextInt(), y2 = sc.nextInt();
                    System.out.println("Enter x3, y3: ");
                    int x3 = sc.nextInt(), y3 = sc.nextInt();

                    If23(x1, y1, x2, y2, x3, y3);
                }
                case 24 -> {
                    System.out.println("Enter x: ");
                    double x = sc.nextInt();
                    If24(x);
                }
                case 25 -> {
                    System.out.println("Enter x: ");
                    int x = sc.nextInt();
                    If25(x);
                }
                case 26 -> {
                    System.out.println("Enter x: ");
                    double x = sc.nextDouble();
                    If26(x);
                }
                case 27 -> {
                    System.out.println("Enter x: ");
                    double x = sc.nextDouble();
                    System.out.println("Result = " + If27(x));
                }
                case 28 -> {
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    System.out.println("Days in the year: " + If28(year));
                }
                case 29 -> {
                    System.out.println("Enter an integer: ");
                    int x = sc.nextInt();
                    If29(x);
                }
                case 30 -> {
                    System.out.println("Enter a number (1-999): ");
                    int x = sc.nextInt();
                    If30(x);
                }

                default -> {
                    System.out.println("There is no such kinda exercise, please retry!");
                }
            }
            ;
        }
    }

    public static int If1(int a) {
        if (a > 0) a++;
        return a;
    }

    public static int If2(int a) {
        if (a > 0) a++;
        else a -= 2;
        return a;
    }

    public static int If3(int a) {
        if (a > 0)
            a++;
        else if (a == 0)
            a += 10;
        else
            a -= 2;
        return a;
    }

    public static int If4(int a, int b, int c) {
        int count = 0;
        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;
        return count;
    }

    public static void If5(int a, int b, int c) {
        int pos = 0, neg = 0;
        if (a > 0) pos++;
        else if (a < 0) neg++;
        if (b > 0) pos++;
        else if (b < 0) neg++;
        if (c > 0) pos++;
        else if (c < 0) neg++;
        System.out.println("Total amount of positive numbers is " + pos);
        System.out.println("Total amount of negative numbers is " + neg);
    }

    public static int If6(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static int If7(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public static void If8(int a, int b) {
        if (a > b) {
            System.out.println("Larger: " + a + ", Smaller: " + b);
        } else {
            System.out.println("Larger: " + b + ", Smaller: " + a);
        }
    }

    public static void If9(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("A (Smaller): " + a + ", B (Larger): " + b);
    }

    public static void If10(int a, int b) {
        if (a != b) {
            int sum = a + b;
            a = sum;
            b = sum;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("A = " + a + ", B = " + b);
    }

    public static void If11(int a, int b) {
        if (a != b) {
            int max = Math.max(a, b);
            a = max;
            b = max;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("A = " + a + ", B = " + b);
    }

    public static int If12(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static int If13(int a, int b, int c) {
        if ((a > b && a < c) || (a > c && a < b)) return a;
        if ((b > a && b < c) || (b > c && b < a)) return b;
        return c;
    }

    public static void If14(int a, int b, int c) {
        int min, max;
        if (a < b) {
            if (a < c) min = a;
            else min = c;
        } else {
            if (b < c) min = b;
            else min = c;
        }
        if (a > b) {
            if (a > c) max = a;
            else max = c;
        } else {
            if (b > c) max = b;
            else max = c;
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }

    public static int If15(int a, int b, int c) {
        if (a < b && a < c) return b + c;
        if (b < a && b < c) return a + c;
        return b + a;
    }

    public static void If16(int a, int b, int c) {
        if (a < b && b < c) {
            int sum = 2 * (a + b + c);
            System.out.println("Sum is " + sum);
        } else {
            a *= -1;
            b *= -1;
            c *= -1;
            System.out.println("a = " + a + ", b  = " + b + ", c = " + c);
        }
    }

    public static void If17(int a, int b, int c) {
        if (a < b && b < c || a > b && b > c) {
            int sum = 2 * (a + b + c);
            System.out.println("Sum is " + sum);
        } else {
            a *= -1;
            b *= -1;
            c *= -1;
            System.out.println("a = " + a + ", b  = " + b + ", c = " + c);
        }
    }

    public static void If18(int a, int b, int c) {
        if (a == b) System.out.println(3);
        else if (b == c) System.out.println(1);
        else System.out.println(2);
    }

    public static void If19(int a, int b, int c, int d) {
        if (a == b && b == c) {
            System.out.println(4);
        } else if (b == c && c == d) {
            System.out.println(1);
        } else if (a == c && c == d) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    public static void If20(int a, int b, int c) {
        if (Math.abs(a - b) < Math.abs(a - c)) System.out.println(" b is closer");
        else System.out.println(" c is closer");
    }

    public static int If21(int x, int y) {
        if (x == 0 && y == 0) return 0;
        else if (x == 0 || y == 0) return 1;
        else return 2;
    }

    public static int If22(int x, int y) {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        return 4;
    }

    public static void If23(int x1, int y1, int x2, int y2, int x3, int y3) {

        int x4, y4;
        if (x1 == x2) x4 = x3;
        else if (x1 == x3) x4 = x2;
        else x4 = x1;

        if (y1 == y2) y4 = y3;
        else if (y1 == y3) y4 = y2;
        else y4 = y1;

        System.out.println("x4 = " + x4 + ", y4 = " + y4);
    }

    public static void If24(double x) {
        double result = 0;
        if (x > 0) {
            result = (int) (2 * Math.sin(x));
        } else {
            result = 6 - x;
        }
        System.out.println("Result = " + result);
    }

    public static void If25(int x) {
        int result = 0;
        if (x < -2 || x > 2) {
            result = 2 * x;
        } else {
            result = -3 * x;
        }
        System.out.println("Result = " + result);
    }

    public static void If26(double x) {
        double result;
        if (x <= 0) {
            result = -x;
        } else if (x < 2) {
            result = x * x;
        } else {
            result = 4;
        }
        System.out.println("Result = " + result);
    }

    public static int If27(double x) {
        if (x < 0) return 0;
        else if ((int) x % 2 == 0) return 1;
        else return -1;
    }

    public static int If28(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 366;
        else return 365;
    }

    public static void If29(int x) {
        String result;
        if (x == 0) {
            result = "zero number";
        } else if (x > 0) {
            if (x % 2 == 0) result = "positive even number";
            else result = "positive odd number";
        } else {
            if (x % 2 == 0) result = "negative even number";
            else result = "negative odd number";
        }
        System.out.println(result);
    }

    public static void If30(int x) {
        String result;
        if (x >= 1 && x <= 9) {
            result = "one-digit " + (x % 2 == 0 ? "even" : "odd") + " number";
        } else if (x >= 10 && x <= 99) {
            result = "two-digit " + (x % 2 == 0 ? "even" : "odd") + " number";
        } else {
            result = "three-digit " + (x % 2 == 0 ? "even" : "odd") + " number";
        }
        System.out.println(result);
    }

}
