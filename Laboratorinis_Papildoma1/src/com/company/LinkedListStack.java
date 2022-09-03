package com.company;

import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> stackList;

    public LinkedListStack()
    {
        stackList = new LinkedList<>();
    }

    @Override
    public E pop() {
        if(!stackList.isEmpty())
        {
            E value = stackList.getLast();
            stackList.removeLast();
            return value;
        }
        return null;
    }

    @Override
    public void push(E item) {
        stackList.add(item);
    }

    @Override
    public E peek() {
       return  stackList.getLast();
    }

    @Override
    public boolean isEmpty() {
       if(stackList.isEmpty()) return true;
       return false;
    }

    @Override
    public String toString()
    {
        return stackList.toString();
    }
}
