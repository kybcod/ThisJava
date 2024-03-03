package Check06.ex19;

public class Account {
    private int balance = 0;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1_000_000;

    int getBalance(){
       return this.balance;
    }

    int setBalance(int balance){
        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE){
            this.balance = balance;
        }
        return balance;
    }
}
