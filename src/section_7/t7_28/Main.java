package section_7.t7_28;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static String[] track;
    public static int turtlePosition;
    public static int rabbitPosition;
    public static Random random;
    public static void main(String[] args) {
        initializeGame();

        int i=1;
        while (rabbitPosition!=track.length-1 && turtlePosition!=track.length-1){
            turtlePosition = animalMovement(turtlePosition, turtleMovement());
            rabbitPosition = animalMovement(rabbitPosition, rabbitMovement());
            System.out.printf("%2d : %s K:%d Z:%d %n",i,displayGame(),rabbitPosition,turtlePosition);
            i++;
        }

    }

    private static String displayGame() {
        Arrays.fill(track, "");
        if(turtlePosition==rabbitPosition){
            track[rabbitPosition]="AlA";
        }else {
            track[rabbitPosition]="K";
            track[turtlePosition]="Z";
        }
        return Arrays.toString(track);
    }

    private static int animalMovement(int animalPosition, int animalMovement) {
        int tempAnimalPosition=animalPosition;
        if(animalPosition+animalMovement<0){
            tempAnimalPosition=0;
        }else if(animalPosition+animalMovement>69){
            tempAnimalPosition=69;
        }else {
            tempAnimalPosition+=animalMovement;
        }
        return tempAnimalPosition;
    }

    private static void initializeGame() {
        random=new Random();
        track = new String[70];
        Arrays.fill(track, "0");
        turtlePosition = 0;
        rabbitPosition = 0;
    }

    public static int turtleMovement(){
        int number = random.nextInt(10)+1;
        return switch (number){
            case 1,2,3,4,5 -> 3;
            case 6,7 -> -6;
            case 8,9,10->1;
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }

    public static int rabbitMovement(){
        int number = random.nextInt(10)+1;
        return switch (number){
            case 1,2 -> 0;
            case 3,4 -> 9;
            case 5 -> -12;
            case 6,7,8 -> 1;
            case 9,10->-2;
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
