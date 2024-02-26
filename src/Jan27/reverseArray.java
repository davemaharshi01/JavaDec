package Jan27;

public class reverseArray {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers  [0] = 10;
        numbers  [1] = 20;
        numbers  [2] = 30;
        numbers  [3] = 40;
        numbers  [4] = 50;

        int x;
        int y;

        for (int i = 0; i < numbers.length; i++){
            x = numbers[0];
            numbers[0] = numbers[4];
            numbers[4] = x;
            System.out.println(numbers[i]);
            y = numbers[1];
            numbers[1] = numbers[3];
            numbers[3] = y;
        }

    }



}
