package com.company;

public class ScrBarWind implements ScrollBar {
    @Override
    public void scrollWindow() {
        System.out.println("right Scroll Bar Windows");
    }

    @Override
    public void execute() {
        scrollWindow();
    }
}
