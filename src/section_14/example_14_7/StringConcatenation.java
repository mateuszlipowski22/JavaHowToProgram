package section_14.example_14_7;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Wszytskiego ";
        String s2 = "Najlepszego";

        System.out.printf("s1 = %s\ns2 = %s\n\n",s1,s2);
        System.out.printf("Wynik s1.concate(s2) = %s\n",s1.concat(s2));
        System.out.printf("s1 po połączeniu = %s\n",s1);
    }
}
