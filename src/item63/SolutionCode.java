package item63;

import java.util.List;

public class SolutionCode {
    // 시간이 빠르다. 선형적으로 증가.
    public String statement(List<String> items){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < items.size() ; i++){
            sb.append(items.get(i));
        }
        return sb.toString();
    }
}
