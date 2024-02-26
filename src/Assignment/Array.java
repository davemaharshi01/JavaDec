package Assignment;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        char[] ch = new char[i];

        for (int e = 0; e < ch.length; e++){
            ch[e] = sc.next().charAt(0);
        }

        for (char x : ch){
            System.out.print(x);
        }
    }
    }

// 1. Reverse the array
//        int x ;
//        int y;
//        int z;
//        int c;
//   x = number[0];
//            number[0] = number[7];
//            number[7] = x;
//
//            y = number[1];
//            number[1] = number[6];
//            number[6] = y;
//
//            z = number[2];
//            number[2] = number[5];
//            number[5] = z;
//
//            c = number[3];
//            number[3] = number[4];
//            number[4] = c;
//
//
//        for (int i = 0; i < number.length; i++){
//            System.out.println(number[i]);
//        }


//2. find the maximum element
//


//3. find the minimum element
//int min = number[0];
//        for (int i = 0; i < number.length; i++){
//            if (min >= number[i]){
//                min = number[i];
//                System.out.println(min);
//            }
//        }


//

//4. find the second max element
//        int number[] = {10, 30, 43, 54, 23, 543, 43, 32, 5};
//
//        int max = number[0];
//        int sMax = number[0];
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] > max) {
//                sMax = max;
//                max = number[i];
//            }
//               else if (number[i] > sMax && number[i] != max) {
//                    sMax = number[i];
//                }
//            System.out.println("max : "+max);
//            System.out.println("smax : "+sMax);

//5. fond the second min value
//int[] numbers = {10,33,20,49,85,19};
//        int min = numbers[0];
//        int sMin = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++ ){
//            if (numbers[0] < min){
//                sMin = min;
//                min = numbers[i];
//            }
//            else if (numbers[i] > min && numbers[i] != sMin ) {
//                sMin = numbers[i];
//            }
//        }
//        System.out.println("Min value: "+ min);
//        System.out.println("Second min value is: "+sMin);

//6. find the sum and average of all elements
//int[] arr = {10,20,54,22,92,102};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        int average = sum / arr.length;
//        System.out.println("Sum of arr is :" +sum);
//        System.out.println("Average of arr is :"+ average);
//        }
//       /* for (int element : arr) {
//            System.out.println(element);
//        }*/


//7. Find the particular number from the array
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please type the size of the array: ");
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//
//        for (int i = 0; i <size ; i++) {
//            System.out.println("Type the array of numbers: ");
//            numbers[i] = sc.nextInt();
//        }
//        System.out.println("please type in the number you want it to be find-out: ");
//        int x = sc.nextInt();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == x) {
//                System.out.println("find-out number is :" +i);
//            }
//        }



/*
Scanner sc = new Scanner(System.in);
        System.out.println("rows1: ");
int rows1 = sc.nextInt();
        System.out.println("cols1: ");
int cols1 = sc.nextInt();
        System.out.println("rows2: ");
int rows2 = sc.nextInt();
        System.out.println("cols2: ");
int cols2 = sc.nextInt();

int [][] array1 = new int [rows1][cols1];
int [][] array2 = new int [rows2][cols2];

        for (int x = 0; x < rows1; x++){
        for (int y = 0; y < cols1; y++){
        System.out.println("array1: ");
array1[x][y] = sc.nextInt();
            }
                    }
                    for (int x = 0; x < rows2; x++){
        for (int y = 0; y < cols2; y++){
        System.out.println("array2: ");
array2[x][y] = sc.nextInt();
            }
                    }
                    System.out.println("Enter the element you want to find: ");
int i = sc.nextInt();

        for (int x = 0; x < rows1; x++ ){
        for (int y = 0; y < cols2; y++){
        if (array1[x][y] == i){
        System.out.println("We found the element for array1: "+ x + " " + y );
                }
                        }
                        }
                        for (int x = 0; x < rows2; x++){
        for (int y = 0; y < cols2; y++){
        if (array2[x][y] == i) {
        System.out.println("We found the element for array2: " + x + " " + y);
                }
                        }
                        }*/
