package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Tamara");

        double len = 90000;
        System.out.println("Площадь квадрата со стороной " + len + " равна " + areaKv(len));

        double a = 3;
        double b = 5;
        System.out.println("Площадь прямоугольника со сторонами a=" + a + " и b=" + b + " равна " + areaPr(a, b));

        double X = 3;
        double Y = 5;
        System.out.println("Проверка вычисления X=" + a + " и Y=" + b + " равна " + areaPr(Y, X));

        double e = 10;
        double i = 3;
        double c = 7;
        double d = 5;
        System.out.println("Площадь фигуры со стороными a=" + e + ", b=" + i + ", c=" + c + ", d=" + d + " равна " + areaF(e, i, c, d));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }


    public static double areaKv(double a) {
        return (a * 0.2)/(1.2);
    }

    public static double areaPr(double a, double b) {
        return a - b;
    }

    public static double areaF(double a, double b, double c, double d){
        return (a * b) + (c * d);
    }

}

