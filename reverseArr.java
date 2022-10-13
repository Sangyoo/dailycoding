import java.util.*;

public class reverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr.reverseArry(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
    public static int[] reverseArry(int[] arr){
        // TODO:
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        int[] tail = reverseArry(Arrays.copyOfRange(arr,0,arr.length-1));


        int[] result = new int[head.length+tail.length];
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);

        return result;
    }
}