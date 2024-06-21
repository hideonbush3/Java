package Arrays;

import java.util.Arrays;
import java.util.List;

public class Method {
    public static void main(String[] args) {

        // binarySearch()
        // 전달받은 배열에서 특정 값의 위치를 이진 탐색 알고리즘으로 찾아서
        // 인덱스값을 반환
        int[] arr1 = new int[100];
        
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i;
        }

        System.out.println(Arrays.binarySearch(arr1, 50));

        // 정렬되지 않은 배열에서 사용하면 엉뚱한 값을 얻게된다
        int[] arr2 = {10, 2, 9, 8, 1, 6, 3, 5, 4, 7};
        System.out.println(Arrays.binarySearch(arr2, 9));   



        // copyOf()
        // 배열에서 특정길이만큼 복사해서 새로운 배열을 반환
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = Arrays.copyOf(arr3, 3); // {1, 2, 3}
        
        // 기반 배열의 길이를 초과해서 복사하면
        // 배열 요소의 타입에 맞게 기본값들로 채워진다
        int[] arr5 = Arrays.copyOf(arr3, 10);
        for(int i : arr5){
            System.out.print(i + " ");
        }
        System.out.println();


        // copyOfRange()
        // 배열의 특정 범위만 복사해서 새로운 배열을 반환
        int[] arr6 = Arrays.copyOfRange(new int[]{0, 1, 2, 3, 4}, 1, 4);
        for(int i : arr6){
            System.out.print(i + " ");
        }
        System.out.println();


        // fill()
        // 전달받은 배열의 요소를 모두 특정값으로 바꿈
        int[] arr7 = {0, 1, 2, 3, 4};
        Arrays.fill(arr7, 0);

        

        // sort()
        // 배열의 모든요소를 오름차순으로 정렬
        int[] arr8 = {4, 3, 2, 1, 0};
        Arrays.sort(arr8);


        

        // asList()
        // 배열을 List로 변환해서 반환
        Integer[] arr9 = {0, 1, 2};
        List<Integer> list = Arrays.asList(arr9);
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
    
}
