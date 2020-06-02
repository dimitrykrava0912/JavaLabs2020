package com.company;

import java.util.ArrayList;

public class Folder extends Component {
    private ArrayList<Component>components=new ArrayList<Component>(){

    };

    Folder(String name){
        this.name=name;
        this.size=0;
    }
    @Override
    public int getSize() {
        size=0;
        for (Component c:components) {
            size+=c.getSize();
        }
        return size;
    }

    public void add(Component component){
        components.add(component);
    }
}
