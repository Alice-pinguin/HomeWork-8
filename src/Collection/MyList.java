package Collection;

public interface  MyList <T> {
    void add(Object value);
    void remove(int index);
    void clear();
    int size();
    T getValue(int index);
}

