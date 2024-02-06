package com.company.oop.polymorphism;

public class Squ extends Shape{
    double l;
    double h;

    @Override
    double calculateAria(){
        return l * h;
    }
}
