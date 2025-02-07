package section_23.e_23_4_2;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
    private static final SecureRandom generator = new SecureRandom();
    private final int[] array;

    private int writeIndex = 0;

    public SimpleArray(int size) {
        this.array = new int[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public synchronized void add(int value) {
        int position = writeIndex;

        try {
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        array[position] = value;

        System.out.printf("%s zapisał %2d do elementu %d%n",
                Thread.currentThread().getName(), value, position);
        ++writeIndex;
        System.out.printf("Następny indeks zapisu %d%n", writeIndex);

    }
}
