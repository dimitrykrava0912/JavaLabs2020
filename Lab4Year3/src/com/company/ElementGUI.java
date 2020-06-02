package com.company;

public abstract class ElementGUI {
    protected Library library;
    public String name = null;


    public ElementGUI(Library l){
        library=l;
    }

    void Draw() {
        library.Shape();
        library.SetColour();
    }
}
