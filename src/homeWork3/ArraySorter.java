package homeWork3;

public class ArraySorter {
    private int[] array;
    public ArraySorter(int [] array){
        this.array = array;}

    private void swapElements(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private int partition(int low, int high) {
        int p = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < p) {
                i++;
                swapElements(i, j);
            }
        }
        swapElements(i + 1, high);
        return i + 1;
    }}

