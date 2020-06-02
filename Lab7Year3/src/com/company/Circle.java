package com.company;

public class Circle extends Element {

    Circle(String color, int size, int coord_x, int coord_y) {
        super(color, size, coord_x, coord_y);
    }

    @Override
    void Draw() {
        System.out.println("Это круг "+color+" size:"+size+" coords x:"+coord_x+
                " y:"+coord_y);

    }
}
