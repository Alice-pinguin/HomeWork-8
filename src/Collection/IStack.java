package Collection;

public interface IStack <T> {
    void push(T value);
    void remove(int index) ;
    void clear() ;
    int  size() ;
    T peek();
    T pop() ;
}
