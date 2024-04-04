package section_19.e_19_4;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSortTest {
    public static void selectionSort(int[] data){
        for(int i=0 ; i<data.length -1 ; i++){
            int smallest = i;

            for(int index=i+1;index< data.length;index++){
                if(data[index]<data[smallest]){
                    smallest=index;
                }

            }
            swap(data, i ,smallest);
            printPass(data,i+1,smallest);
        }
    }

    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("Po przebiegu %2d: ",pass);

        IntStream.iterate(0,x->x+1)
                .limit(index)
                .forEach(element-> System.out.printf("%d ",data[element]));

        System.out.printf("%d* ",data[index]);

        for(int i=index+1;i < data.length;i++){
            System.out.printf("%d ",data[i]);
        }

        System.out.printf("%n                 ");

        IntStream.iterate(0,x->x+1)
                .limit(pass)
                .forEach(element-> System.out.printf("-- "));

        System.out.println();
    }

    private static void swap(int[] data, int first, int second) {
        int temporary = data[first];
        data[first]=data[second];
        data[second]=temporary;
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] data = generator.ints(10,10,100).toArray();

        System.out.printf("Tablica nieposortowana: %s%n%n",Arrays.toString(data));
        selectionSort(data);
        System.out.printf("Tablica posortowana: %s%n%n",Arrays.toString(data));
    }
}
