package com.company;
//var2 Strategy
///Визначити специфікації класу, який містить математичну функцію та
//метод її відображення у вигляді графіка. Забезпечити можливість
//динамічної зміни системи координат графіка (декартова, полярна тощо)
//шляхом зовнішньої параметризації.
public class Main {

    public static void main(String[] args) {
	    Sys sys=new DecartSys();
	    MathFunction func=new MathFunction(sys);
	    func.drawGraph();
	    sys=new PolarSys();
	    func=new MathFunction(sys);
	    func.drawGraph();
    }
}
