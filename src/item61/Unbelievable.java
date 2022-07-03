package item61;

public class Unbelievable {
    static Integer i;

    public static void main(String[] args){
        // NPE 발생.
        // 기본 타입과 박싱된 기본 타입을 혼용한 연산에서는 박싱된 기본 타입의 박싱이 자동으로 풀린다.
        if (i == 42){
            System.out.println("Unbelievable!");
        }

        // 끔찍이 느린 코드, 박싱되고 객체를 참조하는데 시간을 써야함.
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE ; i++){
            sum+=i;
        }
    }
}
