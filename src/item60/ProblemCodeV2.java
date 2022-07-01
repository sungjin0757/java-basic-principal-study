package item60;

import java.math.BigDecimal;

public class ProblemCodeV2 {
    /**
     * 속도가 느리고 사용하기 불편하다.
     */
    public static void main(String[] args){
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)){
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈 (달러) : " + funds );
    }
}
