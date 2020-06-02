package com.company;

public class GTKFactory implements AbstarctFactory {
    @Override
    public Button createButton() {
        return new GTKB();
    }

    @Override
    public Window createWindow() {
        return new GTKW();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new ScrBarGTK();
    }
}
