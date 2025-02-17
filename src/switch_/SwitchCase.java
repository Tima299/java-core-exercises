package switch_;

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
                case 13 -> {
                    System.out.println("Enter n, double value");
                    int n = sc.nextInt();
                    double value = sc.nextDouble();
                    Case13(n, value);
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
                    case 1 -> {
                        m = 12;
                        d = 31;
                    }
                    case 3 -> {
                        m--;
                        d = 28;
                    }
                    case 5, 7, 10, 12 -> {
                        m--;
                        d = 30;
                    }
                    default -> {
                        m--;
                        d = 31;
                    }
                }
            }
            default -> d--;
        }
        System.out.println("Previous Date: " + d + "d  " + m + "m");
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

    public static void Case13(int n, double value) {
        double a = 0, c = 0, h = 0, S = 0;
        switch (n) {
            case 1 -> {
                a = value;
                c = a * Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
            }
            case 2 -> {
                c = value;
                a = c / Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
            }
            case 3 -> {
                h = value;
                c = 2 * h;
                a = (c / Math.sqrt(2));
                S = (c * h) / 2;
            }
            case 4 -> {
                S = value;
                c = Math.sqrt(4 * S);
                h = c / 2;
                a = c / Math.sqrt(2);
            }
            default -> {
                System.out.println("Invalid input.");
                return;
            }
        }
        System.out.printf("1: a = %.2f%n2: c = %.2f%n3: h = %.2f%n4: S = %.2f%n", a, c, h, S);
    }

    public static void Case14(int n, double value) {
        double a = 0, R1 = 0, R2 = 0, S = 0;
        switch (n) {
            case 1 -> {
                a = value;
                R1 = a * Math.sqrt(3) / 6;
                R2 = 2 * R1;
                S = a * a * Math.sqrt(3) / 4;
            }
            case 2 -> {
                R1 = value;
                a = R1 * 6 / Math.sqrt(3);
                R2 = 2 * R1;
                S = a * a * Math.sqrt(3) / 4;
            }
            case 3 -> {
                R2 = value;
                R1 = R2 / 2;
                a = R1 * 6 / Math.sqrt(3);
                S = a * a * Math.sqrt(3) / 4;
            }
            case 4 -> {
                S = value;
                a = Math.sqrt(4 * S / Math.sqrt(3));
                R1 = a * Math.sqrt(3) / 6;
                R2 = 2 * R1;
            }
        }
        System.out.printf("1: a = %.2f\n2: R1 = %.2f\n3: R2 = %.2f\n4: S = %.2f\n", a, R1, R2, S);
    }

    public static void Case15(int N, int M) {
        String[] values = {"six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        String[] suits = {"spades", "clubs", "diamonds", "hearts"};
        System.out.println(values[N - 6] + " of " + suits[M - 1]);
    }

    public static void Case16(int age) {
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty"};
        String[] ones = {"", "-one", "-two", "-three", "-four", "-five", "-six", "-seven", "-eight", "-nine"};
        System.out.println(tens[age / 10 - 2] + ones[age % 10] + " years");
    }

    public static void Case17(int task) {
        String[] tens = {"tenth", "twentieth", "thirtieth"};
        String[] ones = {"", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth"};
        System.out.println("the " + (task % 10 == 0 ? tens[task / 10 - 1] : tens[task / 10 - 1].replace("ieth", "y-") + ones[task % 10]) + " task");
    }

    public static void Case18(int num) {
        String[] hundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        System.out.println(hundreds[num / 100 - 1] + (num % 100 == 0 ? "" : num % 100 < 10 ? " and " + ones[num % 10] : num % 100 < 20 ? " and " + teens[num % 10] : " and " + tens[num % 100 / 10] + (num % 10 == 0 ? "" : "-" + ones[num % 10])));
    }

    public static void Case19(int year) {
        String[] colors = {"green", "red", "yellow", "white", "black"};
        String[] animals = {"rat", "cow", "tiger", "hare", "dragon", "snake", "horse", "sheep", "monkey", "hen", "dog", "pig"};
        int cycle = (year - 1984) % 60;
        System.out.println("The " + colors[(cycle / 12 + 5) % 5] + " " + animals[cycle % 12] + "'s year");
    }

    public static void Case20(int D, int M) {
        String[] zodiac = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
        int[] dates = {19, 18, 20, 19, 20, 21, 22, 22, 22, 22, 22, 21};
        System.out.println(D > dates[M - 1] ? zodiac[M] : zodiac[M - 1]);
    }
}



