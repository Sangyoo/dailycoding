import java.util.*;

public class readVertically_ {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd",
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }
    public static String readVertically(String[] arr) {
        // TODO:
        StringBuffer sb = new StringBuffer();
        String result = "";
        int max = Arrays.stream(arr).mapToInt(n->n.length()).max().getAsInt();
        for(int j =0; j<max; j++ ){
            for(int i=0; i<arr.length;i++){
                if(j>=arr[i].length()) continue;
                sb.append(arr[i].charAt(j));
            }
        }
        result = sb.toString();
        return result;
    }
}
