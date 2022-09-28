public class BankAccountTest{
    public static void main (String[] args){
        BankAccount bankAccount1 = new BankAccount(99.99, 220.87);
        BankAccount bankAccount2 = new BankAccount(1050.75, 5000.00);
        
        
        System.out.println(BankAccount.accountCount());
        System.out.println(BankAccount.showAmount());
        bankAccount1.depositCheckingBalance(10500.50);
        bankAccount1.withdrawCheckingBalance(200);
        System.out.println(bankAccount1.getCheckingBalance());
        bankAccount2.depositSavingsBalance(100000.00);
        bankAccount2.withdrawSavingsBalance(2000);
        System.out.println(bankAccount2.getSavingsBalance());

    }
}