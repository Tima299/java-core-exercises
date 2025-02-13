package If;

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
                default -> {
                    System.out.println("There is no such kinda exercise, please retry!");
                }
            }
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
        return Math.min(a, Math.min(c, b));
    }

    public static int If13(int a, int b, int c) {
        int max, min, mid;
        if (a > b) {
            if (a > c) {
                max = a;
                mid = b > c ? b : c;
                min = b < c ? b : c;
            } else {
                max = c;
                mid = a;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                mid = (a > c) ? a : c;
                min = (a < c) ? a : c;
            } else {
                max = c;
                mid = b;
                min = a;
            }
        }
        return mid;
    }
}

