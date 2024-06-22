public class J01StringBuffer {
    public static void main(String[] args) {
        // java.lang 패키지에 속하는 내부클래스
        // 문자열을 저장하고 다루기 편리한 메서드들을 제공함
        // String 객체가 불변성을 갖는 반면,
        // StringBuffer는 가변성을 갖는다

        // 생성자
        // 저장할 문자열의 길이를 고려해 적절한 크기로 생성해야함
        // 문자열을 매개변수로 받는 생성자의 경우 (해당 문자열 길이 + 16) 크기의 객체가 생성됨
        // 매개변수가 없는 생성자로 생성하면 16 크기의 객체가 생성됨
        StringBuffer sb1 = new StringBuffer(10);    // 10
        StringBuffer sb2 = new StringBuffer("hello");    // 5 + 16 = 21
        StringBuffer sb3 = new StringBuffer();               // 16



        // 메서드
        // equals()
        // StringBuffer는 equals() 메서드가 오버라이딩 돼있지 않다
        // 즉, Object 클래스의 equals()와 내용이 똑같으며 두 객체의 주소를 비교한다
        StringBuffer sb4 = new StringBuffer("hi");
        StringBuffer sb5 = new StringBuffer("hi");
        System.out.println(sb4.equals(sb5));
        // 두 StringBuffer 객체의 문자열 그 자체를 비교하려면
        String s4 = sb4.toString();
        String s5 = sb5.toString();
        System.out.println(s4.equals(s5));
        
        // append()
        // 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가
        StringBuffer sb6 = new StringBuffer();
        boolean b = true;
        sb6.append(b);
        System.out.println(sb6.toString());

        // delete()
        // 문자열에서 특정 부분을 삭제한다.
        StringBuffer sb7 = new StringBuffer("sample");
        sb7.delete(1, 4); // "amp"를 삭제한다
        System.out.println(sb7);

        // deleteCharAt()
        // 특정 위치의 문자를 삭제한다.
        StringBuffer sb8 = new StringBuffer("01234");
        sb8.deleteCharAt(2);        // "2"를 삭제한다
        System.out.println(sb8);          // "0134"

        // insert()
        // 두번째 매개변수로 전달받는 값을 문자열로 변환한 후
        // 첫번째 매개변수로 전달받은 위치에 추가함
        StringBuffer sb9 = new StringBuffer("VisualCode");
        sb9.insert(6, " Studio ");
        System.out.println(sb9);

        // reverse()
        // 문자열의 인덱스를 기준으로 역순으로 정렬함
        StringBuffer sb10 = new StringBuffer("1 2 3");
        sb10.reverse();
        System.out.println(sb10);
        

        // 메서드 체이닝
        // 여기 설명한 모든 메서드의 반환타입은 StringBuffer이다
        // 즉, 동작 후 본인의 참조를 반환한다
        // 그래서 메서드 체이닝이 가능하다
        StringBuffer sb11 = new StringBuffer();
        sb11
            .append(123)
            .append(456);
        System.out.println(sb11);
    }
}
