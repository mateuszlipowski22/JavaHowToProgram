package section_14.t_14_20;

import java.util.Arrays;

public class CheckValue {
    private char[] value = new char[9];

    public CheckValue(String value) {
        if(value.length()>9){
            throw new IllegalArgumentException("Za długa wartość");
        }
        System.out.println(value);
        String valueModified = String.format("%09.2f",Math.round(Double.parseDouble(value) * 100.0) / 100.0);

        for(int i = 9; i>0;i--){
            this.value[i-1]=valueModified.charAt(i-1);
        }

    }

    public CheckValue(double value) {
        this(String.valueOf(value));
    }

    public void printValue(){
        System.out.println(Arrays.toString(value).replaceAll(", ","").replace("[","").replace("]",""));
    }
}
