package section_8.t8_13;

public class IntegerSet {
    private boolean[] table;

    public IntegerSet(int number) {
        this();
        if (number >= 0 && number <= 100) {
            this.table[number] = true;
        } else {
            throw new IllegalArgumentException("Niepoprawna liczba");
        }
    }

    public IntegerSet() {
        this.table = new boolean[101];
    }

    public int getNumber() {
        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                return i;
            }
        }
        return -1;
    }
}
