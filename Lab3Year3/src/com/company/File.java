package com.company;

public class File extends Component {

    File(String name,int size){
        this.name=name;
        this.size=size;

    };
    @Override
    public int getSize() {
        return size;
    }
}
