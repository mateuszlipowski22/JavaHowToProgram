package section_18.t_18_9;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz podstawe : ");
            int base = scanner.nextInt();
            System.out.println("Wpisz wykladnik : ");
            int exponent = scanner.nextInt();

            IntStream.iterate(0, x->x+1)
                    .limit(base+1)
                    .forEach(number -> {
                        System.out.printf("%d^%d! = %d%n",base,exponent,power(base,exponent));
                    });

        }catch(Exception e){
            System.err.println("Błąd podczas pobierania danych od klienta \n"+e.getMessage());
        }
    }

    public static int power(int base, int exponent){
        if (exponent==1){
            return base;
        }else {
            return base*power(base,exponent-1);
        }
    }
}
