package item59;

import java.util.Random;

/**
 * 표준 라이브러리를 사용하면 이런 문제를 말끔히 해결할 수 있다.
 */
public class ProblemCode {
    static Random rnd = new Random();

    /**
     * 문제가 많은 코드
     * n이 그리 크지 않은 2의 제곱수라면 얼마 지나지 않아 같은 수열이 반복
     * n이 2의 제곱수가 아니라면 몇몇 숫자가 평균적으로 더 자주 반환된다.
     * 지정한 범위 바깥의 수가 종종 튀어나올 수 있다.
     * Math.abs를 통해 음수를 양수로 매핑하기 때문이다. ex) Integer.MIN_VALUE
     */
    static int random(int n){
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args){
        int n = 2 * (Integer.MAX_VALUE/3);
        int low = 0;
        for(int i = 0; i < 1000000; i++){
            if(random(n) < n/2){
                low++;
            }
        }
        System.out.println(low);
    }
}
