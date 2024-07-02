package Stream;

import java.util.function.Function;

public class S02Lambda2 {
    public static void main(String[] args) {
        // 메소드 참조(method reference)는 람다 표현식이 단 하나의 메서드만을 호출하는 경우에
        // 해당 람다 표현식에서 불필요한 매개변수를 제거하고 사용할 수 있도록 한다
        // 메서드 참조를 사용하면 불필요한 매개변수를 제거하고 '::' 기호를 사용하여 표현할 수 있다
        Operator oper1 = x -> Math.abs(x);  // 람다 표현식
        Operator oper2 = Math::abs;         // 메서드 참조


        // 특정 인스턴스의 메서드를 참조할때도 참조변수의 이름으로 메서드 참조를 사용할 수 있다
        MyClass obj = new MyClass();
        Function<Object, Boolean> func1 = (another) -> obj.equals(another); // 람다 표현식
        Function<Object, Boolean> func2 = obj::equals;                      // 메서드 참조

        System.out.println(func2.apply(obj));           // true
        System.out.println(func2.apply(new MyClass())); // false


        // 생성자 참조
        MyClassMaker maker1 = name -> new MyClass(name);
        MyClassMaker maker2 = MyClass::new;

        MyClass myClass = maker2.returnObj("생성자 참조로 만든 MyClass객체");
        System.out.println(myClass.name);


        // 배열 생성자 참조
        Function<Integer, int[]> func3 = length -> new int[length];
        Function<Integer, int[]> func4 = int[]::new;
        int[] arr = func4.apply(10);
        System.out.println(arr.length);
    }
}

@FunctionalInterface
interface Operator {
    public int abs(int num);
}

class MyClass {
    String name = "";
    
    MyClass(){}

    MyClass(String name){
        this.name = name;
    }
}

@FunctionalInterface
interface MyClassMaker {
    public MyClass returnObj(String name);
}