package section_21.t_21_26;

import java.util.NoSuchElementException;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        list.insertAtFront(-1);
        list.insertAtFront(0);
        list.insertAtBack(1);
        list.insertAtBack(5);

        try{
            list.print();

            list.insertAt(9,3);
            list.print();

            list.insertAt(9,1);
            list.print();

            list.insertAt(9,2);
            list.print();

        }catch (NoSuchElementException noSuchElementException){
            noSuchElementException.printStackTrace();
        }
    }
}
