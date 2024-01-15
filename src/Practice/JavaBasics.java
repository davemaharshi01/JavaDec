package Practice;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

      int originalNumber = sc.nextInt();
      int reversedNumber = 0;


      while (originalNumber != 0) {
          int lastdigit = originalNumber % 10;
          reversedNumber = reversedNumber *10 + lastdigit;
          originalNumber = originalNumber / 10;

          System.out.println(reversedNumber);
      }

    }
}


//System.out.println("Hello");
//        System.out.println("Java");

//int x = 74;
//        int y = 36;
//
//        System.out.println(x+y);

//int x = 50;
//        int y = 3;
//
//        System.out.println(x/y);

// int x = -5;
//        int y = 8;
//        int A = 6;
//        int B = 55;
//        int C = 9;
//        int D = 20;
//        int E = -3;
//        int F = 5;
//        int G = 15;
//        int H = 3;
//        int I = 2;
//
//        System.out.println(x+y*A);
//        System.out.println((B+C)%C);
//        System.out.println(D+(E*F)/y);
//        System.out.println(F+G/H*I-y%H);

// Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        System.out.println(x*y);

//  int x = sc.nextInt();
//       int y = sc.nextInt();
//
//       System.out.println(x+y);
//       System.out.println(x-y);
//        System.out.println(x*y);
//        System.out.println(x/y);
//        System.out.println(x%y);

//int x = sc.nextInt();
//       int y = 1;
//
//       while (y <= 10){
//           System.out.println(x*y);
//           y++;
//       }

// System.out.println("   J    a    v     v    a");
//        System.out.println("   J   a a    v   v    a a");
//        System.out.println("J  J  aaaaa    v v    aaaaa");
//        System.out.println(" JJ  a      a   v    a      a");

//double x = 25.5;
//       double y = 3.5;
//       double A = 40.5;
//       double B = 4.5;
//
//       System.out.println((x*y-y*y)/(A-B));

//int a = 1;
//       double b = 4.0;
//       double c = 1.0;
//       int d = 3;
//       int e = 5;
//       int f = 7;
//       int g = 9;
//       int h = 11;
//
//       System.out.println(b * (a - (c/d) + (c/e) - (c/f) + (c/g) - (c/h)));

// double radius = sc.nextDouble();
//       double x = 3.14;
//       double area = x*(radius*radius);
//       double perimeter = 2*x*radius;
//
//      System.out.println(area);
//      System.out.println(perimeter);

// int x = sc.nextInt();
//       int y = sc.nextInt();
//       int z = sc.nextInt();
//       int a = 3;
//
//       int sum = x+y+z;
//       double Average = sum/a;
//
//       System.out.println(Average);

//double Width = sc.nextDouble();
//       double height = sc.nextDouble();
//       int x = 2;
//       double perimeter;
//       double Area;
//       Area = Width * height;
//       perimeter = x * (height + Width);
//
//       System.out.println("Area: "+Area);
//       System.out.println("Perimeter: "+perimeter);

// int a = 10;
//       int b = 20;
//
//       int temp;
//       temp = a;
//       a = b;
//       b = temp;
//
//       System.out.println(a);
//       System.out.println(b);

//int i = 0;
//    int x = sc.nextInt();
//    int sum;
//
//    while (i <= 100) {
//        System.out.println(sum = x*i);
//        i++;
//    }

// int i = 0;
//       int x = 2;
//
//       while (i < 21) {
//           System.out.println(i);
//           i +=2;
//       }
