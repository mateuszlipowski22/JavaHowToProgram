package section_5.t5_30;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) throws Exception {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = switch (state) {
            case "Connecticut" -> "CA";
            case "Massechusetts" -> "MA";
            case "Maine" -> "ME";
            case "New Hampshire" -> "NH";
            case "New Jersey" -> "NJ";
            case "New York" -> "NY";
            case "Pennsylvania" -> "PA";
            case "Vermont" -> "Ve";
            default -> throw new Exception("Niepoprawny kod");
        };
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) throws Exception {
        this.state = switch (state) {
            case "Connecticut"-> "CA";
            case "Massechusetts"-> "MA";
            case "Maine"-> "ME";
            case "New Hampshire"-> "NH";
            case "New Jersey"-> "NJ";
            case "New York"-> "NY";
            case "Pennsylvania"-> "PA";
            case "Vermont"-> "Ve";
            default -> throw new Exception("Niepoprawny kod");
        };
    }

    public boolean inNoFaultState(){
        return switch (getState()) {
            case "MA", "NJ", "NY", "PA" -> true;
            default -> false;
        };
    }
}
