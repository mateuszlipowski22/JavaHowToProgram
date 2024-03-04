package section_14.t_14_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz numer telefonu");
            String phoneNumber = scanner.nextLine();

            String directional = phoneNumber.split("\\)")[0].split("\\(")[1];
            String number = phoneNumber.split(" ")[1].replace("-","");
            System.out.printf("Numer kierunkowy to : %s%n",directional);
            System.out.printf("Numer telefonu to : %s%n",number);

        }catch (Exception e){
            System.out.println("Bład podczas pobierania danych "+e.getMessage());
        }
    }
}
