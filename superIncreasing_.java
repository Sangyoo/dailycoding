import java.util.*;

public class superIncreasing_ {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = superIncreasing(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false
    }
    public static boolean superIncreasing(int[] arr) {
            // TODO
        int sum = 0;
        for(int a : arr) {
            if(sum==0) sum = a;
            else if(sum<a) {
                sum += a;
            }
            else return false;
        }
        return true;
    }
}
