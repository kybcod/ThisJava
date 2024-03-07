package Check06.ex19;

public class Account {
    private int balance;
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1_000_000;

    int getBalance(){
       return this.balance;
    }

    void setBalance(int balance){
        if(balance > MIN_BALANCE && balance <= MAX_BALANCE){
            this.balance = balance;
        }





    }
}
