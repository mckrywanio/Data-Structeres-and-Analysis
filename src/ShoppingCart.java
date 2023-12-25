import java.util.Arrays;

public class ShoppingCart<MyType> implements BagInterface<MyType> {
    private MyType[] myBag;
    private int numberOfProducts;
    private static final int DEFAULT_CAPACITY = 10;

    public ShoppingCart() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ShoppingCart(int capacity) {
        numberOfProducts = 0;
        myBag = (MyType[]) new Object[capacity];
    }

    public boolean add(MyType newEntry) {
        if (isFull()) {
            return false;
        }
        myBag[numberOfProducts] = newEntry;
        numberOfProducts++;
        return true;
    }

    public MyType[] toArray(MyType[] a) {
        if (a.length < numberOfProducts) {
            // If the given array is too small, allocate a new one of the right size
            a = Arrays.copyOf(a, numberOfProducts);
        }
        System.arraycopy(myBag, 0, a, 0, numberOfProducts);
        if (a.length > numberOfProducts) {
            a[numberOfProducts] = null; // null-terminate if the given array is larger
        }
        return a;
    }

    public boolean isFull() {
        return numberOfProducts >= myBag.length;
    }
}