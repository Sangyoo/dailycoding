import java.util.*;

public class largestProductOfThree {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        // TODO:
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                for (int k = j + 1; k < arr.length ; k++) {
                    al.add(arr[i] * arr[j] * arr[k]);
                }
            }
        }
        return al.stream().mapToInt(n -> n).max().orElse(0);
    }
}
