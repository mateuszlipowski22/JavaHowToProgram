package section_14.example_14_13;

public class StringBuilderAppend {
    public static void main(String[] args) {
        String string = "zegnaj";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 100000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.3333;
        Object objectRef = "Witaj";

        StringBuilder lastBuffer = new StringBuilder("ostatni element");
        StringBuilder buffer = new StringBuilder();

        buffer.append(objectRef)
                .append(System.getProperty("line.separator"))
                .append(string)
                .append(System.getProperty("line.separator"))
                .append(charArray)
                .append(System.getProperty("line.separator"))
                .append(charArray,0,3)
                .append(System.getProperty("line.separator"))
                .append(booleanValue)
                .append(System.getProperty("line.separator"))
                .append(characterValue)
                .append(System.getProperty("line.separator"))
                .append(integerValue)
                .append(System.getProperty("line.separator"))
                .append(longValue)
                .append(System.getProperty("line.separator"))
                .append(floatValue)
                .append(System.getProperty("line.separator"))
                .append(doubleValue)
                .append(System.getProperty("line.separator"))
                .append(lastBuffer);


        System.out.printf("buffer zawiera = %n%s%n", buffer);

    }
}

