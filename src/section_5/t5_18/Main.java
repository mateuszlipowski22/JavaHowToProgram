package section_5.t5_18;

public class Main {
    public static void main(String[] args) {

        int principal = 100000;

        System.out.printf("%s%20s%20s%20s%20s%20s%20s%n", "Rok", "Saldo 5%","Saldo 6%","Saldo 7%","Saldo 8%","Saldo 9%","Saldo 10%");
        for (int year = 1 ; year<=10 ; ++year){
            System.out.printf("%3d",year);
            for (int rate = 5; rate<=10;rate++){
                int whole = (int) (principal * Math.pow(1+((double) rate /100),year))/100;
                int rest = (int) ((principal * Math.pow(1+((double) rate /100),year))%100);
                System.out.printf("%17d %2s", whole, (String.valueOf(rest).length()==1)?"0"+ rest : rest);
            }
            System.out.printf("%n");
        }
    }
}
