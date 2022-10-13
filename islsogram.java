import java.util.ArrayList;
import java.util.Arrays;

public class islsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }
    public static boolean isIsogram(String str) {
        // TODO:
        if(str.length()==0) return true;
        ArrayList<Character> cal = new ArrayList<>();
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            if(cal.contains(str.charAt(i))) return false;
            else cal.add(str.charAt(i));
        }
        return true;
    }
}
