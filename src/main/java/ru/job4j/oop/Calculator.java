package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + this.multiply(y) + this.divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rslSum = sum(10);
        int rslMinus = minus(5);
        int rslMultiply = calculator.multiply(5);
        int rslDivide = calculator.divide(15);
        int rslSumAllOperation = calculator.sumAllOperation(15);
        System.out.println(rslSum);
        System.out.println(rslMinus);
        System.out.println(rslMultiply);
        System.out.println(rslDivide);
        System.out.println(rslSumAllOperation);
    }
}
