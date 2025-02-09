package section_23.e_23_6;

public interface Buffer {
    public void blockingPut(int value) throws InterruptedException;
    public int blockingGet() throws InterruptedException;
}
