package com.company;
//var0
//Визначити специфікації класів, які подають у векторному редакторі
//графічні елементи (коло, трикутник тощо) з різними атрибутами (колір,
//позиція, розмір, тощо). Реалізувати механізм збереження/встановлення
//стану елемента.
public class Main {

    public static void main(String[] args) {
		System.out.println("------firstly input------");
	    Element triangle=new Triangle("red",20,12,13);
	    Element circle=new Circle("blue",50,2,5);
	    triangle.Draw();
	    circle.Draw();
	    MementoHistory history=new MementoHistory();
	    history.circleHistory.push(circle.save());
	    history.triangleHistory.push(triangle.save());
	    triangle.ChangeChar("green",40,22,11);
	    circle.ChangeChar("black",23,21,25);
		System.out.println("------changed------");
		triangle.Draw();
		circle.Draw();
		System.out.println("------restored------");
		triangle.restore(history.triangleHistory.pop());
		circle.restore(history.circleHistory.pop());
		triangle.Draw();
		circle.Draw();
    }
}
