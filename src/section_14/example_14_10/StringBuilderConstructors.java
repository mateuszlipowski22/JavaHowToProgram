package section_14.example_14_10;

public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(10);
        StringBuilder builder3 = new StringBuilder("witaj");

        System.out.printf("builder1 = \"%s\"\n",builder1);
        System.out.printf("builder2 = \"%s\"\n",builder2);
        System.out.printf("builder3 = \"%s\"\n",builder3);
    }
}
