package section_14.example_14_11;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Witaj, jak sie masz?");

        System.out.printf("builder = \"%s\"\nlength = %d\ncapacity = %d\n"
                ,buffer,buffer.length(), buffer.capacity());
        buffer.ensureCapacity(75);
        System.out.printf("Nowa pojemnosc = %d\n",buffer.capacity());
        buffer.setLength(10);
        System.out.printf("Nowa długosc = %d\nbuffer = \"%s\"\n"
                ,buffer.length(),buffer);
    }
}
