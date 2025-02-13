package Integers;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        System.out.println("It is the second chapter intended for Integers");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter task number (1-30) :");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Good bye my Dear!");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter value for L:");
                    int L = sc.nextInt();
                    System.out.println("In meters = " + Integer1(L));
                }
                case 2 -> {
                    System.out.println("Enter value for M:");
                    int M = sc.nextInt();
                    System.out.println("In tons = " + Integer2(M));
                }
                case 3 -> {
                    System.out.println("Enter value for B:");
                    int B = sc.nextInt();
                    System.out.println("In Kbytes = " + Integer3(B));
                }
                case 4 -> {
                    System.out.println("Enter the Value of A :");
                    int A = sc.nextInt();
                    System.out.println("Enter the Value of B :");
                    int B = sc.nextInt();
                    System.out.println("Full segments of B inside A: " + Integer4(A, B));
                }
                case 5 -> {

                    System.out.println("Enter the Value of A :");
                    int A = sc.nextInt();
                    System.out.println("Enter the Value of B :");
                    int B = sc.nextInt();
                    System.out.println("Full segments of B inside A: " + Integer5(A, B));
                }
                case 6 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Integer6(A);
                }
                case 7 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Integer7(A);
                }
                case 8 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Integer8(A);
                }
                case 9 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Hundreds digit: " + Integer9(A));
                }
                case 10 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Integer10(A);
                }
                case 11 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Integer11(A);
                }
                case 12 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Reversed number: " + Integer12(A));
                }
                case 13 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Result: " + Integer13(A));
                }
                case 14 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Result: " + Integer14(A));
                }
                case 15 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Result: " + Integer15(A));
                }
                case 16 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Result: " + Integer16(A));
                }
                case 17 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Hundreds digit: " + Integer17(A));
                }
                case 18 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Thousands digit: " + Integer18(A));
                }
                case 19 -> {
                    System.out.println("Enter N:");
                    int N = sc.nextInt();
                    System.out.println("Full minutes passed: " + Integer19(N));
                }
                case 20 -> {
                    System.out.println("Enter N:");
                    int N = sc.nextInt();
                    System.out.println("Full hours passed: " + Integer20(N));
                }
                case 21 -> {
                    System.out.println("Enter N:");
                    int N = sc.nextInt();
                    System.out.println("Seconds passed from the last minute: " + Integer21(N));
                }
                case 22 -> {
                    System.out.println("Enter N:");
                    int N = sc.nextInt();
                    System.out.println("Seconds passed from the last hour: " + Integer22(N));
                }
                case 23 -> {
                    System.out.println("Enter N:");
                    int N = sc.nextInt();
                    System.out.println("Full minutes passed from the last hour: " + Integer23(N));
                }
                case 24 -> {
                    System.out.println("Enter K:");
                    int K = sc.nextInt();
                    System.out.println("Day of the week (Monday as 1st): " + Integer24(K));
                }
                case 25 -> {
                    System.out.println("Enter K:");
                    int K = sc.nextInt();
                    System.out.println("Day of the week (Thursday as 1st): " + Integer25(K));
                }
                case 26 -> {
                    System.out.println("Enter K:");
                    int K = sc.nextInt();
                    System.out.println("Day of the week (Tuesday as 1st): " + Integer26(K));
                }
                case 27 -> {
                    System.out.println("Enter K:");
                    int K = sc.nextInt();
                    System.out.println("Day of the week (Saturday as 1st): " + Integer27(K));
                }
                case 28 -> {
                    System.out.println("Enter K:");
                    int K = sc.nextInt();
                    System.out.println("Enter N (starting weekday):");
                    int N = sc.nextInt();
                    System.out.println("Day of the week: " + Integer28(K, N));
                }
                case 29 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    Integer29(A, B, C);
                }
                case 30 -> {
                    System.out.println("Enter year:");
                    int year = sc.nextInt();
                    System.out.println("Century: " + Integer30(year));
                }

                default -> {
                    System.out.println("Are you joking? The range is only [1-30]");
                }
            }
        }
    }


    private static int Integer1(int L) {
        return L / 100;
    }

    private static int Integer2(int M) {
        return M / 1000;
    }

    private static int Integer3(int B) {
        return B / 1024;
    }

    public static int Integer4(int A, int B) {
        if (A < B) {
            System.out.println("A must be > than B");
        }
        return A / B;
    }

    public static int Integer5(int A, int B) {
        if (A < B) {
            System.out.println("A must be > than B");
        }
        return A % B;
    }

    public static void Integer6(int A) {
        if (A < 0 || A > 100) {
            System.out.println("It must be digit number!");
            return;
        }
        int tens = A / 10;
        int ones = A % 10;
        System.out.println("The given numbers one's digit is " + ones + ", and the ten's digit is " + tens);
    }

    public static void Integer7(int A) {
        if (A < 0 || A > 100) {
            System.out.println("It must be digit number!");
            return;
        }
        int tens = A / 10;
        int ones = A % 10;
        int sum = tens + ones;
        int product = tens * ones;
        System.out.println("Their sum is " + sum + ", and their product is " + product);
    }

    public static void Integer8(int A) {
        if (A < 10 || A > 99) {
            System.out.println("It must be digit number!");
            return;
        }
        int tens = A / 10;
        int ones = A % 10;
        int result = ones * 10 + tens;
        System.out.println("The given numbers reverse is " + result);
    }

    private static int Integer9(int A) {
        return A / 100;
    }

    private static void Integer10(int A) {
        int ones = A % 10;
        int tens = (A / 10) % 10;
        System.out.println("Ones: " + ones + ", Tens: " + tens);
    }

    private static void Integer11(int A) {
        int ones = A % 10;
        int tens = (A / 10) % 10;
        int hundreds = A / 100;
        System.out.println("Sum: " + (ones + tens + hundreds) + ", Product: " + (ones * tens * hundreds));
    }

    private static int Integer12(int A) {
        return (A % 10) * 100 + ((A / 10) % 10) * 10 + (A / 100);
    }

    private static int Integer13(int A) {
        return (A % 100) * 10 + (A / 100);
    }

    private static int Integer14(int A) {
        return (A % 10) * 100 + (A / 10);
    }

    private static int Integer15(int A) {
        return ((A / 10) % 10) * 100 + (A / 100) * 10 + (A % 10);
    }

    private static int Integer16(int A) {
        return (A / 100) * 100 + (A % 10) * 10 + ((A / 10) % 10);
    }

    private static int Integer17(int A) {
        return (A / 100) % 10;
    }

    private static int Integer18(int A) {
        return (A / 1000) % 10;
    }

    public static int Integer19(int N) {
        return N / 60;
    }

    public static int Integer20(int N) {
        return N / 3600;
    }

    public static int Integer21(int N) {
        return N % 60;
    }

    public static int Integer22(int N) {
        return N % 3600;
    }

    public static int Integer23(int N) {
        return (N % 3600) / 60;
    }

    public static int Integer24(int K) {
        return (K + 0) % 7;
    }

    public static int Integer25(int K) {
        return (K + 3) % 7;
    }

    public static int Integer26(int K) {
        return (K % 7) + 1;
    }

    public static int Integer27(int K) {
        return (K + 5) % 7 + 1;
    }

    public static int Integer28(int K, int N) {
        return (K + N - 2) % 7 + 1;
    }

    public static int Integer29(int A, int B, int C) {
        int squares = (A / C) * (B / C);
        int unusedArea = A * B - squares * C * C;
        System.out.println("Full squares placed: " + squares);
        System.out.println("Unused area: " + unusedArea);
        return squares;
    }

    public static int Integer30(int year) {
        return (year + 99) / 100;
    }
}


