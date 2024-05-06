package section_21.t_21_21;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            List<Integer> list = new List<>();

            list.insertAtFront(-1);
            list.print();
            list.insertAtFront(0);
            list.print();
            list.insertAtBack(1);
            list.print();
            list.insertAtBack(5);
            list.print();

            System.out.println("Wpisz liczbę do wyszukania : ");
            Integer input = scanner.nextInt();

            System.out.println("list.search(input) = " + list.search(input));

        }catch (Exception e){
            System.err.println("Błąd podczas pobierania danych od użytkownika");
            e.printStackTrace();
        }
    }
}
