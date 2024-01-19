package Jan16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = 50;
        int sum = 0; ;

        while (i <= n) {

            if (i % 2  == 0) {
                sum = sum+i;
            }
            i++;

        }
        System.out.println(sum);
    }
    }



/*
Print the number from 1 to 10
int i = 1;

        while (i < 11) {
            System.out.println(i);
            i++;
        }
*/

/*
Print the factorial number of provided number
System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = sc.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        // Output: Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);
*/