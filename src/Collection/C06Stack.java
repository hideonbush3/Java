package Collection;

import java.util.Stack;

public class C06Stack {
    public static void main(String[] args) {
        // 선언
        Stack<Integer> s = new Stack<>();

        // 요소 추가
        // 요소가 아래와 같이 스택에 쌓인다
        // ㅣ 3 ㅣ
        // ㅣ 2 ㅣ
        // ㅣ 1 ㅣ
        //  ----
        s.push(1);
        s.push(2);
        s.push(3);

        // 스택 자료구조에서 요소를 읽어올땐
        // 가장 위에 쌓여있는(스택의 최상위) 요소를 읽어온다
        // 요소 읽기
        System.out.println(s.peek());   // 3

        // 요소 읽고 해당 요소 삭제
        System.out.println(s.pop());    // 3

        // 스택 비어있는지 여부
        System.out.println(s.empty());  // false

        // 특정 요소의 인덱스를 반환한다
        // 배열과 다르게 첫번째 인덱스는 1부터 시작한다
        // 스택에서 가장 위에 쌓여있는 요소의 인덱스는 1이다
        System.out.println(s.search(1));    // 2


    }
}
