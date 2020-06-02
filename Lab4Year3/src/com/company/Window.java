package com.company;

public class Window extends ElementGUI {
    public Window(Library l) {
        super(l);
    }

    @Override
    void Draw() {
        System.out.println("Рисуем Окно: ");
        super.Draw();
    }
}
