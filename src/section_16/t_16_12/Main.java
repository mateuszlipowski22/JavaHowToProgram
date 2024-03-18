package section_16.t_16_12;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz kolor:");
            System.out.printf("Kolory:%n");
            ColorsUtil.ColorsMap.forEach((key, value) -> System.out.printf("%s%n",key));
            String colorName = scanner.nextLine();
            System.out.printf("Wybrany kolor: %s%n",ColorsUtil.ColorsMap.get(colorName));
        }catch (Exception e){
            throw new Exception("Bład podczas pobierania danych od klienta", e);
        }
    }
}
