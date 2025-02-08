package section_23.e_23_5;

public class UnsynchronizedBuffer implements Buffer{
    private int buffer = -1;
    @Override
    public void blockingPut(int value) throws InterruptedException {
        System.out.printf("Producer zapisał \t %2d", value);
        buffer=value;
    }

    @Override
    public int blockingGet() throws InterruptedException {
        System.out.printf("Consumer odczytał \t %2d", buffer);
        return buffer;
    }
}
