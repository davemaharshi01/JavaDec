package Practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        System.out.println("Type 1 for Division");
        System.out.println("Type 2 for Subtraction");
        System.out.println("Type 3 for Multiplication");
        System.out.println("Type 4 for Addition");

        Scanner sc = new Scanner(System.in);

        System.out.println("Type in your input:");
        int Input = sc.nextInt();
        int num1;
        int num2;
        int num3;
        int Div;
        int Sub;
        int Mul;
        int Add;

        switch (Input) {
            case 1:
                System.out.println("Please type 3 inputs");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                Div = num1/num2/num3;
                System.out.println("Result: " + Div);
            break;
            case 2:
                System.out.println("Please type 3 inputs");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                Sub = num1-num2-num3;
                System.out.println("Result: "+ Sub);
            break;
            case 3:
                System.out.println("Please type 3 inputs:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                Mul = num1*num2*num3;
                System.out.println("Result: "+ Mul);
            break;
            case 4:
                System.out.println("Please type 3 inputs:");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                Add = num1+num2+num3;
                System.out.println("Result: "+ Add);
            break;
            default:
                System.out.println("Please choose the options from the following");
        }

    }
}
