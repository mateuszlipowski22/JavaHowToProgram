package section_14.example_14_6;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf("Fragment tekstu od indeksu 20 do końca wynosi \"%s\"%n",letters.substring(20));
        System.out.printf("Fragment tekstu od indeksu 3 do indeksu 6, ale bez indeksu 6 wynosi \"%s\"%n",letters.substring(3,6));
    }
}
