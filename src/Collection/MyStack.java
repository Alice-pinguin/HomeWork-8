package Collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack <T> implements IStack {
    private int size;
    private int[] stackArray;
    private int top;

    public MyStack(int max) {
        this.size = max;
        stackArray = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            throw new NoSuchElementException("Stack is Full");
        }
        stackArray[++top] = value;
        size++;
    }

    @Override
    public int remove(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stackArray[top--];

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            stackArray[i] = 0;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        return stackArray[top];
    }

    @Override
    public Object pop() {
        return remove(top);
    }

    @Override
    public String toString() {
        return "MyStack" + Arrays.toString(stackArray);
    }
}


