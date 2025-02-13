package Switch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("This is \"SwitchCase\" part of Abramyan's Problems Book");
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
                    System.out.println("Enter a day of the week: ");
                    int a = sc.nextInt();
                    System.out.println("The day is " + Case1(a));
                }
                case 2 -> {
                    System.out.println("Enter a mark (1-5): ");
                    int k = sc.nextInt();
                    System.out.println(Case2(k));
                }
                case 3 -> {
                    System.out.println("Enter month number (1-12): ");
                    int month = sc.nextInt();
                    System.out.println(Case3(month));
                }
                case 4 -> {
                    System.out.println("Enter month number (1-12): ");
                    int month = sc.nextInt();
                    System.out.println("Days: " + Case4(month));
                }
                case 5 -> {
                    System.out.println("Enter operation number (1-4): ");
                    int op = sc.nextInt();
                    System.out.println("Enter A: ");
                    double a = sc.nextDouble();
                    System.out.println("Enter B: ");
                    double b = sc.nextDouble();
                    System.out.println("Result: " + Case5(op, a, b));
                }
                case 6 -> {
                    System.out.println("Enter unit number (1-5): ");
                    int unit = sc.nextInt();
                    System.out.println("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.println("Length in meters: " + Case6(unit, l));
                }
                case 7 -> {
                    System.out.println("Enter unit number (1-5): ");
                    int unit = sc.nextInt();
                    System.out.println("Enter mass: ");
                    double m = sc.nextDouble();
                    System.out.println("Mass in kg: " + Case7(unit, m));
                }
                case 8 -> {
                    System.out.println("Enter day (D): ");
                    int d = sc.nextInt();
                    System.out.println("Enter month (M): ");
                    int m = sc.nextInt();
                    Case8(d, m);
                }
                default -> {
                    System.out.println("There is no such kinda exercise, please retry!");
                }
            }
            ;
        }
    }

    public static String Case1(int n) {
        return switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "There is no such kinda day of the week!";
        };
    }

    public static String Case2(int k) {
        return switch (k) {
            case 1 -> "bad";
            case 2 -> "unsatisfactory";
            case 3 -> "mediocre";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> "error";
        };
    }

    public static String Case3(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month!";
        };
    }

    public static int Case4(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
    }

    public static double Case5(int op, double a, double b) {
        return switch (op) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> (b != 0 ? a / b : Double.NaN);
            default -> Double.NaN;
        };
    }

    public static double Case6(int unit, double l) {
        return switch (unit) {
            case 1 -> l / 10;
            case 2 -> l * 1000;
            case 3 -> l;
            case 4 -> l / 1000;
            case 5 -> l / 100;
            default -> -1;
        };
    }

    public static double Case7(int unit, double m) {
        return switch (unit) {
            case 1 -> m;
            case 2 -> m / 1000000;
            case 3 -> m / 1000;
            case 4 -> m * 1000;
            case 5 -> m * 100;
            default -> -1;
        };
    }

    public static void Case8(int d, int m) {
        switch (d) {
            case 1 -> {
                switch (m) {
                    case 1 -> { m = 12; d = 31; }
                    case 3 -> { m--; d = 28; }
                    case 5, 7, 10, 12 -> { m--; d = 30; }
                    default -> { m--; d = 31; }
                }
            }
            default -> d--;
        }
        System.out.println("Previous Date: " + d + "d  " + m+"m");
    }
}

