package section_14.example_14_14;

public class StringBuilderInsertDelete {
    public static void main(String[] args) {
        Object objectRef = "witaj";
        String string = "zegnaj";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'K';
        int integerValue = 7;
        long longValue = 100000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;

        StringBuilder buffer = new StringBuilder();

        buffer.insert(0,objectRef)
                .insert(0,"  ")
                .insert(0,string)
                .insert(0,"  ")
                .insert(0,charArray)
                .insert(0,"  ")
                .insert(0,charArray,0,3)
                .insert(0,"  ")
                .insert(0,booleanValue)
                .insert(0,"  ")
                .insert(0,characterValue)
                .insert(0,"  ")
                .insert(0,integerValue)
                .insert(0,"  ")
                .insert(0,longValue)
                .insert(0,"  ")
                .insert(0,floatValue)
                .insert(0,"  ")
                .insert(0,doubleValue);


        System.out.printf("buffer po wsawieniach :\n%s\n\n", buffer);
        buffer.deleteCharAt(10);
        buffer.delete(2,6);
        System.out.printf("buffer po usunieciach :\n%s\n\n", buffer);


    }
}

