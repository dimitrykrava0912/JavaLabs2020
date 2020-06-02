package com.company;
//var7 iterator
//Визначити специфікації класів, які інкапсулюють лінійний список
//об'єктів та ітератор послідовного обходу у прямому та зворотньому
//напрямках для цієї структури.
public class Main {

    public static void main(String[] args) {

        MyList testTable = new MyList();

        testTable.addItem("Welcome");
        testTable.addItem(2);
        testTable.addItem("Home");
        testTable.addItem("Dima");
        testTable.addItem("");

        System.out.println("-----standart reltable------");
        MyList.MyListIterator iter = testTable.getIterator();
        while(iter.hasNext()) System.out.println("-> "+iter.next());
        System.out.println("-----reverse order----------");
        while(iter.hasPrevious()) System.out.println("-> "+iter.previous());
        iter=testTable.getIterator();

    }
}
