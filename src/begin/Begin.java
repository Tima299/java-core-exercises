package begin;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Begin {
    public static void main(String[] args) {
        String text = """
                PROBLEM BOOK ON PROGRAMMING by ABRAMYAN\n  """;

        System.out.println("Welcome! It is " + text);
        System.out.println("_________________________________");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Choose a task number to run (1 -40):");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("You pressed 0, to exit");
                System.out.println("_________________________________");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter side a: ");
                    int a = sc.nextInt();
                    System.out.println("P = " + Begin1(a));
                    System.out.println("_________________________________");
                }
                case 2 -> {
                    System.out.println("Enter side a: ");
                    int A = sc.nextInt();
                    System.out.println("S = " + Begin2(A));
                    System.out.println("_________________________________");
                }
                case 3 -> {
                    System.out.println("Enter side a: ");
                    int r1 = sc.nextInt();
                    System.out.println("Enter side b: ");
                    int r2 = sc.nextInt();
                    System.out.println("S = " + Begin3(r1, r2));
                    System.out.println("_________________________________");
                }
                case 4 -> {
                    System.out.println("Enter side a: ");
                    int d = sc.nextInt();
                    System.out.println("S = " + Begin4(d));
                    System.out.println("_________________________________");
                }
                case 5 -> {
                    System.out.println("Enter the side C: ");
                    int c = sc.nextInt();
                    Begin5(c);
                    System.out.println("_________________________________");
                }
                case 6 -> {
                    System.out.println("Enter the side x: ");
                    int x = sc.nextInt();
                    System.out.println("Enter the side y: ");
                    int y = sc.nextInt();
                    System.out.println("Enter the side z: ");
                    int z = sc.nextInt();
                    Begin6(x, y, z);
                    System.out.println("_________________________________");
                }
                case 7 -> {
                    System.out.println("Enter the value of the radius :");
                    double radius = sc.nextDouble();
                    Begin7(radius);
                    System.out.println("_________________________________");
                }
                case 8 -> {
                    System.out.println("Enter num1:");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num2:");
                    int num2 = sc.nextInt();
                    System.out.println("Avg = " + Begin8(num1, num2));
                    System.out.println("_________________________________");
                }
                case 9 -> {
                    System.out.println("Enter num1:");
                    double g1 = sc.nextDouble();
                    System.out.println("Enter num2:");
                    double g2 = sc.nextDouble();
                    System.out.println("Avg = " + Begin9(g1, g2));
                    System.out.println("_________________________________");
                }
                case 10 -> {
                    System.out.println("Enter value of nonzero number 1 :");
                    int N1 = sc.nextInt();
                    System.out.println("Enter value of nonzero number 2 :");
                    int N2 = sc.nextInt();
                    Begin10(N1, N2);
                    System.out.println("_________________________________");
                }
                case 11 -> {
                    System.out.println("Enter value of nonzero number 1 :");
                    int Nn1 = sc.nextInt();
                    System.out.println("Enter value of nonzero number 2 :");
                    int Nn2 = sc.nextInt();
                    Begin11(Nn1, Nn2);
                    System.out.println("_________________________________");
                }
                case 12 -> {
                    System.out.println("Enter value of nonzero number 1 :");
                    int a1 = sc.nextInt();
                    System.out.println("Enter value of nonzero number 2 :");
                    int a2 = sc.nextInt();
                    Begin12(a1, a2);
                    System.out.println("_________________________________");
                }
                case 13 -> {
                    System.out.println("Enter value of nonzero number 1 :");
                    int rR1 = sc.nextInt();
                    System.out.println("Enter value of nonzero number 2 :");
                    int rR2 = sc.nextInt();
                    Begin13(rR1, rR2);
                    System.out.println("_________________________________");
                }
                case 14 -> {
                    System.out.println("Enter value for L:");
                    int Length = sc.nextInt();
                    Begin14(Length);
                    System.out.println("_________________________________");
                }
                case 15 -> {
                    System.out.println("Enter value for S:");
                    int sSs = sc.nextInt();
                    Begin15(sSs);
                    System.out.println("_________________________________");
                }
                case 16 -> {
                    System.out.println("Enter X1: ");
                    int x1 = sc.nextInt();
                    System.out.println("Enter X2: ");
                    int x2 = sc.nextInt();
                    System.out.println("Distance = " + Begin16(x1, x2));
                    System.out.println("_________________________________");

                }
                case 17 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    Begin17(A, B, C);
                    System.out.println("_________________________________");
                }
                case 18 -> {
                    System.out.println("Enter A:");
                    int An = sc.nextInt();
                    System.out.println("Enter B:");
                    int Bn = sc.nextInt();
                    System.out.println("Enter C:");
                    int Cn = sc.nextInt();
                    Begin18(An, Bn, Cn);
                    System.out.println("_________________________________");
                }
                case 19 -> {
                    System.out.println("Enter x1:");
                    int xOne = sc.nextInt();
                    System.out.println("Enter y1:");
                    int yOne = sc.nextInt();
                    System.out.println("Enter x2:");
                    int xTwo = sc.nextInt();
                    System.out.println("Enter y2:");
                    int yTwo = sc.nextInt();
                    Begin19(xOne, yOne, xTwo, yTwo);
                    System.out.println("_________________________________");
                }
                case 20 -> {
                    System.out.println("Enter x1:");
                    int xStart = sc.nextInt();
                    System.out.println("Enter y1:");
                    int yStart = sc.nextInt();
                    System.out.println("Enter x2:");
                    int xEnd = sc.nextInt();
                    System.out.println("Enter y2:");
                    int yEnd = sc.nextInt();
                    Begin20(xStart, yStart, xEnd, yEnd);
                    System.out.println("_________________________________");
                }
                case 21 -> {
                    System.out.println("Please enter side X1");
                    int x1 = sc.nextInt();
                    System.out.println("Please enter side Y1");
                    int y1 = sc.nextInt();
                    System.out.println("Please enter side X2");
                    int x2 = sc.nextInt();
                    System.out.println("Please enter side Y2");
                    int y2 = sc.nextInt();
                    System.out.println("Please enter side X3");
                    int x3 = sc.nextInt();
                    System.out.println("Please enter side Y3");
                    int y3 = sc.nextInt();
                    Begin21(x1, y1, x2, y2, x3, y3);
                    System.out.println("_________________________________");

                }
                case 22 -> {
                    System.out.print("Enter any value for A: ");
                    int A = sc.nextInt();
                    System.out.print("Enter any value for B: ");
                    int B = sc.nextInt();
                    Begin22(A, B);
                    System.out.println("_________________________________");

                }
                case 23 -> {
                    System.out.print("Enter any value for A: ");
                    int A = sc.nextInt();
                    System.out.print("Enter any value for B: ");
                    int B = sc.nextInt();
                    System.out.print("Enter any value for C: ");
                    int C = sc.nextInt();
                    Begin23(A, B, C);
                    System.out.println("_________________________________");

                }
                case 24 -> {
                    System.out.print("Enter any value for A: ");
                    int A = sc.nextInt();
                    System.out.print("Enter any value for B: ");
                    int B = sc.nextInt();
                    System.out.print("Enter any value for C: ");
                    int C = sc.nextInt();
                    Begin24(A, B, C);
                    System.out.println("_________________________________");

                }
                case 25 -> {
                    System.out.println("enter x:");
                    int x = sc.nextInt();
                    System.out.println("Y = " + Begin25(x));
                    System.out.println("_________________________________");

                }
                case 26 -> {
                    System.out.println("enter x:");
                    int x = sc.nextInt();
                    System.out.println("Y = " + Begin26(x));
                    System.out.println("_________________________________");

                }
                case 27 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Begin27(A);
                    System.out.println("_________________________________");

                }
                case 28 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    Begin28(A);
                    System.out.println("_________________________________");

                }
                case 29 -> {
                    System.out.println("Enter angle in degrees: ");
                    int angle = sc.nextInt();
                    Begin29(angle);
                    System.out.println("_________________________________");

                }
                case 30 -> {
                    double radians = 0;
                    try {
                        System.out.println("Enter radians: ");
                        radians = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("You got some error with your type of input!");
                    }
                    Begin30(radians);
                    System.out.println("_________________________________");

                }
                case 31 -> {
                    System.out.println("Enter the value of F: ");
                    int F = sc.nextInt();
                    System.out.println("In centigrade it will be " + Begin31(F));
                    System.out.println("_________________________________");

                }
                case 32 -> {
                    System.out.println("Enter the value of C: ");
                    int C = sc.nextInt();
                    System.out.println("In Fahrenheit it will be " + Begin32(C));
                    System.out.println("_________________________________");

                }
                case 33 -> {
                    System.out.println("Enter X: ");
                    double X = sc.nextDouble();
                    System.out.println("Enter A: ");
                    double A = sc.nextDouble();
                    System.out.println("Enter Y: ");
                    double Y = sc.nextDouble();
                    System.out.println(Y + " kg of sweet will be : " + Begin33(X, A, Y) + "sums");
                    System.out.println("_________________________________");

                }
                case 34 -> {
                    System.out.println("Enter X: ");
                    double X = sc.nextDouble();
                    System.out.println("Enter A: ");
                    double A = sc.nextDouble();
                    System.out.println("Enter Y: ");
                    double Y = sc.nextDouble();
                    System.out.println("Enter B: ");
                    double B = sc.nextDouble();
                    Begin34(X, A, Y, B);
                    System.out.println("_________________________________");

                }
                case 35 -> {
                    System.out.println("Enter V : ");
                    double V = sc.nextDouble();
                    System.out.println("Enter U : ");
                    double U = sc.nextDouble();
                    System.out.println("Enter T1 : ");
                    double T1 = sc.nextDouble();
                    System.out.println("Enter T2 : ");
                    double T2 = sc.nextDouble();
                    System.out.println("The distance is : " + Begin35(V, U, T1, T2));
                    System.out.println("_________________________________");

                }
                case 36 -> {
                    System.out.println("Enter V1:");
                    int V1 = sc.nextInt();
                    System.out.println("Enter V2:");
                    int V2 = sc.nextInt();
                    System.out.println("Enter S:");
                    int S = sc.nextInt();
                    System.out.println("Enter T:");
                    int T = sc.nextInt();
                    System.out.println("Total Distance = " + Begin36(V1, V2, S, T));
                    System.out.println("_________________________________");

                }
                case 37 -> {
                    System.out.println("Enter V1:");
                    int V1 = sc.nextInt();
                    System.out.println("Enter V2:");
                    int V2 = sc.nextInt();
                    System.out.println("Enter S:");
                    int S = sc.nextInt();
                    System.out.println("Enter T:");
                    int T = sc.nextInt();
                    System.out.println("Distance = " + Begin37(V1, V2, S, T));
                    System.out.println("_________________________________");

                }
                case 38 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Solution : " + Begin38(A, B));
                    System.out.println("_________________________________");

                }
                case 39 -> {
                    System.out.println("Enter A:");
                    int A = sc.nextInt();
                    System.out.println("Enter B:");
                    int B = sc.nextInt();
                    System.out.println("Enter C:");
                    int C = sc.nextInt();
                    Begin39(A, B, C);
                    System.out.println("_________________________________");

                }
                case 40 -> {
                    System.out.print("Enter A1, B1, C1, A2, B2, C2: ");
                    int A1 = sc.nextInt();
                    int B1 = sc.nextInt();
                    int C1 = sc.nextInt();
                    int A2 = sc.nextInt();
                    int B2 = sc.nextInt();
                    int C2 = sc.nextInt();
                    Begin40(A1, B1, C1, A2, B2, C2);
                    System.out.println("_________________________________");

                }
                default -> {
                    System.out.println("Invalid range! (1-40)!");
                    System.out.println("_________________________________");
                }
            }
        }
    }

    public static int Begin1(int a) {
        return 4 * a;
    }

    public static int Begin2(int a) {
        return a * a;
    }

    public static int Begin3(int a, int b) {
        return 2 * (a + b);
    }

    public static int Begin4(int d) {
        return (int) Math.PI * d;
    }

    public static void Begin5(int a) {
        System.out.println("V = " + (pow(a, 3)));
        System.out.println("S = " + 6 * pow(a, 2));
    }

    public static void Begin6(int a, int b, int c) {
        System.out.println("V = " + a * b * c);
        System.out.println("S = " + 2 * (a * b + b * c + a * c));
    }

    public static void Begin7(double R) {
        double L = 2 * Math.PI * R;
        double S = Math.PI * pow(R, 2);
        System.out.printf("L = %.2f\n", L);
        System.out.printf("S = %.2f\n", S);
    }

    public static int Begin8(int a, int b) {
        return (a + b) / 2;
    }

    public static double Begin9(double a, double b) {
        return (Math.sqrt(a * b));
    }

    public static void Begin10(double num1, double num2) {
        if (validityChecker(num1, num2)) {
            System.out.println("Retry!");
        } else {
            System.out.println("Sum = " + (num1 + num2));
            System.out.println("Difference = " + ((num1 - num2) < 0 ? num2 - num1 : num1 - num2));
            System.out.println("Product = " + (num1 * num2));
            System.out.println("Quotient of their squares = " + (pow(num1, 2) / pow(num2, 2)));
        }
    }

    public static void Begin11(double num1, double num2) {
        if (validityChecker(num1, num2)) {
            System.out.println("Retry!");
        } else {
            System.out.println("Sum = " + (num1 + num2));
            System.out.println("Difference = " + ((num1 - num2) < 0 ? num2 - num1 : num1 - num2));
            System.out.println("Product = " + (num1 * num2));
            System.out.println("Quotient of their squares = " + Math.abs((pow(num1, 2)) / Math.abs(pow(num2, 2))));
        }
    }

    public static void Begin12(int a, int b) {
        int c = (int) Math.sqrt(pow(a, 2) + pow(b, 2));
        System.out.println("c = " + c);
        System.out.println("P = " + (a + b + c));
    }

    public static void Begin13(int R1, int R2) {
        if (R1 < R2) {
            System.out.println("R1 must be greater than R2");
            return;
        }
        int S1 = (int) (Math.PI * pow(R1, 2));
        int S2 = (int) (Math.PI * pow(R2, 2));
        int S3 = S1 - S2;
        System.out.println("S1 = " + S1);
        System.out.println("S2 = " + S2);
        System.out.println("S3 = " + S3);
    }

    public static void Begin14(int L) {
        int R = (int) ((double) L / 2 * Math.PI);
        int S = (int) (Math.PI * pow(R, 2));
        System.out.println("R = " + R);
        System.out.println("S = " + S);
    }

    public static void Begin15(double S) {
        double D = (Math.sqrt(4 * S / Math.PI));
        double L = (Math.PI * D);
        System.out.printf("D = %.4f\n", D);
        System.out.printf("L = %.4f\n", L);
    }

    public static int Begin16(int x1, int x2) {
        return Math.abs(x2 - x1);
    }

    public static void Begin17(int A, int B, int C) {
        int AC = Math.abs(C - A);
        int BC = Math.abs(C - B);
        int sum = AC + BC;

        System.out.println("AC = " + AC);
        System.out.println("BC = " + BC);
        System.out.println("Sum = " + sum);
    }

    public static void Begin18(int A, int B, int C) {
        int AC = Math.abs(C - A);
        int BC = Math.abs(C - B);
        int p = AC * BC;

        System.out.println("AC = " + AC);
        System.out.println("BC = " + BC);
        System.out.println("Product = " + p);
    }

    public static void Begin19(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        int perimeter = 2 * (width + height);
        int area = width * height;

        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }

    public static void Begin20(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int distance = (int) Math.sqrt((pow(width, 2) + pow(height, 2)));

        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Distance = " + distance);
    }

    public static void Begin21(int x1, int y1, int x2, int y2, int x3, int y3) {
        int a = (int) (Math.sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2)));
        int b = (int) (Math.sqrt(pow((x3 - x2), 2) + pow((y3 - y2), 2)));
        int c = (int) (Math.sqrt(pow((x1 - x3), 2) + pow((y1 - y3), 2)));
        int P = a + b + c;
        int p = (a + b + c) / 2;
        int S = (int) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        System.out.println("P = " + P);
        System.out.println("S = " + S);
    }

    public static void Begin22(int A, int B) {
        int temp = A;
        A = B;
        B = temp;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }

    public static void Begin23(int A, int B, int C) {
        int tempA = A;
        A = B;
        B = C;
        C = tempA;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
    }

    public static void Begin24(int A, int B, int C) {
        int tempA = A;
        A = C;
        C = B;
        B = tempA;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
    }

    public static int Begin25(int a) {
        return (int) (3 * pow(a, 6) - 6 * pow(a, 2) - 7);
    }

    public static int Begin26(int x) {
        return (int) (4 * pow((x - 3), 6) - 7 * pow((x - 3), 3) + 2);
    }

    public static void Begin27(int a) {
        int A2 = a * a;
        int A4 = A2 * A2;
        int A8 = A4 * A4;
        System.out.println("A^2 = " + A2);
        System.out.println("A^4 = " + A4);
        System.out.println("A^8 = " + A8);
    }

    public static void Begin28(int a) {
        int A2 = a * a;
        int A3 = A2 * a;
        int A5 = A3 * A2;
        int A10 = A5 * A2;
        int A15 = A5 * A3;
        System.out.println("A^2 = " + A2);
        System.out.println("A^3 = " + A3);
        System.out.println("A^5 = " + A5);
        System.out.println("A^10 = " + A10);
        System.out.println("A^15 = " + A15);
    }

    public static void Begin29(int a) {
        if (!(a >= 0 && a < 360)) {
            return;
        }
        double radian = (double) a / 180;
        System.out.printf("In radians it will be %.4fπ%n", radian);
    }

    public static void Begin30(double a) {

        if (!(a >= 0 && a < 2 * Math.PI)) {
            return;
        }
        double gradus = a * 180 / Math.PI;
        System.out.printf("In gradus it will be %.2f%n", gradus);
    }

    public static int Begin31(int F) {
        return (F - 32) * 5 / 9;
    }

    public static int Begin32(int C) {
        return (int) (C * (9.0 / 5.0) + 32);
    }

    public static double Begin33(double X, double A, double Y) {
        double costPerKg = A / X;
        return Y * costPerKg;
    }

    public static void Begin34(double X, double A, double Y, double B) {
        double chocolateCost = X / A;
        double sugarCost = Y / B;
        double proportion = chocolateCost < sugarCost ? chocolateCost / sugarCost : sugarCost / chocolateCost;
        System.out.printf("Chocolate's cost : %.4f%n", chocolateCost);
        System.out.printf("Sugar's cost : %.4f%n", sugarCost);
        System.out.printf("Proportion of costs : %.4f%n", proportion);
    }

    public static double Begin35(double V, double U, double T1, double T2) {
        if (U >= V) {
            throw new IllegalArgumentException("U must be less than V for valid boat movement.");
        }
        double distanceLake = V * T1;
        double distanceRiver = (V - U) * T2;
        return distanceLake + distanceRiver;
    }

    public static int Begin36(int V1, int V2, int S, int T) {
        return S + (V1 + V2) * T;
    }

    public static int Begin37(int V1, int V2, int S, int T) {
        return Math.abs(S - (V1 - V2) * T);
    }

    public static int Begin38(int A, int B) {
        if (A == 0) {
            throw new IllegalArgumentException("A must not be zero.");
        }
        return -B / A;
    }

    public static void Begin39(int A, int B, int C) {
        double x1 = (-B - Math.sqrt(pow(B, 2) - 4 * A * C)) / (2 * A);
        double x2 = (-B + Math.sqrt(pow(B, 2) - 4 * A * C)) / (2 * A);
        System.out.println("The smallest solution is " + x1);
        System.out.println("The biggest solution is " + x2);
    }

    public static void Begin40(int A1, int B1, int C1, int A2, int B2, int C2) {
        int D = A1 * B2 - A2 * B1;
        if (D == 0) {
            System.out.println("No unique solution (D = 0)");
            return;
        }
        double x = (double) (C1 * B2 - C2 * B1) / D;
        double y = (double) (A1 * C2 - A2 * C1) / D;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    /**
     * This is helper method that checks that the input is non-negative number.
     */
    public static boolean validityChecker(double num1, double num2) {
        if (num1 < 0 || num2 < 0) {
            System.out.println("The inputs must be greater than zero");
            return true;
        } else {
            return false;
        }
    }
}
