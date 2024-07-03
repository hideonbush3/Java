package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S04Intermediate {
    public static void main(String[] args) {
        // 스트림의 중간연산

        // 1. 필터링
        // 최종연산을 수행하고나면 해당 스트림은
        // 더이상 사용할 수 없기 때문에
        // 스트림을 두개 생성한다
        IntStream stream1 = IntStream.of(9, 4, 77, 3, 8, 8, 9, 1, 5, 3, 1);
        IntStream stream2 = IntStream.of(9, 4, 77, 3, 8, 8, 9, 1, 5, 3, 1);

        // 중복 요소 삭제
        stream1.distinct().forEach(num -> System.out.printf("%d ", num));
        
        System.out.println();

        // 짝수만 필터링 
        stream2.filter(num -> num % 2 == 0).forEach(num -> System.out.printf("%d ", num));

        System.out.println();

        // 2. 스트림 변환
        // map() 
        Stream<String> stream3 = Stream.of("java", "javascript", "spring", "springboot");
        stream3.map(word -> word.length()).forEach(num -> System.out.printf("%d ", num));

        System.out.println();

        // flatMap() - 인자로 전달된 함수의 반환값으로 여러개의 스트림을 만들고
        // 그것을 하나의 스트림으로 합친다
        String[] arr = {"오늘은 비가 내린다", "내일은 맑다", "모레는 모른다"};
        Stream<String> stream4 = Arrays.stream(arr);
        stream4.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);


        System.out.println();


        // 3. 스트림 제한
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        IntStream stream7 = IntStream.range(0, 10);

        stream5.limit(5).forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        stream6.skip(5).forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        stream7.skip(3).limit(3).forEach(n -> System.out.printf("%d ", n));
        System.out.println();


        // 4. 스트림 정렬
        // sorted(Comparator c), sorted()
        // 비교자를 전달하지 않으면 사전순으로 정렬됨

        // 객체 가격기준 내림차순 비교자
        Comparator<Book> comp = new Comparator<Book>() {
            public int compare(Book b1, Book b2){
                return b1.price > b2.price ? -1 : b1.price == b2.price ? 0 : 1;
            }
        };
        Stream<Book> stream8 = Stream.of(
            new Book(10000), new Book(8000),
            new Book(12000), new Book(19000));
        stream8.sorted(comp).forEach(book -> System.out.printf("%d ", book.price));

        System.out.println();

        // 기본정렬, Comparator.reverseOrder()
        Stream<String> stream9 = Stream.of("대한민국", "가나", "미국", "스리랑카");
        Stream<String> stream10 = Stream.of("대한민국", "가나", "미국", "스리랑카");
        stream9.sorted().forEach(nation -> System.out.printf("%s ", nation));
        System.out.println();
        stream10.sorted(Comparator.reverseOrder()).forEach(nation -> System.out.printf("%s ", nation));
        System.out.println();

        
        // 5. 연산 결과 확인
        // peek() - 연산 도중 스트림 요소 확인
        IntStream stream11 = IntStream.range(1, 8);
        stream11
            .peek(n -> System.out.println("원본 스트림 -> " + n))
            .skip(3)
            .peek(n -> System.out.println("skip(3) 후 -> " + n))
            .boxed()    // IntStream -> Stream<Integer>
            .sorted(Comparator.reverseOrder())
            .forEach(n -> System.out.printf("%d ", n));

        
    }
}

class Book{
    int price;
    Book(){}
    Book(int price){
        this.price = price;
    }
}
