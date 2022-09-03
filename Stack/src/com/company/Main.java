package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        System.out.println(arrayStack.isEmpty());

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        System.out.println(arrayStack);

        int peekValue = arrayStack.peek();
        int popValue = arrayStack.pop();
        System.out.println(arrayStack);

        System.out.println(peekValue);
        System.out.println(popValue);
        System.out.println(arrayStack.isEmpty());

        //-------------------------------------------------------------------------------------------------------------

        System.out.println();

        //-------------------------------------------------------------------------------------------------------------

        LinkedListStack<Integer> listStack = new LinkedListStack<>();
        System.out.println(listStack.isEmpty());

        listStack.push(1);
        listStack.push(2);
        listStack.push(3);
        listStack.push(4);
        listStack.push(5);
        int peekListValue = listStack.peek();
        int popListValue = listStack.pop();
        System.out.println(listStack);
        System.out.println(peekListValue);
        System.out.println(popListValue);
        System.out.println(listStack.isEmpty());


    }
}
