public class J02StringBuilder {
    // 1. 가변성 -> 메모리 절약
    // StringBuilder는 StringBuffer와 마찬가지로 가변성을 띈다

    // String이 불변성을 띄며, 문자열을 이어붙일때마다 새로운 객체가 생성되는 반면,
    // StringBuilder, StringBuffer는
    // 문자열을 이어붙일때 append() 메서드를 사용하며
    // 이 메서드들은 본인 객체의 참조를 반환한다

    // 즉, 문자열을 이어붙인 이후에도 객체는 그대로라는 말이다
    // 그래서 메모리 절약 측면에서 String보다 뛰어나다


    // 2. 비동기
    // StringBuffer는 동기화돼있음 -> 멀티 쓰레드 환경에서 유리함
    // StringBuilder는 동기화돼있지 않음 -> 싱글 쓰레드 환경에서 유리함

    // 동기보다 비동기가 성능면에서 뛰어나다


    // 마지막으로,
    // StringBuilder 와 StringBuffer는 갖고 있는 메서드가 똑같다
    // 둘 중 무엇을 쓸지 고려해야할 사항은 오직

    // 작성하는 프로그램이 멀티 쓰레드 환경이다 -> StringBuffer 사용
    // 작성하는 프록그램이 싱글 쓰레드 환경이다 -> StringBuilder 사용
}