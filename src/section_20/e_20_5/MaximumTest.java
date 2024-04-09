package section_20.e_20_5;

import java.util.Comparator;

public class MaximumTest {
    public static void main(String[] args) {
        System.out.printf("Maksimum z %d, %d i %d wynosi %d%n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maksimum z %.1f, %.1f i %.1f wynosi %.1f%n", 6.6, 7.7, 4.6, maximum(6.6, 7.7, 4.6));
        System.out.printf("Maksimum z %s, %s i %s wynosi %s%n", "arbuz", "jabłko", "samochód", maximum("arbuz", "jabłko", "samochód"));
    }

    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
