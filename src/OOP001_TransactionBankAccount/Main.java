package OOP001;

class BankAccount {
    private String id;
    private static double balance;
    private int transactions;

    public BankAccount(String id) {
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if(this.balance >= 0 && this.balance <= 500){
            this.balance += amount;
            this.transactions++;
        }
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        this.transactions++;
    }

    public void transactionFee(double fee) {
        int count = this.transactions;
        double sumFee = 0;
        for(int i=1; i<=count; i++) {
            sumFee += i*fee;
        }

        if(sumFee <= this.balance) {
            System.out.println("true");
            this.balance -= sumFee;
        }

        else System.out.println("false");
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");

        savings.deposit(10.00);

        savings.deposit(50.00);

        savings.deposit(10.00);

        savings.deposit(70.00);

        savings.transactionFee(5.00);

        savings.transactionFee(10.00);
    }
}
