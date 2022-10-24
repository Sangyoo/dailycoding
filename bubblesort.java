import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{1, 2, 43, 100, 100, 21});
        Arrays.stream(output).forEach(n-> System.out.println(n)); // --> [1, 2, 3]
    }
    static int[] bubbleSort(int[] arr) {
        // TODO:
        int end = arr.length-1;
        int temp = 0;
        while(end>0) {
            for(int i = 0; i<end; i++ ) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            end--;
        }
        return arr;
    }
}