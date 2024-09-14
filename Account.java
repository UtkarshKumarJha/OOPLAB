package Lab6;

public class Account {
    String name;
    int num;
    String account;
    double balance;

    Account() {

    }

    Account(String name, int num, String account) {
        this.name = name;
        this.num = num;
        this.account = account;
        this.balance = 0.00;
    }

    public void Deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New balance: " + balance);
    }

    void Display() {
        System.out.println("Account Number: " + num);
        System.out.println("Account Name: " + name);
        System.out.println("Account Type:" + account);
        System.out.println("Balance:" + balance);
    }

    public void Withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful. New balance: " + balance);
        }
    }
}

class CurrentAccount extends Account {
    double minBalance;
    double servicetax;

    CurrentAccount(String name, int num, String account) {
        super(name, num, "Current");
        this.minBalance = 500.0;
        this.servicetax = 50.0;
    }

    public void checkMinBalance() {
        if (balance < minBalance) {
            balance -= servicetax;
            System.out.println("Minimum balance not maintained. Service tax imposed: " + servicetax);
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }
}

class SavingAccount extends Account {
    double rate;

    SavingAccount(String name, int num, String account) {
        super(name, num, "Saving");
        this.rate = 0.05;
    }

    void ComputeInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest computed and deposited: " + interest);
        System.out.println("New Balance:" + balance);
    }
}

class Main {
    public static void main(String[] args) {
        CurrentAccount currentAcc = new CurrentAccount("John Doe", 123456789, "Saving");
        SavingAccount savingsAcc = new SavingAccount("Jane Doe", 98765432, "Current");

        currentAcc.Deposit(5000);
        currentAcc.Display();
        currentAcc.Withdraw(1000);

        savingsAcc.Deposit(6000);
        savingsAcc.Display();
        savingsAcc.ComputeInterest();
        savingsAcc.Display();
        savingsAcc.Withdraw(1000);
    }
}
