import java.util.*;

public class numberSearch {
    public static void main(String[] args) {
//        int output = numberSearch("Hello6 ");
//        System.out.println(output); // --> 1

        int output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    public static int numberSearch(String str) {
        // TODO:
        if(str.length()==0) return 0;
        char[] ch = str.toCharArray();
        int lth = str.length();
        int sum = 0;
        for(char c : ch) {
            if(c-'0'>0 && c-'0'<=9) {
                sum= sum+ (c-'0');
                lth-=1;
            }
            else if(c==' ') {
                lth-=1;
            }
        }
        return (int) Math.round( (double) sum/lth);
    }

}
/*
* 문제
문자열을 입력받아 문자열에서 숫자를 모두 찾아 더한 뒤에 해당 값을
* (숫자와 공백을 제외한 나머지)
* 문자열의 길이로 나눈 값을 정수로 반올림하여 리턴해야 합니다.
* */