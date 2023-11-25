package section_7.t7_16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczby oddzielone spacją ");

            double multiplicationResult = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .reduce(1, (left, right) -> left * right);
            System.out.printf("wynik mnozenia to %.2f",multiplicationResult);

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
