package homeWork2;

import java.util.concurrent.SynchronousQueue;

public class Difference {
    public static void main(String[] args) {
        int [] arr = new int[]{5,3,95,46,75,2};
        int evenSum = 0;
        int oddSum = 0;

        for (int i=0; i < arr.length; i++){
            if (i%2 == 0) {
                evenSum += arr[i]; }
            else {
                oddSum += arr[i];
            }
        }
        int difference = evenSum - oddSum;
        System.out.println("Разница между суммой значений четный и нечетных позиций массива = " + difference);
    }
}
