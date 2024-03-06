package section_14.t_14_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataFormatter dataFormatter = new DataFormatter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz date w formacie dd-MM-rrrr :");
        String date = scanner.nextLine();
        System.out.println("Data po zmienionym formacie");
        System.out.printf("%s",dataFormatter.convertData(date));
    }
}
