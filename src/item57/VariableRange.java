package item57;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VariableRange {
    public static void main(String[] args){
        List<Integer> lists = new ArrayList<>();

        /**
         * 컬렉션이나 배열을 순회하는 권장 관용규
         * 지역 변수 범위를 최소화 할 수 있는 for 문
         */
        for (Integer list : lists) {

        }

        /**
         * 반복자를 사용해야하는 상황
         * 전통적인 for문을 사용하는 것이 좋다.
         */
        for(Iterator<Integer> i = lists.iterator(); i.hasNext();){
            System.out.println(i.next());
        }

        /**
         * 반복자를 사용해야하는 상황은 for문 보다는 while 문을 사용하는 것이 더 쓸만함.
         */
        Iterator<Integer> it = lists.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<Integer> lists2 = new ArrayList<>();
        Iterator<Integer> it2 = lists2.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); // 버그, 컴파일 에러는 일어나지 않지만 코딩의 흐름 상 에러가 발생한다.(복사, 붙여넣기로 인한 버그)
        }

        //for 문을 사용하면 위의 버그를 잡을 수 있다.
//        for(Iterator<Integer> i2 = lists.iterator(); i.hasNext();){
//            Integer e = i2.next();
//        }
    }
}
