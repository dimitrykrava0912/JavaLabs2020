package com.company;

public class MathFunction {
    Sys system;
    MathFunction(Sys sys){
        setSystem(sys);
    }
    void setSystem(Sys sys){
        this.system=sys;
    };
    void drawGraph(){
        system.PrintGraph();
    }
}
