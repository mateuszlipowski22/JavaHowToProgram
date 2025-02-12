package section_23.e_23_9;

public interface Buffer {
    public void blockingPut(int value) throws InterruptedException;
    public int blockingGet() throws InterruptedException;
}
