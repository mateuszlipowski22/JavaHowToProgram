package section_16.t_16_10;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);

            TreeSet<String> nameSet = new TreeSet<>();

            System.out.println("Wpisz kolejne imiona (q aby zakonczyc wprowadzanie danych): ");

            String name = scanner.nextLine();
            while(!name.equals("q")){
                nameSet.add(name);
                System.out.printf("nameSet: %s%n",nameSet);
                System.out.printf("pierwszy element: %s%n", nameSet.first());
                name = scanner.nextLine();
            }

            System.out.printf("nameSet: %s%n",nameSet);
            System.out.printf("pierwszy element: %s%n", nameSet.first());

        }catch (Exception e){
            throw new Exception("Bład podczas pobierania danych od klienta", e);
        }
    }
}
