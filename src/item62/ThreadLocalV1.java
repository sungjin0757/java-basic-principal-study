package item62;

/**
 * 문제는 스레드 구분용 문자열 키가 전역 이름공간에서 공유된다는 점이다.
 * 만약 두 클라이언트가 서로 소통하지 못해 같은 키를 쓰기로 결정한다면, 의도치 않게 같은 변수를 공유하게 된다.
 */
public class ThreadLocalV1 {
    private ThreadLocalV1() {

    }

    // 현 스레드의 값을 키로 구분해 저장한다.
    public static void set(String key, Object value);

    // (키가 가리키는) 현 스레드의 값을 반환한다.
    public static Object get(String key);
}
