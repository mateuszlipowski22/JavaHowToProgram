package section_14.t_14_15;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz ilosc losowych znaków : ");
            int number = scanner.nextInt();
            for (int i = 0; i<number; i++){
                int code = random.nextInt(255);
                System.out.printf("Woisany kod \"%0,3d\" ozancza \"%c\"%n",code, (char) code);
            }
        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }

}
