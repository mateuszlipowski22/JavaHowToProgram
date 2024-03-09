package section_14.t_14_23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            UnitConverter unitConverter = new UnitConverter();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz zdanie z jednostkami do konwersji : ");
            String sentence = scanner.nextLine();

            System.out.println(unitConverter.convert(sentence));

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }
}
