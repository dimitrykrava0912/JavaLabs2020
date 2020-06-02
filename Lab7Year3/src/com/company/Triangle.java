package com.company;

public class Triangle extends Element {

    Triangle(String color, int size, int coord_x, int coord_y) {
        super(color, size, coord_x, coord_y);
    }

    @Override
    void Draw() {
        System.out.println("Это треугольник "+color+" size:"+size+" coords x:"+coord_x+
                " y:"+coord_y);
    }
}
