package section_5.t5_20;

public class Main {
    public static void main(String[] args) {

        double piApproximation = 4 ;

        int numberOfApproximaitons=200000;

        for (int i = 2; i <numberOfApproximaitons ; i++) {
            piApproximation=piApproximation - Math.pow(-1,i)*4/(2*i-1);
        }

        System.out.printf("Przybliżenie pi z %d elementami ciagu wynosi %f %n", numberOfApproximaitons,piApproximation);

        piApproximation=4;
        double piTarget=3.14159;
        int i=2;
        while (Math.abs(piTarget-piApproximation)>0.000001) {
            piApproximation=piApproximation - Math.pow(-1,i)*4/(2*i-1);
            i++;
        }
        System.out.printf("Po %d iteracjach Pi wynosi %f", i,piApproximation);

    }
}
