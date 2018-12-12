package com.company;

import java.util.Scanner;

class Task2_3 {
    public static void main(String[] args) {
        double r1 = UserInput.input("input r1: ");
        double r2 = UserInput.input("input r2: ");

        double s = Logic.run(r1, r2);

        Console.output(s);
    }
}

class Logic {
    public static double run(double r1, double r2) {
        return 3.14 * (r1 * r1 - r2 * r2);
    }
}

class UserInput {
    public static final Scanner in = new Scanner(System.in);
    public static double input(String msg) {
        System.out.println(msg);
        return in.nextDouble();
    }
}

class Console {
    public static void output(double s) {
        System.out.print(s);
    }
}
