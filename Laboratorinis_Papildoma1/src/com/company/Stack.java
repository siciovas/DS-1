package com.company;

public interface Stack<E>
{
     E pop();
    void push (E item);
    E peek();
    boolean isEmpty();
}
