package com.company;

public class WinApiFactory implements AbstarctFactory {
    @Override
    public Button createButton() {
        return new WinApiB();
    }

    @Override
    public Window createWindow() {
        return new WinApiW();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new ScrBarWind();
    }
}
