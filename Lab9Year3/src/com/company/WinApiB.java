package com.company;

public class WinApiB implements Button {
    @Override
    public void drawButton() {
        System.out.println("WinApi button drawn");
    }

    @Override
    public void execute() {
        drawButton();
    }
}
