package Collection;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack <T> implements IStack<T> {
    private Object[] stackArray;
    private int size;

    public MyStack(int capacity) {
        this.stackArray = new Object[capacity];
        this.size = 0;
    }
      private boolean isEmpty(){
        return size==0;
    }
    @Override
    public void push(T value) {
           if (size == stackArray.length-1) {
            Object[] newArray = new Object[stackArray.length * 2];
            System.arraycopy(stackArray,0,newArray,0,stackArray.length);
            stackArray=newArray;
    }
            stackArray[size++] = value;
    }
    @Override
    public void  remove(int index) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stackArray[index]=null;
        Object[] newArray = new Object[stackArray.length-1];
    System.arraycopy(stackArray,0,newArray,0,stackArray.length-1);
    }

    @Override
    public void clear() {
            for (int i = 0; i < stackArray.length; i++)
                stackArray[i] = null;
                size = 0;
            }
    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }
        return (T) stackArray[0];
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) (stackArray[0]=null);
    }
    @Override
    public String toString() {
        return "MyStack" + Arrays.toString(stackArray);
    }
}


