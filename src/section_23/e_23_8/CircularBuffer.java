package section_23.e_23_8;

public class CircularBuffer implements Buffer {
    private int[] buffer = {-1,-1,-1};
    private int occupiedCells = 0;
    private int writeIndex = 0;
    private int readIndex = 0;
    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        while (occupiedCells==buffer.length){
            System.out.println("Buffer jest pełen. Producer czeka.%n");
            wait();
        }
        buffer[writeIndex]=value;
        writeIndex=(writeIndex+1)%buffer.length;

        ++occupiedCells;
        displayState("Producer zapisuje "+value);
        notifyAll();
    }

    @Override
    public synchronized int blockingGet() throws InterruptedException {
        while (occupiedCells==0){
            System.out.println("Buffer jest pusty. Consumer czeka.");
            wait();
        }

        int readValue = buffer[readIndex];
        readIndex=(readIndex+1)%buffer.length;

        --occupiedCells;
        displayState("Consumer odczytuje "+readValue);

        notifyAll();
        return readValue;
    }

    public synchronized void displayState(String operation){
        System.out.printf("(%s%s%d)%n%s",operation, " zajete komórki: ", occupiedCells, "zawartość komórek: ");

        for (int value : buffer){
            System.out.printf(" %2d ", value);
        }

        System.out.printf("%n                  ");

        for (int i=0;i<buffer.length;i++){
            System.out.print("---- ");
        }

        System.out.printf("%n                    ");

        for (int i=0;i<buffer.length;i++){
            if(i==writeIndex && i ==readIndex){
                System.out.print(" ZO");
            }else if(i==writeIndex){
                System.out.print(" Z  ");
            }else if(i==readIndex){
                System.out.print(" O  ");
            }else {
                System.out.print("    ");
            }
        }

        System.out.printf("%n%n");
    }
}
