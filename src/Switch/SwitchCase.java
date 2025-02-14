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
                case 9 -> {
                    System.out.println("Enter day: ");
                    int d = sc.nextInt();
                    System.out.println("Enter month: ");
                    int m = sc.nextInt();
                    Case9(d, m);
                }
                case 10 -> {
                    System.out.println("Enter initial direction (N, W, S, E): ");
                    char c = sc.next().charAt(0);
                    System.out.println("Enter command (0, 1, -1): ");
                    int n = sc.nextInt();
                    Case10(c, n);
                }
                case 11 -> {
                    System.out.println("Enter initial direction (N, W, S, E) and two instructions (1, -1, 2): ");
                    char c = sc.next().charAt(0);
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    Case11(c, n1, n2);
                }
                case 12 -> {
                    System.out.println("Enter element number (1-4) and its value: ");
                    int elem = sc.nextInt();
                    double value = sc.nextDouble();
                    Case12(elem, value);
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
    public static void Case9(int d, int m) {
        int nextD, nextM;
        switch (m) {
            case 1, 3, 5, 7, 8, 10 -> {
                if (d == 31) {
                    nextD = 1;
                    nextM = m + 1;
                } else {
                    nextD = d + 1;
                    nextM = m;
                }
            }
            case 4, 6, 9, 11 -> {
                if (d == 30) {
                    nextD = 1;
                    nextM = m + 1;
                } else {
                    nextD = d + 1;
                    nextM = m;
                }
            }
            case 12 -> {
                if (d == 31) {
                    nextD = 1;
                    nextM = 1;
                } else {
                    nextD = d + 1;
                    nextM = m;
                }
            }
            case 2 -> {
                if (d == 28) {
                    nextD = 1;
                    nextM = 3;
                } else {
                    nextD = d + 1;
                    nextM = m;
                }
            }
            default -> {
                System.out.println("Invalid date");
                return;
            }
        }
        System.out.println("Next date: " + nextD + "/" + nextM);
    }

    public static void Case10(char c, int n) {
        switch (n) {
            case 0 -> System.out.println("Direction: " + c);
            case 1 -> System.out.println("Direction: " + turnLeft(c));
            case -1 -> System.out.println("Direction: " + turnRight(c));
            default -> System.out.println("Invalid command");
        }
    }

    public static char turnLeft(char c) {
        return switch (c) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default -> 'X';
        };
    }

    public static char turnRight(char c) {
        return switch (c) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> 'X';
        };
    }
    public static void Case11(char C, int N1, int N2) {
        for (int i = 0; i < 2; i++) {
            int N = (i == 0) ? N1 : N2;
            switch (N) {
                case 1 -> {
                    switch (C) {
                        case 'N' -> C = 'W';
                        case 'W' -> C = 'S';
                        case 'S' -> C = 'E';
                        case 'E' -> C = 'N';
                    }
                }
                case -1 -> {
                    switch (C) {
                        case 'N' -> C = 'E';
                        case 'E' -> C = 'S';
                        case 'S' -> C = 'W';
                        case 'W' -> C = 'N';
                    }
                }
                case 2 -> {
                    switch (C) {
                        case 'N' -> C = 'S';
                        case 'S' -> C = 'N';
                        case 'E' -> C = 'W';
                        case 'W' -> C = 'E';
                    }
                }
            }
        }
        System.out.println("Direction: " + C);
    }

    public static void Case12(int n, double val) {
        double r = 0, d = 0, l = 0, s = 0;
        switch (n) {
            case 1 -> {
                r = val;
                d = 2 * r;
                l = 2 * 3.14 * r;
                s = 3.14 * r * r;
            }
            case 2 -> {
                d = val;
                r = d / 2;
                l = 2 * 3.14 * r;
                s = 3.14 * r * r;
            }
            case 3 -> {
                l = val;
                r = l / (2 * 3.14);
                d = 2 * r;
                s = 3.14 * r * r;
            }
            case 4 -> {
                s = val;
                r = Math.sqrt(s / 3.14);
                d = 2 * r;
                l = 2 * 3.14 * r;
            }
        }
        System.out.println("Radius: " + r);
        System.out.println("Diameter: " + d);
        System.out.println("Length: " + l);
        System.out.println("Area: " + s);
    }

}


