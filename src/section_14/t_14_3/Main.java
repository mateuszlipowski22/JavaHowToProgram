package section_14.t_14_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwszy tekst:");
            String first = scanner.nextLine();

            System.out.println("Wprowadz drugi tekst:");
            String second = scanner.nextLine();

            System.out.printf("first.compareTo(second) = %d", first.compareTo(second));

        }catch (Exception e){
            System.out.println("Bład podczas wprowadzania danych przez użytownika");
        }
    }
}
