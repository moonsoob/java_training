package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Tamara");

        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(3, 7);
        System.out.println("Площадь прямоугольника со сторонами a=" + r.a + " и b=" + r.b + " равна " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}

