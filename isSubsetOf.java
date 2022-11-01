import java.util.*;
import java.util.stream.Collectors;

public class isSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }
    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        ArrayList<Integer> al = new ArrayList<>();
        for(int a : base) {
            al.add(a);
        }
        int abc = (int) Arrays.stream(sample).filter(n->al.contains(n)).count();
        if(abc == 0 ) return false;
        else return true;
    }
}

/*isSubsetOf
문제
두 개의 배열(base, sample)을 입력받아 sample이 base의 부분집합인지 여부를 리턴해야 합니다.

입력
인자 1 : base
int 타입을 요소로 갖는 임의의 배열
base.length는 50,000 이하
인자 2 : sample
int 타입을 요소로 갖는 임의의 배열
sample.length는 50,000 이하

출력
boolean 타입을 리턴해야 합니다.

주의사항
base, sample 내에 중복되는 요소는 없다고 가정합니다.*/