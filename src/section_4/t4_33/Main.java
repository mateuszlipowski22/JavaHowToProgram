package section_4.t4_33;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        for(int i=0; i<size ; i++){
            if(i%2==0){
                System.out.print("* ".repeat(size/2));
            }else {
                System.out.print(" *".repeat(size/2));
            }
            System.out.println();
        }
    }
}
