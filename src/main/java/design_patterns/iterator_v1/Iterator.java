package design_patterns.iterator_v1;

public interface Iterator {
    boolean hasNext();
    Object next();
    void removeRemaining();
}
