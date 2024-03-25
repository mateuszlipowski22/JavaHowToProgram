package section_17.t_17_19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczby: ");
        String input = scanner.next();
        List<Double> inputList = new ArrayList<>();
        while (!input.equals("q")){
            inputList.add(Double.valueOf(input));
            input=scanner.next();
        }

        System.out.printf("Średnia z wprowadzonych liczb \"%s\" to %.2f",inputList,
                inputList.stream()
                        .mapToDouble(Double::valueOf)
                        .average()
                        .orElseThrow(()-> new InputMismatchException("Niepoprawne dane")));
    }
}
