package homeWork3;

import java.util.Arrays;

public class ArraySorter {
    private int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

 public void printSortArray(int[] arr){
        System.out.println(Arrays.toString(sortArray(arr)));

    }

    }

