package Jan16;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int points = 0;
        for (int i = 1; i <= 100 ; i++) {
            int x = sc.nextInt();
            if (x % 7 == 0) {
                System.out.println("You got 7 points");
                points = points + 7;
                continue;
            } else if (x % 5 == 0) {
                System.out.println("You got 5 points");
                points = points + 5;
                continue;
            } else if (x == 6) {
                System.out.println("You won the Jackpot");
                break;
            }
        }
System.out.println("Your Total points: "+points);

    }
    }



// int i = 1;
//        while (i < 101) {
//            System.out.println(i);
//            i++;

//int i = 0;
//        int sum;
//        while (i <=10) {
//            System.out.println(sum = i+=1);
//            i++;
//        }

//int x = 5;
//        int y = 1;
//
//        int mul ;
//        while (y <= 10) {
//            System.out.println(mul = x*y);
//            y++;
//        }

//int x = 1;
//
//        do {
//            System.out.println(x);
//            x++;
//        }while (x < 101);

//int n = 10;
//        int x = 1;
//        int sum = 0;
//        do {
//            System.out.println(sum +=x);
//            x++;
//        }while (x <= n);

// int n = 5;
//        int mul;
//        int y = 1;
//        do {
//            System.out.println(mul = n*y);
//            y++;
//        }while (y <= 10);
