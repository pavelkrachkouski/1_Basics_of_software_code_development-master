package com.pavelkrachkouski.cycles;

import java.util.Arrays;
import java.util.Scanner;

public class CyclesTasks {



    //Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа.
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = scan.nextInt();
        int sum = 0;
        if (n > 1) {
            for (int i =1; i <= n; i++) {
                sum += i;
            }
            System.out.print("Sum: " + sum);
        }
        else {
            System.out.print("N > 0");
        }
    }



    //Вычислить значения функции на отрезке [а,b] c шагом h
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scan.nextInt();
        System.out.print("Input b: ");
        int b = scan.nextInt();
        System.out.print("Input h: ");
        int h = scan.nextInt();
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                System.out.println("y = " + i);
            }
            else {
                System.out.println("y = " + -i);
            }
        }
    }



    //ВНайти сумму квадратов первых ста чисел
    public static void task3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i,2);
        }
        System.out.print("Sum = " + sum);
    }



    //Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void task4() {
        int p = 1;
        for (int i = 1; i <= 200; i++) {
            p *= Math.pow(i,2);
        }
        System.out.print("Произведение квадратов первых 200 чисел = " + p);
    }



    //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид:
    public static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input e: ");
        double e = scan.nextDouble();
        System.out.print("Input n: ");
        int n = scan.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double a = (1 / (Math.pow(2,i))) + (1 / (Math.pow(3, i)));
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("Sum: " + sum);
    }



    //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void task6() {
        System.out.println((int)Character.MAX_VALUE);
        //выведем 256 т.к. 65 535 очень много
        for (int i = 1; i <= 255; i++) {
            System.out.println("Числу " + i + " соответствует смвол: " + (char)i);
        }
    }



    //Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры.
    public static void task7() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = scan.nextInt();
        System.out.print("Input n: ");
        int n = scan.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != 1 && j != i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }
    }



    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void task8() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scan.nextInt();
        System.out.print("Input b: ");
        int b = scan.nextInt();

        //Переводим число в массив символов
        char[] first = String.valueOf(a).toCharArray();
        char[] second = String.valueOf(b).toCharArray();

        //Сортируем массив символов по возрастанию
        Arrays.sort(first);
        Arrays.sort(second);

        //Формируем строки из неповторяющихся цифр
        StringBuilder f = new StringBuilder();
        StringBuilder s = new StringBuilder();

        f.append(first[0]);
        for (int i = 1; i < first.length; i++) {
            if (first[i] != first[i - 1]) {
                f.append(first[i]);
            }
        }

        s.append(second[0]);
        for (int i = 1; i < second.length; i++) {
            if (second[i] != second[i - 1]) {
                s.append(second[i]);
            }
        }

        first = f.toString().toCharArray();
        second = s.toString().toCharArray();

        System.out.print("В запись как первого так и второго числа входят цифры: ");
        if (first.length <= second.length) {
            for (char c : first) {
                for (char value : second) {
                    if (value == c) {
                        System.out.print(value + " ");
                    }
                }
            }
        }
        else {
            for (char c : second) {
                for (char value : first) {
                    if (value == c) {
                        System.out.print(value + " ");
                    }
                }
            }
        }
    }



}
