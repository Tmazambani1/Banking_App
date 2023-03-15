import java.util.Scanner;

public class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){

        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount)
    {
        if(amount >0 ){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount!= 0){
            balance = balance - amount;
            previousTransaction =-amount;
        }
    }
    void  getPreviousTransaction(){
        if (previousTransaction>0){
            System.out.println("Deposited: "+previousTransaction);
        } else if(previousTransaction<0){
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }else {
            System.out.println("No transaction occurred");
        }
    }

    void  showMenu(){

       char option = '\0';
        Scanner keyscan = new Scanner(System.in);


        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("***********************************************");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit system");

        do{
            System.out.println("***********************************************");
            System.out.println("Enter an option");
            System.out.println("***********************************************");
            option = keyscan.next().charAt(0);
            System.out.println("***********************************************");

            switch(option)
            {
                case'A':
                    System.out.println("***********************************************");
                    System.out.println("Balance ="+balance);
                    System.out.println("***********************************************");
                    System.out.println(" ");
                    break;

                case 'B':
                    System.out.println("***********************************************");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("***********************************************");
                    int amount = keyscan.nextInt();
                    System.out.println();
                    deposit(amount);
                    System.out.println("***********************************************");
                    break;

                case 'C':
                    System.out.println("***********************************************");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("***********************************************");
                    int amount2 = keyscan.nextInt();
                    withdraw(amount2);
                    System.out.println("***********************************************");
                    break;

                case 'D':
                    System.out.println("***********************************************");
                    getPreviousTransaction();
                    System.out.println("***********************************************");
                    System.out.println("");

                case 'E':
                    System.out.println("***********************************************");
                    break;
                default:
                    System.out.println("Invalid options!!! Please enter again");
                    break;
            }
        } while (option != 'E');

        System.out.println(" Thank you for using our services!");
        System.out.println("***********************************************");



    }
}
