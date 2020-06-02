package com.company;
//1 Iterator
//Визначити специфікації класів, які інкапсулюють лінійний список цілих
//чисел та реалізують можливість звичайного послідовного обходу та
//послідовного обходу в упорядкованій структурі.
public class Main {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.addItem(2);
        list.addItem(4);
        list.addItem(6);
        list.addItem(8);
        list.addItem(9);
        list.addItem(7);
        list.addItem(5);
        list.addItem(3);
        list.addItem(1);
        System.out.println("-----standart reltable------");
        MyList.MyListIterator iter = list.getIterator();
        while(iter.hasNext()) System.out.println("-> "+iter.next());
        System.out.println("-----sorted reltable------");
        MyList.SortlistIterator iterSorted = list.getSortedIterator();
        while(iterSorted.hasNext()) System.out.println("-> "+iterSorted.next());

    }
}
