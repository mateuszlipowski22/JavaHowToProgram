package section_23.e_23_9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBuffer implements Buffer {

    private final Lock accessLock = new ReentrantLock();
    private final Condition canWrite = accessLock.newCondition();
    private final Condition canRead = accessLock.newCondition();

    private int buffer = -1;
    private boolean occupied = false;
    @Override
    public void blockingPut(int value) throws InterruptedException {
        accessLock.lock();
        try{
            while (occupied){
                System.out.println("Producer próbuje zapisu");
                displayState("Buffer jest pełen. Producer czeka.");
                canWrite.await();
            }
            buffer=value;
            occupied=true;
            displayState("Producer zapisuje "+buffer);
            canRead.signalAll();
        }finally {
            accessLock.unlock();
        }
    }

    @Override
    public int blockingGet() throws InterruptedException {
        int readValue=0;
        accessLock.lock();
        try{
            while (!occupied){
                System.out.println("Cosnsumer próbuje odczytu");
                displayState("Buffer jest pusty. Consumer czeka.");
                canRead.await();
            }
            occupied=false;
            readValue=buffer;
            displayState("Consumer odczytuje "+readValue);

            canWrite.signalAll();
            return readValue;
        }finally {
            accessLock.unlock();
        }

    }

    private synchronized void displayState(String operation){
        try{
            accessLock.lock();
            System.out.printf("%-40s%d\t\t%b%n%n",operation, buffer, occupied);
        }finally {
            accessLock.unlock();
        }
    }
}
