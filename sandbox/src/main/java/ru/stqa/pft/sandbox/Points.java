package ru.stqa.pft.sandbox;

public class Points {

    public static void main(String[] args) {

        double x = 5;
        double y = 11;

        System.out.println("Расстояния между двумя точками = " + points(x, y));
    }

    public static double points(double x, double y){
        return Math.sqrt(x);
    }
}