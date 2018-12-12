package com.company;

import java.util.Scanner;

class Task2_1 {
    public static void main(String[] args) {
        Calculator.calculation();
    }
}

class dinosaurScanner {
    public static double scanning() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter dinosaur mass in kg: ");
        double massKg = scan.nextInt();
        return massKg;
    }
}

class Calculator {
    public static void calculation() {
        double kg = dinosaurScanner.scanning();
        double mg = kg * 10e-6;
        double g = kg * 10e-3;
        double t = kg * 1000;
        System.out.println(mg);
        System.out.println(g);
        System.out.println(t);
    }
}
