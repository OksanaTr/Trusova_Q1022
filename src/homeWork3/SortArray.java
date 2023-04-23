package homeWork3;

import java.util.Arrays;

public class SortArray {
    public static int[] main(int[] args){
       /* int[]arr = new int[3];
         arr[0] = 18;
         arr[1] = 45;
         arr[2] = -4;*/
        int[] arr = {15,28,-34,46,0,64,12,57};
         return arr;
    }

    private int[] sortArray1(int[] args){
      int [] arr = new int[8];
      /*  for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;*/

        Arrays.sort(arr);
        return arr;
    }
        public void printlnSortArray1(int[] arr) {
        System.out.println(Arrays.toString(sortArray1(arr)));
    }
    private int maxValue (int[] arr){
        sortArray1(arr);
        return arr[arr.length -1];
    }
    public void printlnMaxValue(int[] arr) {
        System.out.println(maxValue(arr));}

        private int foundIndex (int[] arr, int n){
            int j = 46;
            for(int i=0; i< n + 1; i++) {
                j = n;
            };
            return j;
        }

      public void printlnFoundIndex (int [] arr, int n) {
             System.out.println(foundIndex(arr, n));
                    }

}

