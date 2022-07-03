package item61;

import java.util.Comparator;

public class ProblemCode {
    /**
     * 잘못 구현된 비교자
     */
    static Comparator<Integer> naturalOrder = (i,j) -> (i < j) ? -1 : (i==j ? 0 : 1);

    /**
     * 문제를 수정한 구현자
     */
    static Comparator<Integer> naturalOrderV2 = (iBoxed, jBoxed) -> {
        int i= iBoxed, j = jBoxed;
        return i < j ? -1 : (i==j ? 0 : 1);
    };

    public static void main(String[] args){
        // 두 식별자가 다르므로 같다고 판단하지 않는다. 박싱된 기본 타입에 == 연산자를 사용하면 오류가 일어난다.
        System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
    }
}
