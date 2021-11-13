package design_patterns.iterator_v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FastList<T> implements Container {

    private ArrayList<T> collection;

    public void add(T element) {
        collection.add(element);
    }

    public int getIndexSize() {
        return this.collection.size();
    }

    public void print() {
        this.collection.forEach(System.out::println);
    }

    public FastList(ArrayList<T> collection) {
        this.collection = new ArrayList<>();
        this.collection = collection;
    }

    public FastList() {
        this.collection = new ArrayList<>();
    }

    @Override
    public Iterator getIterator() {
        return new FastIterator();
    }

    public class FastIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return collection.size() > index;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                int currentIndex = index;
                index++;
                return collection.get(currentIndex);
            } else {
                throw new IndexOutOfBoundsException();
            }

        }

        @Override
        public void removeRemaining() {
            for (int i = index; i < collection.size(); i++) {
                collection.remove(collection.get(i));
            }

        }
    }
}
