package section_14.example_14_12;

public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("witaj tutaj");

        System.out.printf("buffer = %s\n",buffer.toString());
        System.out.printf("Znak na pozycji 0 : %s\nZnak na pozycji 4:%s\n\n",buffer.charAt(0),buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0,buffer.length(),charArray,0);

        System.out.println("Znakami są: ");

        for(char character : charArray){
            System.out.println(character);
        }

        buffer.chars().forEach(c -> System.out.println((char) c));

        buffer.setCharAt(0,'W');
        buffer.setCharAt(6,'T');
        System.out.printf("\nbuffer = %s\n", buffer);

        buffer.reverse();
        System.out.printf("\nbuffer = %s\n", buffer);

    }
}
