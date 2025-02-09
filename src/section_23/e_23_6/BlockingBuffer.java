package section_23.e_23_6;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {
    private final ArrayBlockingQueue<Integer> buffer;


    public BlockingBuffer() {
        this.buffer = new ArrayBlockingQueue<>(1);
    }

    @Override
    public void blockingPut(int value) throws InterruptedException {
        buffer.put(value);
        System.out.printf("%s%2d\t%s%d%n","Producer zapisuje ", value, "Zajęte komórki w Buffer: ", buffer.size());
    }

    @Override
    public int blockingGet() throws InterruptedException {
        int readValue = buffer.take();
        System.out.printf("%s%2d\t%s%d%n","Consumer odczytuje ", readValue, "Zajęte komórki w Buffer: ", buffer.size());
        return readValue;
    }
}
