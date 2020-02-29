package day40;

public class BankAccount {
    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;

    public void setAllTheValue(String newAccountType,String newAccountHolder,long newAccountNumber, double newBalance){
        accountType=newAccountType;
        accountHolder=newAccountHolder;
        accountNumber=newAccountNumber;
        balance=newBalance;

    }

    public void showAccountBalance(){
        System.out.println("Current balance= " +balance);
    }

    public void showAccountHolderType(){
        System.out.println("accountType = " + accountType);

    }

    public double getBalance(){
        return balance;

    }
}
