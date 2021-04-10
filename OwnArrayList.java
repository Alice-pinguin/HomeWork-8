import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

class OwnArrayList <E> implements  MyList<E> {
    private E[] array;
    private int index;
    private int size;
    private static final int capacity = 20;
  //конструктор
    public OwnArrayList(E[] array) {
        array = (E[]) new Object[capacity];
    }

    // добавление элемента
    @Override
    public void add(E value) {
        if (index == array.length) {
            E[] newArray = (E[]) new Integer[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, index - 1);
            array[index] = value;
            index++;
            size++;
        }
    }
    // удаление элемента
    @Override
    public void remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        E oldValue = array[index];
        int value = size - index - 1;
        if (value > 0) {
            System.arraycopy(array, index + 1, array, index, value);
        }
        array[--size] = null;
    }

    // очистка коллекции
    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;
        size = 0;
    }

    // размер коллекции
    @Override
    public int size() {
        return size();
    }

    // узнать значение по индексу
    @Override
    public E getValue(int index) {
        return (E) array[index];
        }
        

    public static void main(String[] args) {

    }

}


