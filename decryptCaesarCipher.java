import java.util.*;
public class decryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("nzop delepd dfaazced jzf", 11);
        System.out.println(output); // --> world
    }

    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        StringBuffer sb = new StringBuffer();

        char[] ch = str.toCharArray();

        for(char c : ch) {
            if(c==' ') {
                sb.append(c);
                continue;
            }
            //secret을 뺀게 알파벳의 범위를 넘어가는 경우
            char a = (char) ((int) c - secret);
            if(a<'`') {
                int diff =(int) ('`'-a) +1;
                a = (char) ((int) 'z' -(diff-1));
            }
            sb.append(a);
        }
        return sb.toString();
    }
}
