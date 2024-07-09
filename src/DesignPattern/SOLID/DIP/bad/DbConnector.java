package DesignPattern.SOLID.DIP.bad;

// connectToMySQL 메서드가 MysqlJdbcUrl라는 구체적인 것에 의존하고있다
// 새로운 DB 연결 기능을 넣을때마다 메서드를 추가해야한다
public class DbConnector {
    void connectToMysql(MysqlJdbcUrl mysqlJdbcUrl){
        System.out.println(mysqlJdbcUrl.get() + " 연결합니다.");
    }
}
