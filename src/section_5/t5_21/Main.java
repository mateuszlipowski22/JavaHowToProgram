package section_5.t5_21;

public class Main {
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        int limit=100;
        int number = 0;
        for (int i = 1; i < limit; i++) {
            for (int j = i+1; j <limit ; j++) {
                for (int k = j+1; k < limit; k++) {
                    if(i+j<=k || j+k<=i || k+i<=j){
                        continue;
                    }
                    if(isTriangle(i,j,k)){
                        System.out.printf("%d %d %d %n",i,j,k);
                        number++;
                    }
                }
            }
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime); //1478043900 183759300
        System.out.println(number);
    }
    public static boolean isTriangle(int first, int second, int third){

        if(Math.pow(first,2)==Math.pow(second,2)+Math.pow(third,2)){
            return true;
        }
        if(Math.pow(second,2)==Math.pow(first,2)+Math.pow(third,2)){
            return true;
        }
        return Math.pow(third, 2) == Math.pow(second, 2) + Math.pow(first, 2);
    }
}
