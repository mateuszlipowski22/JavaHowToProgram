package section_5.t5_12;

public class Main {
    public static void main(String[] args) {

        try {

            int result = 1;
            int i=1;
            while(i<=15){
                if(i%2==1){
                    result=result*i;
                }
                i++;
            }

            System.out.printf("Iloczyn liczb nieparzystych mniejszych od 15 wynosi %d", result);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
