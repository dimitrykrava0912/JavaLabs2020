package com.company;

public class Button extends ElementGUI {
    public Button(Library l) {
        super(l);
    }

    @Override
    void Draw() {
        System.out.println("Рисуем Кнопку:");
        super.Draw();
    }
}
