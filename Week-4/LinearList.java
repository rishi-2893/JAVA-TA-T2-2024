// Implement Iterator in LinearList Example
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinearList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public LinearList(int capacity) {
        items = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T item) {
        if (size == items.length) {
            throw new IllegalStateException("List is full");
        }
        items[size++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinearListIterator();
    }

    private class LinearListIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[currentIndex++];
        }
    }

    public static void main(String[] args) {
        LinearList<String> list = new LinearList<>(3);
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
