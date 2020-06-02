package com.company;

public abstract class Element {
    protected String color;
    protected int size;
    protected int coord_x;
    protected int coord_y;

    Element(String color,int size,int coord_x,int coord_y){
      this.color=color;
      this.size=size;
      this.coord_x=coord_x;
      this.coord_y=coord_y;
    }

    abstract void Draw() ;

    void ChangeChar(String color,int size,int coord_x,int coord_y) {
        this.color=color;
        this.size=size;
        this.coord_x=coord_x;
        this.coord_y=coord_y;
    }

    ElemMemento save() {
        return new ElemMemento(color,size,coord_x,coord_y);
    }
    void restore(ElemMemento el) {
        color=el.color;
        size=el.size;
        coord_x=el.coord_x;
        coord_y=el.coord_y;

    }
}
