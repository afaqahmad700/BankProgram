public class Bank {
    int accountNumber;
    String personName;
    float amount = 0;

    public void insertData(int i,String s){
        this.accountNumber = i;
        this.personName = s;
    }

    public void welcomeMessage(){
        System.out.println("WELCOME");
    }

    public void amountTransfer(float f){
        System.out.println("amount transfer: "+ f);
        this.amount = this.amount - f;
    }


    public void withdrawAmount(float F){
        if (amount<F){
            System.out.println("you have insufficient balance in account");
        }else{
            System.out.println("withdraw amount = " + F);
            amount = amount-F;
        }
    }

    public void depositAmount(float f){
        System.out.println("deposit amount = " + f);
        amount = amount + f;
    }


    public void checkBalance(){
        System.out.println("Amount = " + amount);
    }

    public void displayResults(){
        System.out.println(" account number: " + this.accountNumber +
                            "\n Name: " + this.personName +
                            "\n Total amount: " + this.amount);
    }

    public void goodByeMessage(){

        System.out.println("THANK YOU FOR USING OUR SERVICES HOPE TO SEE YOU SOON!");
    }

}