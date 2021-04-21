package Collection;

public class MyLinkedList<T> implements MyList <T> {

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> previous;

        public Node(T item) {
            this.item = null;
            this.next = null;
            this.previous = null;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void MyLinkedList() {
        size = 0;
    }

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if (first == null) first = newNode;
        else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        Node<T> node = getNodeByIndex(index);
        if (node.previous == null) first = node.next;
        else node.previous.next = node.next;
        if (node.next == null) last = node.previous;
        else node.next.previous = node.previous;
        size--;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getValue(int index) {
        return getNodeByIndex(index).item;
    }

    private Node<T> getNodeByIndex(int index) {
        if (index < 0 || index >= size) throw new
                IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Node<T> result;
        if (size / 2 > index) {
            result = first;
            for (int i = 0; i < index; i++) result = result.next;
        } else {
            result = last;
            for (int i = size - 1; i > index; i--) result = result.previous;
        }
        return result;
    }
 

}

