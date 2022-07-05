package item64;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class ReflectionEx {
    /**
     * 런타임에 총 여섯가지나 되는 예외를 던질 수 있다. ( 그 모두가 인스턴스를 리플렉션 없이 생성했다면 컴파일 타임에 잡아낼 수 있었을 예외들이다.)
     * 비검사 형변환 경고가 뜬다.
     * 리플렉션은 런타임에 존재하지 않을 수 도 있는 다른 클래스, 메서드, 필드와의 의존성을 관리할 때 적합하다.
     * 이 기법은 버전이 여러 개 존재하는 외부 패키지를 다룰 때 유용하다.
     */
    public static void main(String[] args){
        //클래스 이름을 Class 객체로 변환
        Class<? extends Set<String>> cl = null;
        try{
            cl = (Class<? extends Set<String>>) Class.forName("java.util.HashSet");
        }catch (ClassNotFoundException e){
            fatalError("클래스를 찾을 수 없습니다.");
        }

        // 생성자를 얻는다.
        Constructor<? extends Set<String>> cons = null;
        try{
            cons = cl.getDeclaredConstructor();
        }catch (NoSuchMethodException e){
            fatalError("매개변수 없는 생성자를 찾을 수 없습니다.");
        }

        // 집합의 인스턴스를 얻는다.
        Set<String> s = null;
        try{
            s = cons.newInstance();
        }catch (IllegalAccessException e){
            fatalError("생성자에 접근할 수 없습니다.");
        }catch (InstantiationException e){
            fatalError("클래스를 인스턴스화할 수 없습니다.");
        }catch (InvocationTargetException e){
            fatalError("생성자가 예외를 던졌습니다 : "+e.getMessage());
        }catch (ClassCastException e){
            fatalError("Set을 구현하지 않은 클래스 입니다.");
        }

        s.addAll(Arrays.asList("a", "b", "c"));
        System.out.println(s);
    }

    private static void fatalError(String msg){
        System.out.println(msg);
        System.exit(1);
    }
}
