package design_patterns.iterator;

public interface Iterator {
    Boolean hasNext();
    Object next();
    void reset();
}
