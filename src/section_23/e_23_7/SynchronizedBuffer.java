package section_23.e_23_7;

public class SynchronizedBuffer implements Buffer{
    private int buffer = -1;
    private boolean occupied = false;
    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        while (occupied){
            System.out.println("Producer próbuje zapisu");
            displayState("Buffer jest pełen. Producer czeka.");
            wait();
        }
        buffer=value;
        occupied=true;
        displayState("Producer zapisuje "+buffer);
        notifyAll();
    }

    @Override
    public synchronized int blockingGet() throws InterruptedException {
        while (!occupied){
            System.out.println("Cosnsumer próbuje odczytu");
            displayState("Buffer jest pusty. Consumer czeka.");
            wait();
        }
        occupied=false;
        displayState("Consumer odczytuje "+buffer);

        notifyAll();
        return buffer;
    }

    private synchronized void displayState(String operation){
        System.out.printf("%-40s%d\t\t%b%n%n",operation, buffer, occupied);
    }
}
