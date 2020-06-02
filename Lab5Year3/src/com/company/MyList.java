package com.company;

import java.util.ArrayList;

public class MyList implements IterableList{
    int size = 0;
    public class MyListIterator implements IntIterator{
        private MyList.Node currItem;


        private MyListIterator(){
            currItem = new Node(head, null, 0);
        }


        public boolean hasNext() {
            Node testItem = currItem;
            if(testItem.next != null){
                return true;
            }
            return false;
        }

        public int next() {
            if(hasNext()){
                currItem = currItem.next;
                return currItem.data;
            }
            return 0;
        }

        public int current() {
            return currItem.data;
        }

    }

    public class SortlistIterator implements IntIterator {
        private MyList.Node currItem;
        MyList sorted;

        public SortlistIterator(MyList list)
        {
            sorted=new MyList();
            MyList.MyListIterator iter = list.getIterator();
            sorted.addItem(iter.current());
            while(iter.hasNext())
            {
                sorted.addItem(iter.next());
            }

            currItem = sorted.head;
                        for(int i = 0;i < sorted.size; i++)
            {
               MyList.Node cur = sorted.head;
               for (int j = 1; j <sorted.size; j++)
               {
                   if(cur.data > cur.next.data)
                   {
                       int temp = cur.data;
                       cur.data = cur.next.data;
                       cur.next.data = temp;
                   }
                   cur = cur.next;
               }
            }
            currItem = sorted.head;

        }

        public boolean hasNext() {
            Node testItem = currItem;
            if(testItem.next != null){
                return true;
            }
            return false;
        }

        public int next() {
            if(hasNext()){
                currItem = currItem.next;
                return currItem.data;
            }
            return 0;
        }

        public int current() {
            return currItem.data;
        }
    }

    private class Node{
        private Node next;
        private Node prev;
        private int data;

        public Node(Node next, Node prev, int data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }
    private Node head;
    private Node tail;


    @Override
    public MyList.MyListIterator getIterator() {
        return head == null ? null: new MyListIterator();
    }
    public MyList.SortlistIterator getSortedIterator() {
        return head == null ? null: new SortlistIterator(this);
    }

    public void addItem(int item){
        tail = new Node(null, tail, item);
        if(head == null){
            head = tail;
        }
        else tail.prev.next = tail;
        size++;
    }
}
