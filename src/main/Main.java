package main;

import calc.Calc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println(calc.sum(3, 2)); // Сложение
        System.out.println(calc.sub(3, 2)); // Вычитание
        System.out.println(calc.mul(3, 2)); // Умножение
        System.out.println(calc.div(3, 2)); // Деление
    }
}