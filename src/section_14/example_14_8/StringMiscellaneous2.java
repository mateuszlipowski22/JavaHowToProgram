package section_14.example_14_8;

public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "witaj";
        String s2 = "ZEGNAJ";
        String s3 = "   spcaje    ";

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s \n\n", s1,s2,s3);

        System.out.printf("Zamiana 't' na 'T' w s1 : %s\n\n",s1.replace('t','T'));

        System.out.printf("s1.toUpperCase() = %s\n",s1.toUpperCase());

        System.out.printf("s2.toLowerCase() = %s\n",s2.toLowerCase());

        System.out.printf("s3 po metodzie trim = \"%s\"\n\n",s3.trim());

        char[] charArray = s1.toCharArray();
        System.out.println("s1 jako tablica znaków = ");

        for(char character : charArray){
            System.out.println(character);
        }

        System.out.println();
    }
}
