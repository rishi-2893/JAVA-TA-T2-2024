// The AbstractCollection Class Example
import java.util.AbstractCollection;
import java.util.Iterator;

public class AbstractCollectionExample {
    public static void main(String[] args) {
        AbstractCollection<String> collection = new AbstractCollection<>() {
            private String[] elements = {"One", "Two", "Three"};
            private int size = elements.length;

            @Override
            public Iterator<String> iterator() {
                return new Iterator<>() {
                    private int index = 0;

                    @Override
                    public boolean hasNext() {
                        return index < size;
                    }

                    @Override
                    public String next() {
                        return elements[index++];
                    }
                };
            }

            @Override
            public int size() {
                return size;
            }
        };

        for (String element : collection) {
            System.out.println(element);
        }
    }
}
