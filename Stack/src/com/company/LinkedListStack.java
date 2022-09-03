package com.company;

import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack(){
        list = new LinkedList<>();
    }

    @Override
    public E pop() {
        if(!list.isEmpty())
        {
            E value = list.getLast();
            list.removeLast();
            return value;
        }
        return null;
    }

    @Override
    public void push(E item) {
        list.add(item);
    }

    @Override
    public E peek() {
        return list.getLast();
    }

    @Override
    public boolean isEmpty() {
        if(list.isEmpty()) return true;
        return false;
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
}
