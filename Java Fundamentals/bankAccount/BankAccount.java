public class BankAccount{
    // attributes
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalAmountStored;


    // methods
    public BankAccount (){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts+=2;
    }

    // adding total of all available accounts
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalAmountStored += checkingBalance;
        totalAmountStored += savingsBalance;
        numberOfAccounts +=2;
    }

    // amount of accounts
    public static int accountCount() {
        return numberOfAccounts;
    }

    // total amount of account
    public static double showAmount(){
        return totalAmountStored;
    }

    // deposit into checking account
    public void depositCheckingBalance(double deposit){
        this.checkingBalance += deposit; 
        totalAmountStored += deposit;
    }

    // deposit into savings account
    public void depositSavingsBalance(double deposit){
        this.savingsBalance += deposit; 
        totalAmountStored += deposit;
    }

    // withdraw from checking account
    public void withdrawCheckingBalance(double withdraw){
        if (withdraw > this.checkingBalance){
            System.out.println ("Your account balance holds less than the requested amount.");
        }
        else{
            this.checkingBalance -= withdraw;
            totalAmountStored -= withdraw; 
        }
    }

    // withdraw from savings account
    public void withdrawSavingsBalance(double withdraw){
        if (withdraw > this.savingsBalance){
            System.out.println ("Your account balance holds less than the requested amount.");
        }
        else{
            this.savingsBalance -= withdraw;
            totalAmountStored -= withdraw; 
        }
    }

    
    // getter
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    // getter
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    

}