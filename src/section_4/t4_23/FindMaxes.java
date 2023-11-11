package section_4.t4_23;

import java.util.*;

public class FindMaxes {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwsza liczbe :");
            List<Integer> list = new ArrayList<>();
            list.add(scanner.nextInt());

            for(int counter=1;counter<10;counter++){
                System.out.printf("Wprowadz kolejną (%d) liczbe :%n", counter+1);
                list.add(scanner.nextInt());
            }

            Collections.sort(list);

            System.out.printf("Najwieksza liczba to %d %n",list.getLast());
            System.out.printf("Druga najwieksza liczba to %d %n",list.get(list.size()-2));

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
