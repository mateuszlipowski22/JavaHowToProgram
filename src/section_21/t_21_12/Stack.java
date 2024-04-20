package section_21.t_21_12;

import java.util.NoSuchElementException;

public class Stack<E> {
    private List<E> stackList;

    public Stack() {
        this.stackList = new List<E>("stos");
    }

    public E pop() throws NoSuchElementException {
        return stackList.removeFromFront();
    }

    public void push(E object) {
        stackList.insertAtFront(object);
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    public void print(){
        stackList.print();
    }

    public E peek() {
        if(!stackList.isEmpty()){
            return stackList.firstNode.data;
        }
        return null;
    }
}
