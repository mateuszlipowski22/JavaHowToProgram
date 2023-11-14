package section_5.t5_14;

public class Main {
    public static void main(String[] args) {

        double principal = 1000.0;

        System.out.printf("%s%20s%20s%20s%20s%20s%20s%n", "Rok", "Saldo 5%","Saldo 6%","Saldo 7%","Saldo 8%","Saldo 9%","Saldo 10%");
        for (int year = 1 ; year<=10 ; ++year){
            System.out.printf("%3d",year);
            for (int rate = 5; rate<=10;rate++){
                double ammount = principal * Math.pow(1+((double) rate /100),year);
                System.out.printf("%,20.2f", ammount);
            }
            System.out.printf("%n");
        }
    }
}
