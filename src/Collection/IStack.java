package Collection;

public interface IStack<T> {
    void push(int value);
    int remove(int index) ;
    void clear() ;
    int  size() ;
    T peek();
    T pop() ;
}
