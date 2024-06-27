package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class C07Queue {
    // Queue는 인터페이스이다
    // Queue를 상속받는 여러 인터페이스가 있다 그 중 Deque 인터페이스가 있고
    // 큐 자료구조가 필요할때 가장 많이 사용되는 건 Deque를 구현한 LinkedList 이다

    public static void main(String[] args) {
        // 선언
        LinkedList<Integer> dq = new LinkedList<>();
    
        // 추가 1
        dq.offer(1);
        dq.offer(10);
        dq.offer(100);

        // 추가 2
        dq.add(1000);
    
        // 큐 자료구조에서 요소를 읽어올땐 먼저 저장됐던 순서대로 읽어온다
        // 읽기 1
        // 큐가 비어있으면 null을 반환함
        dq.peek();
    
        // 읽기 2
        // 큐가 비어있으면 NoSuchElementException을 발생시킴
        dq.element();
    
        // 읽기 3
        // 읽어오고 삭제함
        // 큐가 비어있으면 null을 반환함
        dq.poll();

        // 요소 제거
        dq.remove();

        Iterator<Integer> iter = dq.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());    // 100 1000
        }
        
    }    
}
