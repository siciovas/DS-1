package com.company;

public interface Queue<E> {
    void enqueue(E item);
    E dequeue();
    E peek();
    boolean isEmpty();
    int getSize();
}
