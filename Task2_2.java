package com.company;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

class Task2_2 {
    public static void main(String[] args) {

        System.out.println("Is equal a, b and c?");

        double a = UserInput.input("input a: ");
        double b = UserInput.input("input b: ");
        double c = UserInput.input("input c: ");

        boolean result = equalLogic.isAequalBandC(a, b, c);

        String msg = result ? "Yes" : "No";

        ConsolePrinter.print(msg);
    }
}

class equalLogic {
    public static boolean isAequalBandC(double a, double b, double c) {
        return (a == b) && (a == c) && (b == c);
    }
}

class UserInput {
    public static final Scanner in = new Scanner(System.in);
    public static double input(String msg) {
        System.out.println(msg);
        return in.nextDouble();
    }
}

class ConsolePrinter {
    public static void print(String msg) {
        System.out.print(msg);
    }
}
