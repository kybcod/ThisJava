package Check06.ex20;

public class Account {
    private String number;
    private String name;
    private int initialDeposit;

    public Account(){}

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}