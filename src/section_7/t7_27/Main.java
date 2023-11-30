package section_7.t7_27;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 2000;
        boolean[] primes = new boolean[size];
        Arrays.fill(primes,true);

        for (int i = 2; i<size; i++){
            int candidate = i;
            if(primes[i]){
                for(int divider=2; divider<=i/2;divider++){
                    if(candidate%divider==0){
                        primes[i]=false;
                        break;
                    }
                }
                if(primes[i]){
                    for (int multiplier=i*2;multiplier<=size;multiplier=multiplier*2){
                        primes[multiplier]=false;
                    }
                }
            }
        }

        int n = 1;
        System.out.println("Liczby pierszw to : ");
        for (int i = 0; i < primes.length; i++) {
            if(primes[i]){
                System.out.printf("%4d, ", i);
                n++;
            }
            if(n%20==0){
                System.out.println();
                n=1;
            }
        }
    }
}
