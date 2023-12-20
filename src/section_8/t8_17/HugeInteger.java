package section_8.t8_17;

import java.util.Arrays;

public class HugeInteger {
    int[] number = new int[40];

    public HugeInteger(String number) {
        Arrays.fill(this.number, 0);
        String reversed = new StringBuilder(number).reverse().toString();
        System.out.println(reversed);
        for (int i = 0; i < reversed.length(); i++) {
            char tempChar = reversed.charAt(i);
            if (Character.isDigit(tempChar)) {
                this.number[i] = Integer.parseInt(String.valueOf(reversed.charAt(i)));
            } else {
                throw new IllegalArgumentException("Niepoprawna liczba");
            }
        }
        System.out.println("Arrays.toString(this.number) = " + Arrays.toString(this.number));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j : number) {
            sb.insert(0, j);
        }
        return sb.toString().replaceFirst("^0+(?!$)", "");
    }

    public void add(HugeInteger hugeInteger) {
        int tempNumber = 0;
        for (int i = 0; i < this.number.length - 1; i++) {
            if (this.number[i] + hugeInteger.number[i] + tempNumber >= 10) {
                this.number[i] = (this.number[i] + hugeInteger.number[i] + tempNumber) % 10;
                tempNumber = 1;
            } else {
                this.number[i] = this.number[i] + hugeInteger.number[i] + tempNumber;
                tempNumber = 0;
            }
        }
    }

    public void subtract(HugeInteger hugeInteger) {
        for (int i = 0; i < this.number.length - 1; i++) {
            if (this.number[i] - hugeInteger.number[i] >= 0) {
                this.number[i] = this.number[i] - hugeInteger.number[i];
            } else {
                if (this.number[i + 1] > 0) {
                    this.number[i + 1] -= 1;
                    this.number[i] = (this.number[i] - hugeInteger.number[i] + 10) % 10;
                }
            }
        }
    }

    public boolean isEqualTo(HugeInteger hugeInteger) {
        for (int i = 0; i < this.number.length - 1; i++) {
            if (this.number[i] != hugeInteger.number[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger hugeInteger){
        return !isEqualTo(hugeInteger);
    }

    public boolean isGreaterThan(HugeInteger hugeInteger){
        String base = String.format("%s", this);
        String comparison = String.format("%s", hugeInteger);
        int length = base.length();
        int length2 = comparison.length();
        if(length>length2){
            return true;
        }else if(length2==length){
            for (int i = length-1; i >= 0 ; i--) {
                if(base.charAt(i)>comparison.charAt(i)){
                    return true;
                } else if (base.charAt(i)<comparison.charAt(i)) {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isLesserThan(HugeInteger hugeInteger){
        if(isNotEqualTo(hugeInteger)){
            return !isGreaterThan(hugeInteger);
        }else {
            return false;
        }
    }

    public boolean isGreaterThanOrEqual(HugeInteger hugeInteger){
        if(isEqualTo(hugeInteger)){
            return true;
        }else {
            return isGreaterThan(hugeInteger);
        }
    }

    public boolean isLesserThanOrEqual(HugeInteger hugeInteger){
        if(isEqualTo(hugeInteger)){
            return true;
        }else {
            return isLesserThan(hugeInteger);
        }
    }
}
