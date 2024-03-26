package section_17.t_17_24;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try{
            Random random = new Random();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz ile liczb pierwszych ma zostać wyświetlona");

            final Integer number = scanner.nextInt();

            IntStream.iterate(1,x->x+1)
                    .filter(Main::isPrime)
                    .limit(number)
                    .forEach(System.out::println);

        }catch (Exception e){
            System.err.println("Błąd podczas pobierania danych od użytkownika" +e.getMessage());
        }
    }

    public static boolean isPrime(int number){
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
