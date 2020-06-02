package com.company;

public class WinApiW implements Window {
    @Override
    public void drawWindow() {
        System.out.println("WinApi window drawn");
    }

    @Override
    public void execute() {
        drawWindow();
    }
}
