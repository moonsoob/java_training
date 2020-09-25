package ru.stqa.pft.sandbox;

/**
 * Created by Semina on 22.09.2020.
 */
public class Square {
    public double l;

    public Square(double len) {
        l = len;
    }

    public double area() {
        return this.l * this.l;
    }
}
