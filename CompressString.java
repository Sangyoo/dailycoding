import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("dsafdasfffffsgaaaaabbbscccdd");
        System.out.println(output); // --> "dsafdas5fsg5a3bs3cdd"

        output = compressString("wwwggopp");
        System.out.println(output); // --> "3wggopp"
    }
    public static String compressString(String str) {
        // TODO:
        if(str.length() == 0) return null;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i=0;
        char comp = str.charAt(i);
        //string을 돈다 i<str.length()-1
        while(i<str.length()-1){
            //comp에 str.charAt(i)를 할당
            comp = str.charAt(i);
            //comp와 i+1이 같으면
            if(comp==str.charAt(i+1)) {
                count++;
                i++;
            }
            //다르면
            else{
                //count가 3이상인 경우
                if(count>=3) {
                    sb.append(Integer.toString(count));
                    sb.append(str.charAt(i));
                    i++;
                    count = 1;
                }
                //count가 2이하라면
                else if(count==2){
                    sb.append(str.charAt(i-1));
                    sb.append(str.charAt(i));
                    i++;
                    count=1;
                }
                else{
                    sb.append(str.charAt(i));
                    i++;
                }
            }
        }
        //마지막 문자열 str.charAt(i)이 comp와 같다면
        if(comp == str.charAt(i)) {
            //count가 2이상이라면
            if(count>=3) {
                sb.append(Integer.toString(count));
                sb.append(str.charAt(i));
            }
            else if(count ==2){
                sb.append(str.charAt(i));
                sb.append(str.charAt(i));
            }
            else {
                sb.append(str.charAt(i-1));
                sb.append(str.charAt(i));
            }
        }
        else{
            sb.append(str.charAt(i-1));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
