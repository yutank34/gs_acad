package com.company.exericies.ex02;

import com.company.exericies.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("面積は" + circle.getArea() + "円周は" + circle.getCircumference());
    }
}
