package com.example.mytestapp;public class Triangle {
    private double height;
    private double length;

    public Triangle(double height, double length) {
        this.height = height;
        this.length = length;
    }
    public double getArea(){
        return height*length;
    }
}
