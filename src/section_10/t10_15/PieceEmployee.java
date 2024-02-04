package section_10.t10_15;

public class PieceEmployee extends Employee{
    private int pieces;
    private double wage;

    public PieceEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, int pieces, double wage) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Stawka za sztuke musi być > od 0.0");
        }
        if (pieces < 0) {
            throw new IllegalArgumentException("Liczba sztuk  musi być >= od 0");
        }
        this.pieces = pieces;
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setPieces(int pieces) {
        if (pieces < 0) {
            throw new IllegalArgumentException("Liczba sztuk  musi być >= od 0");
        }
        this.pieces = pieces;
    }

    public void setWage(double wage) {
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Stawka za sztuke musi być > od 0.0");
        }
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return pieces*wage;
    }

    public String toString() {
        return String.format("pracownik pracujący na akord : %s%n%s: %,.2f %s : %d",
                super.toString(),
                "stawka za sztuke", getWage(),"liczba sztuk", getPieces());
    }
}
