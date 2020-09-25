package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Tamara");

        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(3, 7);
        System.out.println("Площадь прямоугольника со сторонами a=" + r.a + " и b=" + r.b + " равна " + r.area());

        double e = 10;
        double i = 3;
        double c = 7;
        double d = 5;
        System.out.println("Площадь фигуры со стороными a=" + e + ", b=" + i + ", c=" + c + ", d=" + d + " равна " + areaF(e, i, c, d));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double areaF(double a, double b, double c, double d){
        return (a * b) + (c * d);
    }

}

