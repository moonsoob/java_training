package ru.stqa.pft.sandbox;

public class Distance2 {

    public static void main(String[] args){

        Point2 p1 = new Point2(9, 6);
        Point2 p2 = new Point2(8, 4);
        System.out.println("Расстояние между точками " + p1.distance(p2));
    }

}
