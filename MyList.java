import java.util.Iterator;

public interface MyList<E> {
    void add(E value);
    void remove(int index);
    void clear();
    int size();
    E getValue(int index);




}


