package section_21.t_21_6;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new List<>();
        firstList.insertAtFront(-1);
        firstList.insertAtFront(0);
        firstList.insertAtBack(1);
        firstList.insertAtBack(5);

        List<Integer> secondList = new List<>();
        secondList.insertAtFront(-11);
        secondList.insertAtFront(0);
        secondList.insertAtBack(1);
        secondList.insertAtBack(5);

        firstList.print();
        secondList.print();

        ListConcatenate.concatenate(firstList,secondList);
        firstList.print();

    }
}
