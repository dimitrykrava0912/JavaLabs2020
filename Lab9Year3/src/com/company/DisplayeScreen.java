package com.company;

import java.util.LinkedList;

public class DisplayeScreen {
    private AbstarctFactory inside;
    private LinkedList<Widget> objects= new LinkedList<Widget>();

    public DisplayeScreen(AbstarctFactory factory){
        inside = factory;
    }

    public void draw(){

        for (Widget w:objects) {
            w.execute();
        }
    }

    public void addScrB(){
        objects.add(inside.createScrollBar());
    }

    public void addButton(){
        objects.add(inside.createButton());
    }

    public void addNewWindow(){
        objects.add(inside.createWindow());
    }
}
