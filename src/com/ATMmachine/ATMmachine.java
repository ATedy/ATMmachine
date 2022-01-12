package com.ATMmachine;
import java.util.HashMap;
import java.util.Scanner;

public class ATMmachine {
    static   HashMap<Integer, String> accountPasswordPair = new HashMap<Integer,String>();
    static  int accountNum;
    static  String password;
    static  double balance=0;
    public static void main(String[] args) {
        accountPasswordPair.put(12345,"pass123");
        accountPasswordPair.put(6789,"pass567");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine\nPlease enter your details");
        System.out.println("Enter account Number:");
        accountNum = sc.nextInt(); // error exceptions to be handled later
        String accValueInput =  accountPasswordPair.get(accountNum);
        if(accValueInput != null){
            System.out.println("Enter your password:");
            password = sc.next();
            if(!password.equals(accValueInput) ){
                System.out.println("wrong password try again");
            }else{
                System.out.println("Welcome and make a selection \n 1. check balance \n 2. deposit money \n 3. withdraw money \n 4. exit");
                System.out.println("make a selection");
                int choice =  sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("your balance is " + balance);
                        System.out.println("Welcome and make a selection \n 1 check balance \n 2 deposit money \n 3 withdraw money \n 4 exit");
                        break;
                    case 2:
                        System.out.println("enter amount to be deposited");
                        double newBalance = sc.nextDouble() + balance;
                        System.out.println("money deposited successfully and balance is now " + newBalance);
                        System.out.println("Welcome and make a selection \n 1 check balance \n 2 deposit money \n 3 withdraw money \n 4 exit");
                        break;
                    case 3:
                        System.out.println("enter amount to  withdraw");
                        newBalance =  balance - sc.nextDouble() ;
                        System.out.println(sc.nextDouble() + " withdrewed and balance is now " + newBalance);
                        System.out.println("Welcome and make a selection \n 1 check balance \n 2 deposit money \n 3 withdraw money \n 4 exit");
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Wrong choice");
                        System.out.println("Welcome and make a selection \n 1 check balance \n 2 deposit money \n 3 withdraw money \n 4 exit");
                }
            }
        } else{
            System.out.println("Wrong account number");
        }
        sc.nextLine();
    }
}

