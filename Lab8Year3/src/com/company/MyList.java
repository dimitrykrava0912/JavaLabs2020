package com.company;

public class MyList implements IterableMyList{
    public class MyListIterator implements TwoWayIterator{
        private MyList.Node currItem;



        private MyListIterator(){
            currItem = new Node(head, null, "");
        }

        @Override
        public boolean hasPrevious() {
            Node testItem = currItem;
            if(testItem.prev != null){
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            if(hasPrevious()){
                currItem = currItem.prev;
                return currItem.data;
            }
            return null;
        }

        public boolean hasNext() {
            Node testItem = currItem;
            if(testItem.next != null){
                return true;
            }
            return false;
        }

        public Object next() {
            if(hasNext()){
                currItem = currItem.next;
                return currItem.data;
            }
            return null;
        }

        public Object current() {
            return currItem.data;
        }

    }
    private class Node{
        private Node next;
        private Node prev;
        private Object data;

        public Node(Node next, Node prev, Object data) {
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

    public void addItem(Object item){
        tail = new Node(null, tail, item);
        if(head == null){
            head = tail;
        }
        else tail.prev.next = tail;
    }
}
