package section_14.t_14_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwszy tekst:");
            String first = scanner.nextLine();

            System.out.println("Wprowadz drugi tekst:");
            String second = scanner.nextLine();

            System.out.println("Wprowadz liczbe znaków do porównania:");
            int numberOfChars = scanner.nextInt();

            System.out.println("Wprowadz indeks początkowy:");
            int startIndex = scanner.nextInt();

            System.out.printf("first.regionMatches(second) = %b", first.regionMatches(true, startIndex,second,startIndex,numberOfChars));

        }catch (Exception e){
            System.out.println("Bład podczas wprowadzania danych przez użytownika");
        }
    }
}
