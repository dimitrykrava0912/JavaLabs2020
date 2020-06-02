package com.company;

public class GTKW implements Window{
    @Override
    public void drawWindow() {
        System.out.println("GTK window drawn");
    }

    @Override
    public void execute() {
        drawWindow();
    }
}
