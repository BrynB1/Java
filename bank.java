package Junior;
import java.util.LinkedList;
import java.util.Scanner;

class BankAccount {
    int accNum;
    double amount;

    public BankAccount(int accNum, double amount) {
        this.accNum = accNum;
        this.amount = amount;
    }

    public void deposit(double amount) {
        this.amount += amount;
        if (amount >= 0){
            System.out.println("Account Number: "+accNum+ " deposited $" + amount);
        }
    }

    public void withdraw(int accNum, double amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            if (amount >= 0){
                System.out.println("Account Number: "+accNum+ " withdrew $" + amount);
            }
        } else {
            System.out.println("Insufficient balance in account " + accNum);
        }
    }

    public double getBalance() {
        return amount;
    }

    public String toString() {
        return "Account Number: " + accNum + ", Balance: $" + amount;
    }
}

class Bank {
    LinkedList<BankAccount> accounts;

    public Bank() {
        accounts = new LinkedList<>();
    }

    public void createAccount(int accNum, double amount) {
        accounts.add(new BankAccount(accNum, amount));
    }

    public void deposit(int accNum, double amount) {
        BankAccount account = findAccount(accNum);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account Number: " + accNum + " not found.");
        }
    }

    public void withdraw(int accNum, double amount) {
        BankAccount account = findAccount(accNum);
        if (account != null) {
            account.withdraw(accNum, amount);
        } else {
            System.out.println("Account Number: " + accNum + " not found.");
        }
    }

    public double getAccountBalance(int accNum) {
        BankAccount account = findAccount(accNum);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account Number: " + accNum + " not found.");
            return 0.0;
        }
    }

    public double getTotalBalance() {
        double totalBalance = 0.0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public void displayAccountsOver100k() {
        System.out.println("Bank accounts with balance over 100k:");
        for (BankAccount account : accounts) {
            if (account.getBalance() > 100000) {
                System.out.println(account);
            }
        }
    }

    private BankAccount findAccount(int accNum) {
        for (BankAccount account : accounts) {
            if (account.accNum == accNum) {
                return account;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Create accounts
        bank.createAccount(1001, 50000);
        bank.createAccount(1002, 150000);
        bank.createAccount(1003, 200000);
        bank.createAccount(1004, 80000);
        bank.createAccount(1005, 300000);

        // Get user inputs
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        // Deposit
        bank.deposit(accNum, depositAmount);

        // Withdraw
        bank.withdraw(accNum, withdrawalAmount);

        // Get account balance
        double balance = bank.getAccountBalance(accNum);
        System.out.println("Account Number: " + accNum + " balance: $" + balance);
        System.out.println();

        // Get total balance
        double totalBalance = bank.getTotalBalance();
        System.out.println("Total balance of all bank accounts: $" + totalBalance);
        System.out.println();

        // Display accounts over 100k
        bank.displayAccountsOver100k();
        scanner.close();
    }
}
