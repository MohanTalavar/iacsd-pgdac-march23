package ConceptsOfProgramming.Assignment_2.BankApplication;


public class BankApplication {
    private int account_num;
    private String name;
    private double balance;

    private static int counter;

    static {
        counter = 79721100;
    }

    public BankApplication(){

        counter++;
        this.account_num = counter;
        this.name = name;
        this.balance = 10000;
    }

    public int getAccount_num(){
        return account_num;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if(balance>amount){
            balance -= amount;

            System.out.println("\n₹" + amount + " has been debited from your account.\nUpdated Balance: ₹" + balance);
        }
        else{
            System.out.println("\n" + "Insufficient Balance.");
        }
    }

    public void deposit(double amount){
        balance += amount;

        System.out.println("\n₹" + amount + " has been credited to your account.\nUpdated Balance: ₹" + balance);
    }

    public void moneyTransfer(BankApplication reciver , double amount){
        if (this.balance>amount){
            this.balance -= amount;

            System.out.println("\n₹" + amount + " has been debited from your account.\nUpdated Balance is: ₹ß" + balance);

            reciver.balance += amount;
        }
        else{
            System.out.println("\n" + "Insufficient Balance.");
        }
    }

}
