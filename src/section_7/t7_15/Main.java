package section_7.t7_15;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[Integer.parseInt(args[0])];

        System.out.printf("%s%10s%n","Indeks","Wartość");

        for(int counter=0; counter < array.length; counter++){
            System.out.printf("%6d%10d%n",counter, array[counter]);
        }

    }
}
