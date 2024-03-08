package section_14.t_14_21;

public class WrittenValue {

    private static String[] hundreds = new String[]{"", "sto", "dwieście", "trzysta", "czterysta", "pięćset", "sześćset", "siedemset", "osiemset", "dziewięćset"};
    private static String[] tens = new String[]{"", "dziesiec", "dwadzieścia", "trzydzieści", "czterdzieści", "pięćdziesiąt", "sześćdziesiąt", "siedemdziesiąt", "osiemdziesiąt", "dziewięćdziesiąt"};

    private static String[] teens = new String[]{"jedenascie", "dwanasice", "trzynascie", "czternascie", "pietnascie", "szesnascie", "siedemnascie", "osiemnascie", "dziewietnascie"};
    private static String[] unity = new String[]{"", "jeden", "dwa", "trzy", "cztery", "pięc", "sześć", "siedem", "osiem", "dziewięć"};

    public static String getWrittenValue(double value) {
        StringBuilder buffer = new StringBuilder();

        System.out.println(((int) value % 100));
        buffer.append(hundreds[(int) (value / 100)]).append(" ");
        if (((int) value % 100) > 10 && ((int) value % 100) < 20) {
            buffer.append(teens[((int) value % 100)-11]).append(" ");

        } else {
            buffer.append(tens[(int) (value % 100 / 10)]).append(" ")
                    .append(unity[(int) (value % 100 % 10)]).append(" ");
        }
        buffer.append("złotych").append(" ")
                .append(String.format("%d/100", (int) (value * 100 % 100)));
        return buffer.toString();
    }
}
