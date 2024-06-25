package Collection;

import java.util.TreeSet;

public class C03TreeSet {
    public static void main(String[] args) {
        // 선언
        TreeSet<Integer> ts = new TreeSet<Integer>();
    
        // 요소 추가
        ts.add(5);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        ts.add(1);

        // 정렬된 상태로 저장된다
        for(int i : ts){
            System.out.println(i); // 1 2 3 4 5
        }
        
        // 요소 제거
        ts.remove(5);

        // 요소의 총 개수
        System.out.println(ts.size());

        // 부분 집합
        System.out.println(ts.subSet(1, 3));    // [1, 2]
        System.out.println(ts.subSet(1, false, 3, true));   // [2, 3]

        // 배열로 변환
        Object[] arr1 = ts.toArray();
        Integer[] arr2 = ts.toArray(new Integer[0]);
    }
}
