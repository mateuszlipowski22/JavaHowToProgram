package section_19.t_19_5;

import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] data) {
        for(int i = 0 ; i < data.length-2;i++){
            for(int j = i+1; j< data.length-2 ; j++){
                if(data[i]>data[j]){
                    swap(data,i,j);
                }
            }
        }
    }

    private static void swap(int[] data, int first, int second) {
        int temporary = data[first];
        data[first]=data[second];
        data[second]=temporary;
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = generator.ints(10,10,91).toArray();

        System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data));
        bubbleSort(data);
        System.out.printf("Tablica posortowana: %s%n", Arrays.toString(data));
    }
}

