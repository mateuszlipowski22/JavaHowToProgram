package section_18.t_18_14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz wyrazenie do sprawdzenia");
            String word = scanner.nextLine();

            System.out.printf("Wyrażenie \"%s\" %s palindromem", word, isPalindrome(word.replaceAll(" ", "").toCharArray()) ? "jest" : "nie jest");

        } catch (Exception e) {
            System.err.println("Błąd podczas pobierania danych " + e.getMessage());
        }
    }

    private static boolean isPalindrome(char[] charArray) {
        if (charArray.length <= 1) {
            return true;
        }

        if (charArray[0] != charArray[charArray.length - 1]) {
            return false;
        } else {
            return isPalindrome(Arrays.copyOfRange(charArray, 1, charArray.length - 1));
        }

    }
}
