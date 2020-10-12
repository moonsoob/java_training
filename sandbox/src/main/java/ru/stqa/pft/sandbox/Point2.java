package ru.stqa.pft.sandbox;

public class Point2 {
    public double x;
    public double y;

    public Point2(double x, double y)    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point2 other){
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }
}
