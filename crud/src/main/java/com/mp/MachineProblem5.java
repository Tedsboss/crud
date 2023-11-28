package com.mp;

import java.util.Scanner;

public class MachineProblem5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("INPUT: ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n >= 1) {
                    displayPattern(n);
                    break;
                }
            } else {
                System.out.println("INPUT ERROR...");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void displayPattern(int n) {

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i % 3 == 0) {
                        if (j % 3 == 0) {
                            System.out.print("/");
                        } else {
                            System.out.print("-");
                        }
                    } else if (i % 3 == 1) {
                        if (j % 3 == 1) {
                            System.out.print("/");
                        } else {
                            System.out.print("-");
                        }
                    } else if (i % 3 == 2) {
                        if (j % 3 == 2) {
                            System.out.print("/");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
                System.out.println();
            }
        }
    } // end of method displayPattern
} // class {}
