package com.rajatigor.pbo;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Triangle
        Shape segitiga = new Triangle(5, 6);

        // membuat objek dari class Circle
        Shape lingkaran = new Circle(10);


        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}
