package ConceptsOfProgramming.Assignment_2.BankApplication;

import java.util.Scanner;

public class TesterBankApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BankApplication acc1 = new BankApplication();
        BankApplication acc2 = new BankApplication();

        acc1.setName("Ahad");
        acc2.setName("Tushar");

        System.out.println("\nAccount details of Ahad:\nName: " + acc1.getName());
        System.out.println("Account No.: " + acc1.getAccount_num());
        System.out.println("Balance available: ₹" + acc1.getBalance());

        System.out.println("\nAccount details of Tushar:\nName: " + acc2.getName());
        System.out.println("Account No.: " + acc2.getAccount_num());
        System.out.println("Balance available: ₹" + acc2.getBalance());

        acc1.withdraw(3000);
        acc2.deposit(4000);

        acc2.moneyTransfer(acc1,6000);


    }
}
