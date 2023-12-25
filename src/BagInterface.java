public interface BagInterface<T> {
    boolean add(T newEntry);
    T[] toArray(T[] a);
    boolean isFull();
}