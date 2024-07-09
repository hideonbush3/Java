package DesignPattern.SOLID.DIP.good;

// jdbc의 url명을 받아오는 get() 메서드를 JdbcUrl 인터페이스로 옮기고
// jdbc들이 해당 인터페이스를 구현하도록 해서
// db 연결 메서드인 connect는 추상적인 것에 의존하게 됐다

// 즉, 의존관계 역전 원칙을 따르게 됐다
public class DbConnector {
    public void connect(JdbcUrl jdbcUrl){
        System.out.println(jdbcUrl + " 연결..");
    }
}
