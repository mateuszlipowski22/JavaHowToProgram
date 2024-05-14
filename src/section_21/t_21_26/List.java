package section_21.t_21_26;

import java.util.NoSuchElementException;
import java.util.Objects;

public class List<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;

    private String name;

    public List() {
        this.name = "lista";
    }

    public List(String name) {
        this.name = name;
        this.firstNode = this.lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<>(insertItem);
        } else {
            firstNode = new ListNode<>(insertItem, firstNode);
        }
    }

    public void insertAtBack(E insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<>(insertItem);
        } else {
            lastNode = lastNode.nextNode = new ListNode<>(insertItem);
        }
    }

    public E removeFromFront() {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " jest pusta");
        }

        E removedItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }

        return removedItem;
    }

    public E removeFromBack() {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " jest pusta");
        }

        E removedItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }

            lastNode = current;
            current.nextNode = null;
        }

        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Pusta %s%n", name);
            return;
        }

        System.out.printf("%s zawiera: ", name);

        ListNode<E> current = firstNode;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }

        System.out.println();
    }

    public void insertAt(E insertItem, int position) {
        if (position < 0 || Objects.isNull(insertItem)) {
            return;
        }

        if (position == 0) {
            insertAtFront(insertItem);
        } else {
            int currentPosition = 0;
            ListNode<E> currentNode = this.firstNode;

            while (currentPosition != (position - 1)) {
                if (Objects.nonNull(currentNode.nextNode)) {
                    currentNode = currentNode.nextNode;
                    currentPosition++;
                } else {
                    throw new IllegalArgumentException(String.format("Lista nie ma pozycji %d",position));
                }
            }
            ListNode<E> tempNode = currentNode.nextNode;
            currentNode.nextNode=new ListNode<>(insertItem,tempNode);
        }
    }
}
