package com.company;

import java.util.LinkedList;

public class LinkedListQueue<E> implements Queue<E>
{
    private LinkedList<E> list;

    public LinkedListQueue()
    {
        list = new LinkedList<>();
    }


    @Override
    public void enqueue(E item) {
        list.add(item);
    }

    @Override
    public E dequeue() {
        if(!list.isEmpty())
        {
            return list.removeFirst();
        }
        return null;
    }

    @Override
    public E peek() {
        return list.peekFirst();
    }

    @Override
    public boolean isEmpty() {
       if(list.isEmpty()) return true;
       return false;
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
