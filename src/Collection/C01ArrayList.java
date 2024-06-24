package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C01ArrayList {
    public static void main(String[] args) {
        // 선언
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 요소 저장
        list.add(3);
        list.add(2);
        list.add(1);

        // 요소 읽기
        System.out.println(list.get(0)); // 3

        // 요소 삭제
        list.remove(0);                  // 0번 인덱스에 있던 3 삭제
        System.out.println(list.get(0)); // 2
        
        // 요소 정렬
        Collections.sort(list);
        for(int i : list){
            System.out.println(i);
        }

        // 요소 변경
        list.set(0, 10);    // [{1}, {2}] -> [{10}, {2}]

        // Iterator 객체 생성
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // 10, 2
        }

        // 요소의 총 개수
        System.out.println(list.size());    // 2

        // 리스트가 특정 요소를 포함하고 있는지
        // contains(Object o)
        System.out.println(list.contains(10)); // true
        System.out.println(list.contains(3));  // false

        // 해당 리스트가 비어있는지 여부
        // isEmpty()
        System.out.println(list.isEmpty());     // false

        // 해당 리스트를 T[] 배열로 변환해서 반환
        Integer[] array = list.toArray(new Integer[0]);
        for(int i : array){
            System.out.println(i);  // 10 2
        }
    }
}
