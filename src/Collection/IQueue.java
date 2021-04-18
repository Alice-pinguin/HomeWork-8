package Collection;

public interface IQueue <T> {
    void add(Object value);
    Object remove(int index);
    void clear();
    int size();
    T peek();
    int pop();
}
