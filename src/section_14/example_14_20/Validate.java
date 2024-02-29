package section_14.example_14_20;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imie:");
        String firstName = scanner.nextLine();
        System.out.println("Wpisz nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Wpisz ulice:");
        String street = scanner.nextLine();
        System.out.println("Wpisz miasto:");
        String city = scanner.nextLine();
        System.out.println("Wpisz wojewodztwo:");
        String state = scanner.nextLine();
        System.out.println("Wpisz kod pocztowy:");
        String zip = scanner.nextLine();
        System.out.println("Wpisz numer telefonu:");
        String phone = scanner.nextLine();

        System.out.printf("\nWalidacja wyników:");

        if(!ValidateInput.validateFirstName(firstName)){
            System.out.println("Niepoprawne imie");
        }else if(!ValidateInput.validateLastName(lastName)){
            System.out.println("Niepoprawne nazwisko");
        }else if(!ValidateInput.validateAddress(street)){
            System.out.println("Niepoprawna ulica");
        }else if(!ValidateInput.validateCity(city)){
            System.out.println("Niepoprawne miasto");
        }else if(!ValidateInput.validateState(state)){
            System.out.println("Niepoprawne wojewodztwo");
        }else if(!ValidateInput.validateZip(zip)){
            System.out.println("Niepoprawne kod pocztowy");
        }else if(!ValidateInput.validatePhone(phone)){
            System.out.println("Niepoprawne numer telefon");
        }else{
            System.out.println("Dane poprawne. Dziękujemy");
        }
    }
}
