package Collection;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyHashMap <K,V> implements IHashMap {
    public static class Node {
        private Object key;
        private Object value;
        private int hash;
        private Node next;

        public Node(Object value, Object key) {

            this.key = key;
            this.value = value;
            next = null;
            if (key != null)
                hash = key.hashCode();
        }
        public Object getValue() {
            return value;
        }
        public Node getNext() {
            return next;
        }
        public Object getKey() {
            return key;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public void clearNext() {
            next = null;
        }
        public void setValue (Object value) {
            this.value = value;
        }
    }
    private static int capacity = 16;
    Node[] buckets;
    public MyHashMap() {
        buckets = new Node[capacity];
        for (int x = 0; x < capacity; x++) {
            Node node = new Node(null, null);
            buckets[x] = node;
        }
    }

     public boolean isEmpty() {
        for (int x = 0; x < buckets.length; x++) {
            if (buckets[x] == null) {
            } else {
                return false;
            }
        }
        return true;
     }

    public boolean containsKey(Object key) {
        Node current = buckets[calculateIndex(key)];
        if (current.getKey().equals(key))
            return true;
        while (current.getNext() != null) {
            if (current.getKey().equals(key))
                return true;
            current = current.getNext();
        }
        return false;
    }

    public int calculateIndex(Object key) {
        int index = key.hashCode() & (buckets.length - 1);
        return index;
    }

    @Override
    public void put(Object key, Object value) {
        Node node = new Node(value, key);
        int index = calculateIndex(key);
        Node current = buckets[index];
        if (buckets[index].getKey() == null) {
            buckets[index] = node;
        } else if (containsKey(key)) {
            throw new NoSuchElementException("Key in use");
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    @Override
    public Object remove(Object key, Object value) {
        Node current = buckets[calculateIndex(key)];
        Object temp = null;
        if (current.getData() == value && current.getKey() == key) {
            temp = current.getData();
            buckets[calculateIndex(key)] = current.getNext();
        }
        while (current.getNext() != null) {
            if (current.getNext().getData() == value) {
                temp = current.getNext().getData();
                if (current.getNext().getNext() == null) {
                    current.clearNext();
                } else {
                    current.setNext(current.getNext().getNext());
                }
            } else {
                current = current.getNext();
            }
        }
        return temp;
    }

    @Override
    public Object get(Object key) {
        Node current = buckets[calculateIndex(key)];
        if (current.getKey() == key)
            return current.getData();
        while (current.getNext() != null) {
            if (current.getKey() == key) {
                return current.getData();
            }
        }
        return null;
    }

    @Override
    public int size() {
        int count = 0;
        for (int x = 0; x < buckets.length; x++) {//fix loop(null point)
            Node current = buckets[x];//must return in int

            if (current.getData() != null)
                count++;
            while (current.getNext() != null) {
                count++;
                current = current.getNext();
            }
        }
        return count;
    }

    @Override
    public void clear() {
        for (int i = 0; i < buckets.length; ++i) {
            buckets[i] = null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;
        return Arrays.equals(buckets, myHashMap.buckets);
    }

    @Override
    public int hashCode() {
            int prime = 13;
            int mul = 11;
            if (buckets != null) {
                int hashCode = prime * mul + buckets.hashCode();
                return hashCode;
            }
            return 0;
        }
    @Override
    public String toString() {
        return "MyHashMap" + Arrays.toString(buckets);
    }
}
