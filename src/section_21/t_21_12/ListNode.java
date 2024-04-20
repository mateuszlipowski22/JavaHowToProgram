package section_21.t_21_12;

public class ListNode<E> {
    E data;
    ListNode<E> nextNode;

    public ListNode(E data) {
        this(data,null);
    }

    public ListNode(E data, ListNode<E> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public E getData() {
        return data;
    }

    public ListNode<E> getNext() {
        return nextNode;
    }
}
