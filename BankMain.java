import java.util.Date;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        Bank object = new Bank();
        object.welcomeMessage();

        System.out.println("enter your pin code:");
        int pin = scan.nextInt();
        if (pin == 1234 || pin == 4321){


            System.out.println("enter account number:");
            int accountNumber = scan.nextInt();

            System.out.println("enter name:");
            scan.nextLine();
            String name = scan.nextLine();
            object.insertData(accountNumber,name);

            System.out.println("deposit:");
            float depositAmountHere = scan.nextFloat();
            object.depositAmount(depositAmountHere);

            System.out.println("withdraw amount:");
            float withdrawAmountHere = scan.nextFloat();
            object.withdrawAmount(withdrawAmountHere);

            System.out.println("Transfer amount:");
            float TransferAmount = scan.nextFloat();
            object.amountTransfer(TransferAmount);

            System.out.println("to check balance please enter 5:");
            int choice = scan.nextInt();
            if (choice != 5){
                System.out.println("incorrect please press 5 to view balance.");
            }else {
                object.checkBalance();
            }

            System.out.println("to view full result please enter 6:");
            int FullResult = scan.nextInt();
            if (FullResult != 6){
                System.out.println("incorrect please press 6 to view balance.");
            }else {
                object.displayResults();
            }

            System.out.println("current date/time/year ---> " + date.toString());
            object.goodByeMessage();
        }else{
            System.out.print("incorrect pin please try again");
        }
    }
}
