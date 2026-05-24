package main;

import java.util.Scanner;

public class Main {
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
    public static boolean isValidInput (int a, int b, int c) {
        return a >= 1 && a <= 100
                && b >= 1 && b <= 100
                && c >= 1 && c <= 100;
    }

    public static String result(int a, int b, int c) {
        if(!isValidInput(a, b, c)) {
            return "Invalid Input";
        }
        else if (isTriangle(a, b, c)) {
            if (a == b && a == c) {
                return "Equilateral";
            } else if (a == b || a == c || b == c) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
        else {
            return "Not a Triangle";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(result(a, b, c));
    }

}