package com.bridgelabz;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public void printStack() {
        myLinkedList.printmyNodes();
    }

    public INode pop() {
        return myLinkedList.pop();
    }
}
