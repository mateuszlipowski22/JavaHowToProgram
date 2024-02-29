package section_14.example_14_23;

import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "To zdanie ma na końcu 5 gwiazdek *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Orginalny tekst 1 : %s\n", firstString);

        firstString = firstString.replaceAll("\\*","^");

        System.out.printf("^ zastąpiło * : %s\n",firstString);

        firstString = firstString.replaceAll("gwiazdek","karet");

        System.out.printf("\"karet\" zastapiło \"gwiazdek\" : %s\n", firstString);

        firstString = firstString.replaceAll("\\w+","wyraz");

        System.out.printf("Kazdy wyraz zastapiony slowem \"wyraz\" : %s\n", firstString);

        System.out.printf("Orginalny tekst 2 : %s\n", secondString);

        for(int i = 0 ; i < 3 ; i++){
            secondString = secondString.replaceFirst("\\d","cyfra");
        }
        System.out.printf("Pierwsze cyfry zastapione slowem \"cyfra\" : %s\n", secondString);

        System.out.println("Tekst po rozdzieleniu znakami przecinka: ");

        String[] results = secondString.split(",\\s");
        System.out.println(Arrays.toString(results));
    }
}
