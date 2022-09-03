package com.company;

import java.util.ArrayList;

public class ArrayQueue<E> implements Queue<E> {

    private ArrayList<E> array;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(){
        array = new ArrayList<>();
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(E item) {
        if(item != null) {
            array.add(item);
            rear++;
            size++;
        }
    }

    @Override
    public E dequeue() {
        if (front >= rear) {
            return null;
        } else {
            E value = array.get(front);
            front++;
            size--;
            return value;
        }
    }

    @Override
    public E peek() {
        if(isEmpty()) return null;
        return array.get(front);
    }

    @Override
    public boolean isEmpty() {
        if(array.isEmpty()) return true;
        return false;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return array.toString();
    }
}