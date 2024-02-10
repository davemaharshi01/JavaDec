package Assignment;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1234, "Hello",1000);
        System.out.println("Welcome to the ABC bank Account user Portal");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please select your language:");
        System.out.println("1. for English");
        System.out.println("2. for French");
        System.out.println("3. to Exit");
        int input = sc.nextInt();

        do {
            if (input == 1){
                System.out.println("Please choose from the Following:");
                System.out.println("Press 1 to see the statement");
                System.out.println("Press 2 to Deposit the Money");
                System.out.println("Press 3 to withdraw the Money");
                int choose = sc.nextInt();
                switch (choose){
                    case 1:
                        ba.printStatement();
                    break;
                    case 2:
                        ba.deposit();
                    break;
                    case 3:
                        ba.withdraw();
                    break;
                    default:
                        System.out.println("Please choose the correct option");
                }
            }
            else if (input == 2) {
                System.out.println("Thank you for choosing French");
            }
            else if (input == 3) {
                System.out.println("Thank you for being valued customer of the Bank ");
            }
            sc.close();
        }while (input > 3);
        System.out.println("Please try again");
    }
}
