package Jan7;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        // Enter the welcome quote
        System.out.println("Welcome to Equation Solver");
        // Introduce scanner object
        Scanner scanner = new Scanner(System.in);
        // Ask user to input the number


        System.out.println("Type 1 for Multiplication");
        System.out.println("Type 2 for Subtraction");
        System.out.println("Type 3 for Division");

        int ChooseFrom1to3 = scanner.nextInt();

        System.out.println("Enter the 3 values to calculate");

        System.out.println("Value1");
        int Value1 = scanner.nextInt();
        System.out.println("Value2");
        int Value2 = scanner.nextInt();
        System.out.println("Value3");
        int Value3 = scanner.nextInt();


        // Find value for x for multiplication/division/subtraction

        int Mul = Value1*Value2*Value3;
        int Sub = Value1-Value2-Value3;
        int Div = Value1/Value2/Value3;



        switch(ChooseFrom1to3) {
            case 1:
            System.out.println("Multiplication of provided value is:  "+ Mul);
            break;
            case 2:
            System.out.println("Subtraction of provided value is: "+ Sub);
            break;
            case 3:
            System.out.println("Division of the provided value is:"+ Div);
            break;
            default:
            System.out.println("Choose the number between 1 and 3");
        }


        System.out.println("Thank you for using Equation Solver");


    }
}
