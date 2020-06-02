package com.company;

public class Main {

    public static void main(String[] args) {
	    DisplayeScreen screen = new DisplayeScreen(new WinApiFactory());
	    screen.addNewWindow();
	    screen.addButton();
	    screen.addButton();
	    screen.addScrB();
	    screen.draw();
	    screen=new DisplayeScreen(new GTKFactory());
        screen.addNewWindow();
        screen.addButton();
        screen.addButton();
        screen.addScrB();
        screen.draw();
    }
}
