abstract class Account {
    private String accountNumber;
    private long balance;
    public Account(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    String getAccountNumber() {
        return accountNumber;
    }
    long getBalance() {
        return balance;
    }
    void setBalance(long balance) {
        this.balance = balance;
    }
    void deposit(long money) {
        if (money > 0) {
            setBalance(getBalance() + money);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    abstract void withdraw(long money);
    void showInfo() {
        System.out.println(getAccountNumber() + " - So du: " + getBalance());
    }
}
interface InterestBearing {
    long addInterest();
}
class CheckingAccount extends Account {
    private static final long FEE = 1000;
    public CheckingAccount(String accountNumber, long balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(long money) {
        if(money > 0 && money + FEE <= getBalance()) {
            setBalance(getBalance() - money - FEE);
        }
        else {
            System.out.println("Khong du tien");
        }
    }
}
class SavingAccount extends Account implements InterestBearing{
    private static final long SDU = 5000000;
    private static final double PERCENT = 0.05;
    public SavingAccount(String accountNumber, long balance) {
        super(accountNumber, balance);}
    @Override
    public void withdraw(long money) {
        if (money > SDU) {
            System.out.println("Vuot han muc rut");
        } else if (money > getBalance()) {
            System.out.println("Khong du tien");
        } else {
            setBalance(getBalance() - money);
        }

    }
    @Override
    public long addInterest() {
        long interest = (long) (getBalance() * PERCENT);
        setBalance(getBalance() + interest);
        return interest;
    }
}
class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new CheckingAccount("TK001", 10000000);
        accounts[1] = new SavingAccount("TK002", 10000000);
       for (Account account : accounts) {
            account.deposit(2000000);
            account.withdraw(6000000);
            account.showInfo();
        }

        for (Account account : accounts) {
            if (account instanceof InterestBearing) {
                ((InterestBearing) account).addInterest();
            }
            account.showInfo();
        }

    }
}