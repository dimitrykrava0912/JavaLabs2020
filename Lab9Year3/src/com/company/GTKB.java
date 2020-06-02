package com.company;

public class GTKB implements Button {
    @Override
    public void drawButton() {
        System.out.println("GTK button drawn");
    }

    @Override
    public void execute() {
        drawButton();
    }
}
