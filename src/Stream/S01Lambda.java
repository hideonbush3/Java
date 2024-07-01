package Stream;

// 메서드를 하나의 식으로 표현한 것
// 클래스를 작성하고 객체를 생성하지 않아도 사용할 수 있는 메서드

// 문법
// (매개변수목록) -> { 함수몸체 }

// 람다 표현식 작성 시 유의사항 
// 1. 매개변수의 타입을 추론할 수 있는 경우에는 타입을 생략할 수 있다
// 2. 매개변수가 하나인 경우에는 괄호(())를 생략할 수 있다
// 3. 함수의 몸체가 하나의 명령문만으로 이루어진 경우에는 중괄호({})를 생략할 수 있다 (이때 세미콜론(;)은 붙이지 않음)
// 4. 함수의 몸체가 하나의 return 문으로만 이루어진 경우에는 중괄호({})를 생략할 수 없다
// 5. return 문 대신 표현식을 사용할 수 있으며, 이때 반환값은 표현식의 결괏값이 된다 (이때 세미콜론(;)은 붙이지 않음)

public class S01Lambda {
    public static void main(String[] args) {

        // 함수형 인터페이스?
        // 메서드를 단 한개만 갖는 인터페이스

        // 람다 표현식 사용법
        // 함수형인터페이스명 변수명 = 람다 표현식
        // @FunctionalInterface 어노테이션으로 함수형 인터페이스임을 명시할 수 있다
        Calc result = (x, y) -> x + y;
        System.out.println(result.plus(1, 2));


        // Runnable은 함수형 인터페이스
        // 스레드 생성방식
        // 1. 전통적인 방식
        new Thread(new Runnable() {
            public void run() {
                System.out.println("전통적인 방식의 일회용 스레드 생성");
            }
        }).start();
        
        // 2. 람다식으로 Runnable 구현객체 생성 후 Thread 생성자 매개변수로 전달
        Runnable runnable = () -> {System.out.println("Runnable 인터페이스는 함수형 인터페이스이다.");};
        new Thread(runnable).start();

        // 3. 2번 방식을 더 축약
        new Thread(() -> {
            System.out.println("람다 표현식을 사용한 일회용 스레드 생성");
        }).start();
    }
}

@FunctionalInterface
interface Calc { 
    public int plus(int x, int y);
}