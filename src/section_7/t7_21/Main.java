package section_7.t7_21;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String[] directions = new String[]{"RIGHT","DOWN","LEFT","UP"};
    public static int currentDirection = 0;

    public static boolean pencilDown = true;

    public static int[][] floor = new int[20][20];

    public static int currentX=0;
    public static int currentY=0;
    public static void main(String[] args) {
        for (int[] subTable : floor) {
            Arrays.fill(subTable, 0);
        }

        displayFloor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz polecenie");
        String choice = scanner.nextLine();

        while(!choice.equals("9")){
            processDecision(choice);
            System.out.println("Wpisz kolejne polecenie");
            choice = scanner.nextLine();
        }
    }

    public static void processDecision(String choice){
        switch (choice.charAt(0)){
            case '1': pencilUp();
            break;
            case '2': pencilDown();
                break;
            case '3': rotateLeft();
                break;
            case '4': rotateRight();
                break;
            case '5': move(Integer.parseInt(choice.split(",")[1]));
                break;
            case '6': displayFloor();
                break;
        }
    }

    public static void displayFloor() {
        for (int[] subTable : floor) {
            System.out.println(Arrays.toString(subTable));
        }
    }

    public static void rotateRight(){
        currentDirection=(4+currentDirection+1)%4;
    }

    public static void rotateLeft(){
        currentDirection=(4+currentDirection-1)%4;
    }

    public static void pencilUp(){
        pencilDown=false;
    }

    public static void pencilDown(){
        pencilDown=true;
    }

    public static void move(int displacement){
        if(!pencilDown){
            if(currentDirection==0){
                currentX=currentX+displacement;
            }else if(currentDirection==1){
                currentY=currentY+displacement;
            }else if(currentDirection==2){
                currentX=currentX-displacement;
            }else if(currentDirection==3){
                currentY=currentY-displacement;
            }
        }else{
            int finalPosition;
            if(currentDirection==0){
                finalPosition=currentX+displacement;
                for (int i = currentX; i <=finalPosition ; i++) {
                    floor[i][currentY]=1;
                }
                currentX=currentX+displacement;
            }else if(currentDirection==1){
                finalPosition=currentY+displacement;
                for (int i = currentY; i <=finalPosition ; i++) {
                    floor[currentX][i]=1;
                }
                currentY=currentY+displacement;
            }else if(currentDirection==2){
                finalPosition=currentX-displacement;
                for (int i = currentX; i >=finalPosition ; i--) {
                    floor[i][currentY]=1;
                }
                currentX=currentX-displacement;
            }else if(currentDirection==3){
                finalPosition=currentY-displacement;
                for (int i = currentY; i >=finalPosition ; i--) {
                    floor[currentX][i]=1;
                }
                currentY=currentY-displacement;
            }
        }

    }
}
