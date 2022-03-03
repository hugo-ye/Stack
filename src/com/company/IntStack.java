package com.company;

public class IntStack {
    int[] array;
    int index;

    public IntStack(int size) {
        this.array = new int[size];
        this.index = 0;
    }

    public void push(int item) {
        array[index] = item;
        index++;
    }

    public void pop() {
        array[index] = 0;
        index--;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == array.length;
    }
}
