package com.company;

import java.util.ArrayList;

public class ArrayStack<E> implements Stack<E> {

    private ArrayList<E> array;

    public ArrayStack()
    {
        array = new ArrayList<>();
    }

    @Override
    public E pop() {
        if(!array.isEmpty())
        {
            E value = array.get(array.size()-1);
            array.remove(array.size()-1);
            return value;
        }
        return null;
    }

    @Override
    public void push(E item) {
        array.add(item);
    }

    @Override
    public E peek() {
        return array.get(array.size()-1);
    }

    @Override
    public boolean isEmpty() {
        if(array.isEmpty())
            return true;
        return false;
    }

    @Override
    public String toString()
    {
        return array.toString();
    }
}
