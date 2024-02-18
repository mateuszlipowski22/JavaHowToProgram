package section_14.example_14_5;

public class StringIndexMethods {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf("\n'c' znajduje sie pod indeksem %d\n", letters.indexOf('c'));
        System.out.printf("'a' znajduje sie pod indeksem %d\n", letters.indexOf('a',1));
        System.out.printf("'$' znajduje sie pod indeksem %d\n\n", letters.indexOf('$'));

        System.out.printf("Ostatnie 'c' znajduje sie pod indeksem %d\n", letters.lastIndexOf('c'));
        System.out.printf("Ostatnie 'a' znajduje sie pod indeksem %d\n", letters.lastIndexOf('a',25));
        System.out.printf("Ostatnie '$' znajduje sie pod indeksem %d\n\n", letters.lastIndexOf('$'));

        System.out.printf("\"def\" znajduje sie pod indeksem %d\n", letters.indexOf("def"));
        System.out.printf("\"def\" znajduje sie pod indeksem %d\n", letters.indexOf("def",7));
        System.out.printf("\"witaj\" znajduje sie pod indeksem %d\n\n", letters.indexOf("witaj"));

        System.out.printf("Ostatnie \"def\" znajduje sie pod indeksem %d\n", letters.lastIndexOf("def"));
        System.out.printf("Ostatnie \"def\" znajduje sie pod indeksem %d\n", letters.lastIndexOf("def",25));
        System.out.printf("Ostatnie \"witaj\" znajduje sie pod indeksem %d\n\n", letters.lastIndexOf("witaj"));
    }
}
