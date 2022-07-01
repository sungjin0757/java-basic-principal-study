package item60;

public class ProblemCode {
    /**
     * 부동 소수점으로 인한 예상치 못한 결과값을 나타낸다.
     * 신뢰성이 중요한 금융 계산에는 BigDecimal, int 혹은 long을 사용해야한다.
     */
    public static void main(String[] args){
        double funds = 1.00;
        int itemsBought = 0;
        for(double price = 0.10; funds >= price ; price += 0.10){
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + "개 구입");
        System.out.println("잔돈 (달러) : " + funds );
    }
}
