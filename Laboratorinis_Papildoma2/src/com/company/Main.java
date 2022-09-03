package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int k = 3;
    numbersAverage(k);

    }

    public static void numbersAverage(int k)
    {

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        ArrayQueue<Integer> temporaryArray = new ArrayQueue<>();
        ArrayQueue<Integer> average = new ArrayQueue<>();
        arrayQueue.enqueue(1); arrayQueue.enqueue(2);
        arrayQueue.enqueue(3); arrayQueue.enqueue(4);
        arrayQueue.enqueue(5); arrayQueue.enqueue(6);
        arrayQueue.enqueue(7); arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);


        int temp = 0;
        int n = arrayQueue.getSize();
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < k; j++){
                if(temp == 0){
                    int value = arrayQueue.dequeue();
                    temporaryArray.enqueue(value);
                    sum += value;
                }
                else if(temp < k){
                    average.enqueue(average.peek());
                    temp++;
                    break;
                }
                else{
                    if(j == 0) {
                        temporaryArray.enqueue(arrayQueue.dequeue());
                        temporaryArray.dequeue();
                    }
                    sum += temporaryArray.peek();
                    temporaryArray.enqueue(temporaryArray.dequeue());
                    temp++;
                }
            }
            if(temp == 0 || temp > k) {
                temp++;
                average.enqueue(sum / k);
            }
        }

        int amount = 0;
        int[] a = new int[average.getSize()];
        for(int i = 0; i < n; i++){
            a[amount] = average.dequeue();
            amount++;
        }
        for (int j : a) {
            System.out.print(j +  " ");
        }
    }
}
