package com.company.oop.polymorphism;

public class Circle extends Shape{
    double r;
    @Override
    double calculateAria(){
        return Math.PI * r * r;
    }

}
