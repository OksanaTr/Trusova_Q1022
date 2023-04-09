package homeWork2;

public class SumArray {
    public static void main(String[] args) {
        int [] arr = {5,18,36,-2,9,48};
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr [i] < min) {
                min = arr[i];
            } else
            { if (arr [i] > max)
            {
                max = arr[i];
            }
            } sum = min + max;
        }
        System.out.println ("Сумма минимального и максимального значений:"+ sum);
    }}
