package com.bridgelabz;

public class Queue<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    /* push the Node to stack */
    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    /* peek the top node in stack */
    public INode peek() {
        return myLinkedList.head;
    }

}
