package item63;

import java.util.List;

public class ProblemCode {
    /**
     * 매우 느린 코드. 객체를 생성하고 복사하고 이런시간이 낭비된다. 제곱수 비례
     */
    public String statement(List<String> items){
        String result = "";
        for(int i = 0 ; i < items.size() ; i++){
            result += items.get(i);
        }
        return result;
    }
}
