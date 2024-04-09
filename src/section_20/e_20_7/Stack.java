package section_20.e_20_7;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack<E> {
    private final ArrayList<E> elements;

    public Stack() {
        this(10);
    }

    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<>(initCapacity);
    }

    public void push(E pushValue) {
        elements.add(pushValue);
    }

    public E pop() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Stos jest pusty, nie można nic zwrócic");
        }
        return elements.remove(elements.size() - 1);
    }
}
