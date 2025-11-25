package ie.atu;

public class BankAccount {
private String accNo;
private String name;
private double balance;

    public BankAccount(String accNo, String name, double balance) { //parameterised constructor
    if(balance <= 0){
        throw new IllegalArgumentException("Balance must be greater than 0.");
        }
    this.accNo = accNo;
    this.name = name;
    this.balance = balance;
    }

    public BankAccount() {  //default constructor

    }

    //getters
    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {    //increase balance
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        this.balance += amount;
    }

    public void withdrawal(double amount) {     //decrease balance
        if (amount < 0) {
            throw new IllegalArgumentException("Negative Withdrawal is not allowed.");
        }
        this.balance -= amount;
    }

}
