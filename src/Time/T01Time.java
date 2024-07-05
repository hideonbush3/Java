package Time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

// 자바에서 시간을 다루려면?

// jdk 1.0부터 사용된 Date는 날짜를 다룬다
// 현재는 모든 메서드가 deprecated

// jdk 1.1부터 사용된 Calendar는 날짜와 시간을 같이 다룬다
// 하지만 단점이 있었으니..
// 1. 캘린더 객체는 불변 객체가 아니라서 수정될 수 있음
// 2. 윤초와 같은 특별한 상황을 고려하지 않고 설계됨
// 3. 월(Month)를 나타낼때 1월~12월을 0~11로 표현해야해서 혼동 야기

// 이를 보완하기 위해
// jdk 1.8부터 java.time 패키지가 제공됐다
// 이 패키지에 속하는 클래스의 메서드들은 항상 새로운 객체를 반환한다 -> 불변 객체

// 기존 캘린더 클래스는 날짜와 시간을 한번에 나타냈다
// java.time 패키지에는 날짜와 시간을 다루기 위한 각각 다른 클래스가 있다
// LocalDate(날짜), LocalTime(시간), LocalDateTime(캘린더처럼 날짜와 시간 같이)

// java.time에는 LocalDate와 LocalTime을 확장한 클래스들이
// 많기 때문에 이 둘을 정확히 이해하는게 중요하다
public class T01Time {
    public static void main(String[] args) {
        // LocalDate, LocalTime 객체 생성
        LocalDate presentDate = LocalDate.now();
        LocalTime presentTime = LocalTime.now();
        // YYYY-MM-DD HH:mm:ss.ns
        System.out.println(presentDate + " " + presentTime);
    
        LocalDate birthDate = LocalDate.of(1960, 01, 01);
        LocalTime birthTime = LocalTime.of(8, 30, 30, 100000000);
        // 1960-01-01 08:30:30.100
        System.out.println(birthDate + " " + birthTime);


        // 객체에 접근(getter)
        // 1. LocalDate
        System.out.println(presentDate.getYear());  // 연도
        System.out.println(presentDate.getMonth()); // 월
        System.out.println(presentDate.getMonthValue()); // 월
        System.out.println(presentDate.getDayOfWeek()); // 요일
        System.out.println(presentDate.get(ChronoField.DAY_OF_YEAR));   // 해당연도의 몇번째날인지

        // 2. LocalTime
        System.out.println(presentTime.getHour());  // 시
        System.out.println(presentTime.getMinute());// 분
        System.out.println(presentTime.getSecond());// 초


        System.out.println();
        
        // 3. TemporalField 인터페이스
        // 날짜와 시간과 관련된 필드를 정의해 놓은 인터페이스
        // 이 인터페이스를 구현하여 날짜와 시간을 나타낼 때 사용하는 열거체가 ChronoField
        System.out.println(presentDate.get(ChronoField.YEAR));          // 연도
        System.out.println(presentDate.get(ChronoField.MONTH_OF_YEAR)); // 월
        System.out.println(presentDate.get(ChronoField.DAY_OF_MONTH));  // 일
        System.out.println(presentDate.get(ChronoField.DAY_OF_WEEK));   // 요일(월요일부터 1~7)
        System.out.println(presentDate.get(ChronoField.DAY_OF_YEAR));   // 해당연도의 몇번째날인지

        System.out.println();

        System.out.println(presentTime.get(ChronoField.AMPM_OF_DAY));   // (오전이면0 오후면1)
        System.out.println(presentTime.get(ChronoField.HOUR_OF_DAY));   // 시(0~23)
        System.out.println(presentTime.get(ChronoField.HOUR_OF_AMPM));  // 시(0~11)
        System.out.println(presentTime.get(ChronoField.MINUTE_OF_HOUR));    // 분
        System.out.println(presentTime.get(ChronoField.SECOND_OF_MINUTE));  // 초
        

        // 객체 필드값 변경
        // LocalXxxx with(TemporalField t, new Value)
        // 필드 변경 메서드의 타입은 모두 본인타입 -> 새로운 객체 생성 후 반환
        
        // 1. LocalDate
        LocalDate changedBirthDate = birthDate.with(ChronoField.YEAR, 1950);
        birthDate.withYear(1940);
        birthDate.withMonth(12);
        birthDate.withDayOfMonth(12).withDayOfMonth(1);

        // 2. LocalTime
        LocalTime changedBirthTime = birthTime.with(ChronoField.HOUR_OF_DAY, 23);
        birthTime.withHour(22);
        birthTime.withMinute(50);
        birthTime.withSecond(59);

        System.out.println();

        // 객체 비교
        LocalDate now = LocalDate.now();
        LocalDate other = LocalDate.of(2002, 7, 21);
        // LocalDate, LocalTime 둘다 compareTo() 가 오버라이딩 돼있음
        System.out.println(now.compareTo(other));
        
        // isEqual() - 날짜만비교, LocalDate에서만 사용가능
        System.out.println(now.isEqual(other));  // false
        
        // isBefore() - 현재 객체가 인자로 전달된 객체보다 과거냐
        System.out.println(now.isBefore(other)); // false

        // isAfter() - 현재 객체가 인자로 전달된 객체보다 미래냐
        System.out.println(now.isAfter(other));  // true
    }
}
