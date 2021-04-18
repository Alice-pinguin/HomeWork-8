package Collection;

import java.util.Arrays;

public class MyArrayList<T> implements MyList{
    private int size = 16;
    private  int rate = 4;
    private Object[] array = new Object[size];
    private int pointer = 0;

    @Override
    public void add(Object value) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = value;
    }
    @Override
    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > size && pointer < array.length / rate)
            resize(array.length/2);
       }

    @Override
    public void clear() {
        for (int i = 0; i<pointer; i++)
            array[i] = null;
            size=0;
    }

    public int size() {
        return pointer;
    }
    @Override
    public T getValue(int index) {
        return (T) array[index];
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public String toString() {
        return "MyArrayList" + Arrays.toString(array);
    }
}
