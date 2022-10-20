import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
    public static String compressString(String str) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i=0;

        //string을 돈다 i<str.length()-1
            //comp에 str.charAt(i)를 할당
            //comp와 i+1을 비교한다
                //같으면
                    //count++;
                    //아니라면 i++;
                //다르면
                    //count가 3이상인 경우
                        //sb에 count와 str.charAt(i)를 넣는다.
                    //count가 2이하라면
                        //sb에 str.charAt(i)를 넣는다.
                    //i++;
        //마지막 문자열 str.charAt(i)이 comp와 같다면
            //count가 3이상이라면
                //sb에 count와 str.charAt(i)를 넣는다.
            //count
        return sb.toString();
    }
}
