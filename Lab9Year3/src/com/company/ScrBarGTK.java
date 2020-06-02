package com.company;

public class ScrBarGTK implements ScrollBar{
    @Override
    public void scrollWindow() {
        System.out.println("right Scroll Bar GTK");
    }

    @Override
    public void execute() {
        scrollWindow();
    }
}
