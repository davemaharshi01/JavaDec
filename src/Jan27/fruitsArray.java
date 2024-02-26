package Jan27;

import java.util.Scanner;

public class fruitsArray {
    public static void main(String[] args) {

        String[] fruits = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fruits.length; i++ ){
            fruits[i] = sc.next();
        }
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}
