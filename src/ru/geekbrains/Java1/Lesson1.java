package ru.geekbrains.Java1;

public class Lesson1 {
    public static void main(String[] args) {

        variableDataTypes();
        System.out.println();
        System.out.println(expression(10, 20, 30, 20));
        System.out.println();
        System.out.println(sumTwoNumbers(10, 3));
        System.out.println();
        positiveNegative(0);
        System.out.println();
        System.out.println(negativeNumber(-11));
        System.out.println();
        name("Настя");
        System.out.println();
        leapYear(2016);


    }

    public static void variableDataTypes() {

        byte b = 127;
        short s = 32000;
        int i = 222222332;
        long l = 44444444L;
        float f = 555555.555f;
        double d = 66.654;
        boolean bool = true;
        char c = 'C';

        String string = "Java";

        System.out.println("byte = " + b + ", short = " + s + ", int = " + i + ", long = " + l +
                ", float = " + f + ", double = " + d + ", boolean = " + bool + ", char = " + c + ", String = " + string);
    }

    public static int expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean sumTwoNumbers(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean negativeNumber(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void name(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int a) {
        if (a % 4 == 0 && (a % 400 == 0 || a % 100 != 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

}
