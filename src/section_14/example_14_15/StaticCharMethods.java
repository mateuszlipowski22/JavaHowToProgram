package section_14.example_14_15;

import java.util.Scanner;

public class StaticCharMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz znak i naciśnij Enter");
        String input = scanner.next();
        char c = input.charAt(0);
        System.out.printf("jest zdefiniowany : %b%n",Character.isDefined(c));
        System.out.printf("jest cyfra : %b%n",Character.isDigit(c));
        System.out.printf("jest pierwszym znakiem indentyfikatora Java : %b%n",Character.isJavaIdentifierStart(c));
        System.out.printf("jest czescią indentyfikatora Java : %b%n",Character.isJavaIdentifierPart(c));
        System.out.printf("jest litera : %b%n",Character.isLetter(c));
        System.out.printf("jest litera lub cyfra: %b%n",Character.isLetterOrDigit(c));
        System.out.printf("jest małą litera : %b%n",Character.isLowerCase(c));
        System.out.printf("jest wielką litera : %b%n",Character.isUpperCase(c));
        System.out.printf("po zmianie na mala litera : %c%n",Character.toLowerCase(c));
        System.out.printf("po zmianie na wielką litera : %c%n",Character.toUpperCase(c));
    }
}
