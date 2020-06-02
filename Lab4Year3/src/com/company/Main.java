package com.company;
//7 bridge
//Визначити специфікації класів, які подають елементи графічного
//інтерфейсу користувача (GUI) – кнопка, вікно, тощо. Забезпечити
//розділення абстракції і реалізації таким чином, щоб елементи інтерфейсу
//могли мати реалізації для різних бібліотек (наприклад Qt та GTK) прозорі
//для користувача. Реалізувати метод малювання елементу.
public class Main {

    public static void main(String[] args) {
        System.out.println("---------START----------");
        ElementGUI elem=new Button(new QT());
        elem.Draw();
        System.out.println("\n-->Сменили библиотеку c QT на GTK<--\n");
        elem.library=new GTK();
        elem.Draw();
        System.out.println("-------------------");
        elem=new Window(new QT());
        elem.Draw();
        System.out.println("\n-->Сменили библиотеку c QT на GTK<--\n");
        elem.library=new GTK();
        elem.Draw();
        System.out.println("---------FINISH----------");
    }
}
