package com.company;

import java.util.ArrayList;

public class ArrayQueue<E> implements Queue<E> {

    private ArrayList<E> myArray;

    public ArrayQueue()
    {
        myArray = new ArrayList<>();
    }

    // O(1)
    @Override
    public void enqueue(E item) {
        myArray.add(item);
    }

    // O(1)
    @Override
    public E dequeue() {
        
        if(!myArray.isEmpty())
        {
            E value = myArray.get(0);
            myArray.remove(0);
            return value;
        }
        return null;
    }

    // O(1)
    @Override
    public E peek() {
        return myArray.get(0);
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        if(myArray.isEmpty())return false;
        return true;
    }

    // O(1)
    @Override
    public int getSize() {
        return myArray.size();
    }
    // O(1)
    @Override
    public String toString()
    {
        return myArray.toString();
    }
}
