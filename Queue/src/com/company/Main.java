package com.company;

public class Main {

    public static void main(String[] args) {

	ArrayQueue<Integer> array = new ArrayQueue<>();
	System.out.println(array.isEmpty());

	array.enqueue(1);
	array.enqueue(2);
	array.enqueue(3);
	array.enqueue(4);
	array.enqueue(5);
	int arraypeek = array.peek();
	int arraydeq = array.dequeue();
	System.out.println(array);
	System.out.println(arraypeek);
	System.out.println(arraydeq);
	System.out.println(array.isEmpty());

	//-----------------------------------------------------------------------------------------------------------------

		LinkedListQueue<Integer> list = new LinkedListQueue<>();
		System.out.println(list.isEmpty());

		list.enqueue(1);
		list.enqueue(2);
		list.enqueue(3);
		list.enqueue(4);
		list.enqueue(5);
		int listpeek = list.peek();
		int listdeq = list.dequeue();

		System.out.println(list);
		System.out.println(listpeek);
		System.out.println(listdeq);
		System.out.println(list.isEmpty());



    }
}
