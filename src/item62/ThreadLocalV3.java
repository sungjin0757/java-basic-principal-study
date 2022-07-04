package item62;

public class ThreadLocalV3 {
    private ThreadLocalV3(){

    }

    public final class ThreadLocal{
        public ThreadLocal();
        public void set(Object value);
        public Object get();
    }

    // 제네릭
    public final class ThreadLocalGenenic<T>{
        public ThreadLocal();
        public void set(T value);
        public T get();
    }

}
