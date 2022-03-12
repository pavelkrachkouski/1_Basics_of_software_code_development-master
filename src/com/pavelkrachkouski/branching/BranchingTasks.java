package com.pavelkrachkouski.branching;

import java.util.Scanner;

public class BranchingTasks {



    //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("First angle: ");
        int x = scan.nextInt();
        System.out.print("Second angle: ");
        int y = scan.nextInt();
        //сумма углов треугольника равна 180, значит третий угол равен
        int z = 180 - x - y;
        System.out.println("Third angle: " + z);
        if (z > 0 && x > 0 && y > 0) {
            System.out.println("The triangle exists");
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("The triangle is rectangular!");
            }
        }
        else {
            System.out.print("The triangle NOT exists");
        }
    }



    //Найти max{min(a, b), min(c, d)}
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scan.nextInt();
        System.out.print("Input b: ");
        int b = scan.nextInt();
        System.out.print("Input c: ");
        int c = scan.nextInt();
        System.out.print("Input d: ");
        int d = scan.nextInt();
        System.out.println("Max: " + Math.max(Math.min(a,b),Math.min(c,d)));
        if (a > b) {
            a = b;
        }
        if (c > d) {
            c = d;
        }
        if (a > c) {
            System.out.println("Max: " + a);
        }
        else {
            System.out.println("Max: " + c);
        }
    }



    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x1: ");
        int x1 = scan.nextInt();
        System.out.print("Input y1: ");
        int y1 = scan.nextInt();
        System.out.print("Input x2: ");
        int x2 = scan.nextInt();
        System.out.print("Input y2: ");
        int y2 = scan.nextInt();
        System.out.print("Input x3: ");
        int x3 = scan.nextInt();
        System.out.print("Input y3: ");
        int y3 = scan.nextInt();
        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Точки лежат на одной линии.");
        }
        else {
            System.out.println("Точки НЕ лежат на одной линии.");
        }
    }



    //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = scan.nextInt();
        System.out.print("Input B: ");
        int b = scan.nextInt();
        System.out.print("Input x: ");
        int x = scan.nextInt();
        System.out.print("Input y: ");
        int y = scan.nextInt();
        System.out.print("Input z: ");
        int z = scan.nextInt();
        if ((a >= x && b >= y) || (a >= y && b >= x) || (a >= x && b >= z) || (a >= z && b >= x) || (a >= z && b >= y) || (a >= y && b >= z)) {
            System.out.println("Пройдет");
        }
        else {
            System.out.println("НЕ пройдет");
        }
    }



    //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = scan.nextDouble();
        double f;
        if (x <= 3) {
            f = Math.pow(x,2) - 3*x +9;
            System.out.println("F(x) = " + f);
        }
        else {
            f = 1 / (Math.pow(x,3)+6);
            System.out.println("F(x) = " + f);
        }
    }



}
