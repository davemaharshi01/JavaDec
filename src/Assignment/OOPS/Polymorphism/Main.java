package Assignment.OOPS.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Pay Calculator");
        FullTimeEmployee fp = new FullTimeEmployee(101, "Maharshi", 50, 44);
        PartTimeEmployee pe = new PartTimeEmployee(105, "ABC", 45, 20);

        Scanner sc = new Scanner(System.in);
        char input;
        do {

            System.out.println("Press a to open Menu");
            System.out.println("Press b to Logout");
            input = sc.next().charAt(0);

            if (input == 'a') {
                int options;
                do {
                    System.out.println("Please choose from the following options:");
                    System.out.println("1. Full-time Employee");
                    System.out.println("2. Part-time Employee");
                    System.out.println("3. Exit");

                    options = sc.nextInt();

                    switch (options) {
                        case 1:
                            int i = fp.calculatePay();
                            System.out.println("Total pay for Full-Time Employee: " + fp.employeeName + " is " + i);
                            break;
                        case 2:
                            pe.calculatePay();
                            break;
                        case 3:
                            System.out.println("Thank you for using the calculator");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                } while (options != 3);
            }
        } while (input != 'b');

        System.out.println("Thank you for using the Pay Calculator");
        sc.close();
    }
}








       /* System.out.println("Employee name is: " + fp.employeeName);
        System.out.println("Employee ID is: " + fp.employeeId);
        System.out.println("Employee Hourly rate is: " + fp.hourlyRate);

        System.out.println("Total Gross Pay for: " + fp.employeeName + " is " + fp.calculatePay() + " incl. of all the taxes.");*/