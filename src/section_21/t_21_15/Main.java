package section_21.t_21_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Customer> customerQueue = new Queue<>();
        Random random = new Random();
        int simulationTime=720;
        int currentTime = 0;


        int nextCustomerTime = random.nextInt(1,5);
        int customerNeedTime = random.nextInt(1,5);
        customerQueue.enqueue(new Customer(customerNeedTime));
        int nextCustomerEndTime=nextCustomerTime+customerNeedTime;

        Map<Integer,Integer> report = new HashMap<>();

        while(currentTime <= simulationTime){
            if(currentTime==nextCustomerTime){
                customerNeedTime = random.nextInt(1,5);
                customerQueue.enqueue(new Customer(customerNeedTime));
                nextCustomerTime=currentTime+random.nextInt(1,5);
            }

            if(nextCustomerEndTime==currentTime){
                if(customerQueue.isEmpty()){
                    nextCustomerEndTime++;
                }else {
                    nextCustomerEndTime = currentTime+customerQueue.dequeue().getProcessTime();
                }
            }
            System.out.printf("Time : %d Queue size : %d%n",currentTime,customerQueue.getSize());
            report.put(currentTime,customerQueue.getSize());
            currentTime++;
        }

        Optional<Map.Entry<Integer, Integer>> maxEntry=  report.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.printf("Maksymalna długośc kolejki : %d",maxEntry.get().getValue());
    }
}
