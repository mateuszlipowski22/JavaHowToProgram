package section_18.t_18_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static boolean[][] table = new boolean[8][8];

    public static void main(String[] args) {
        for (boolean[] raw : table) {
            Arrays.fill(raw, false);
        }

        table[0][0]=true;
        checkIfAvailable(1,1);
    }

    public static void checkIfAvailable(int column, int row){
        if(column>=table.length || row>=table.length || column<0 || row<0){
            return;
        }

        if(!checkIfRowContainsTrue(column)){
            checkIfAvailable(column+1, row);
        }

        if(!checkIfColumnContainsTrue(row)){
            checkIfAvailable(column, row+1);
        }

        if(!checkIfDiagonalContainsTrue(column,row)){
            return;
        }

        table[column][row]=true;
        printArray();
        checkIfAvailable(column+1, row);
        checkIfAvailable(column, row+1);
    }

    public static boolean checkIfRowContainsTrue(int row){
        boolean[] tempArray = table[row];
        for(boolean b : tempArray){
            if(b){
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfColumnContainsTrue(int column){
        for(boolean[] b : table){
            if(b[column]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfDiagonalContainsTrue(int column, int row) {
        List<Integer> xList=new ArrayList<>();
        List<Integer> yList=new ArrayList<>();

        for(int i=-8; i<8;i++){
            xList.add(column+i);
            yList.add(row+i);
        }

        for(int i = 0;i<xList.size(); i++){
            if(xList.get(i)<0 || xList.get(i)>8){
                xList.remove(i);
                yList.remove(i);
            }
        }

        for(int i = 0;i<yList.size(); i++){
            if(yList.get(i)<0 || yList.get(i)>8){
                yList.remove(i);
                xList.remove(i);
            }
        }

        for(int i = 0; i<xList.size(); i++){
            if(table[xList.get(i)][yList.get(i)]){
                return false;
            }
        }
        return true;
    }
    public static void printArray(){
        for(boolean[] row : table){
            System.out.println(Arrays.toString(row));
        }
    }
}
