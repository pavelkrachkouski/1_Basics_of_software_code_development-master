package com.pavelkrachkouski.linear;

import java.util.Scanner;

public class LinearTasks {



    //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scan.nextDouble();
        System.out.print("Input b: ");
        double b = scan.nextDouble();
        System.out.print("Input c: ");
        double c = scan.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }



    //Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scan.nextDouble();
        System.out.print("Input b: ");
        double b = scan.nextDouble();
        System.out.print("Input c: ");
        double c = scan.nextDouble();
        double z = ( (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) ) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Value = " + z);
    }



    //Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = scan.nextDouble();
        System.out.print("Input y: ");
        double y = scan.nextDouble();
        double z = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x * y);
        System.out.println("Value = " + z);
    }



    //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.
    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input R (nnn.ddd): ");
        double r = scan.nextDouble();
        r = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println("Value = " + r);
    }



    //Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input T: ");
        int t = scan.nextInt();
        int h = t/3600;
        int m = (t - h * 3600)/60;
        int s = t%60;
        System.out.println(h + "ч " + m + "мин " + s + "с");
    }



    //Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    //принадлежит закрашенной области, и false — в противном случае:
    public static void task6() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = scan.nextInt();
        System.out.print("Input y: ");
        int y = scan.nextInt();
        System.out.println(y > 0 && y <= 4 && x >= -2 && x <= 2 || y <= 0 && y >= -3 && x >= -4 && x <= 4);
    }



}
