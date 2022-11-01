public class power {
    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output); // --> 19334827
        output = power(5, 22);
        System.out.println(output); // --> 70168358
        output = power(4, 15);
        System.out.println(output); // --> 29773085
        output = power(3, 11);
        System.out.println(output); // --> 177147
        output = power(2, 10);
        System.out.println(output); // --> 1024
    }
    public static long power(int base, int exponent) {
        // TODO:
        long result = 1;
        for(int i = 0; i<exponent;i++) {
            result *= base;
            if(result % 94906249 != result) {
                result = result%94906249;
            }
        }
        return result;

    }
}

/*
* 문제
두 수를 입력받아 거듭제곱을 리턴해야 합니다.

입력
인자 1: base
int 타입의 자연수 (base >= 2)
인자 2: exponent
int 타입의 정수 (exponent >= 0)

출력
long 타입을 리턴해야 합니다.
실제 계산 결과를 94,906,249로 나눈 나머지를 리턴해야 합니다.

주의사항
Math.pow, 거듭제곱 연산자 사용은 금지됩니다.
시간복잡도 O(logN)을 만족해야 합니다.
나머지를 구하는 이유는 계산 결과가 컴퓨터로 나타낼 수 있는 수의 범위를 넘을 수 있기 때문입니다.
하지만 모든 연산이 끝난 뒤에 그 결과를 94,906,249로 나누려고 해서는 안 됩니다.
연산 중간에도 이 범위를 넘을 수 있기 때문에,
연산을 할 때마다 나머지를 구하고 그 결과에 연산을 이어가시기 바랍니다.*/