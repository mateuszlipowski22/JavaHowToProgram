package section_8.t8_14;

public class IntegerSet {
    private boolean[] table;
    private static final int SIZE=100;

    public IntegerSet(int number) {
        this();
        if (number >= 0 && number <= SIZE) {
            this.table[number] = true;
        } else {
            throw new IllegalArgumentException("Niepoprawna liczba");
        }
    }

    public IntegerSet() {
        this.table = new boolean[SIZE+1];
    }

    public void insertElement(int i) {
        table[i]=true;
    }

    public void deleteElement(int i) {
        table[i]=false;
    }

    public static IntegerSet union(IntegerSet first, IntegerSet second){
        IntegerSet result = new IntegerSet();
        for(int i =0;i<SIZE;i++){
            result.table[i]=first.table[i] || second.table[i];
        }
        return result;
    }

    public static IntegerSet intersection(IntegerSet first, IntegerSet second){
        IntegerSet result = new IntegerSet();
        for(int i =0;i<SIZE;i++){
            result.table[i]=first.table[i] && second.table[i];
        }
        return result;
    }

    public static boolean isEqual(IntegerSet first, IntegerSet second){
        for(int i =0;i<SIZE;i++){
            if(first.table[i] != second.table[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result= new StringBuilder();
        for(int i =0;i<SIZE;i++){
            result.append(table[i] ? i : " - ");
        }
        return result.toString();
    }
}
