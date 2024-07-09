package DesignPattern.SOLID.DIP.bad;

public class MysqlJdbcUrl {
    private String dbName;

    public String get(){
        return "jdbc:Mysql://... " + this.dbName;
    }
}
