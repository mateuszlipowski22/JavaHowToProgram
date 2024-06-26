package section_15.example_15_3;

public enum MenuOption {
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value;

    MenuOption(int value) {
        this.value = value;
    }
}
