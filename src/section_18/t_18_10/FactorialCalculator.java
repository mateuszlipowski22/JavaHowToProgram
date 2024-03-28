package section_18.t_18_10;

public class FactorialCalculator {
    public static long factorial(long number) {
        if(number<=1){
            System.out.printf("factorial(1)=1%n");
            return 1;
        }else {
            System.out.printf("%d*factorial(%d)%n",number,number-1);
            return number*factorial(number-1);
        }
    }

    public static void main(String[] args) {
        for(int counter = 0; counter <=21 ; counter++){
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }
}
