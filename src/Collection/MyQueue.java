package Collection;
import java.util.Arrays;

public class MyQueue <T> implements IQueue<T>{
    private Object [] queueArray;
    private int size;
    private int capacity=10;
    public MyQueue () {
        queueArray = new Object[capacity];
        size=0;
    }

    @Override
    public void add(T value) {
        if (value == null) {
            throw new NullPointerException();
        }
        if (size >= queueArray.length) {
            growQueue();
        }
        queueArray[size++] = value;
    }
    private void growQueue() {
        int newCapacity = queueArray.length + 1;
        queueArray = Arrays.copyOf(queueArray, newCapacity);
    }
    @Override
    public T remove(int index) {
        for (int i = index; i < size; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        queueArray[size--] = null;
        return null;
    }
    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            queueArray[i] = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        return (T) queueArray[0];
    }

    @Override
    public T pop() {
        return remove(0);
    }

    @Override
    public String toString() {
        return "queueArray=" + Arrays.toString(queueArray);
    }
}
