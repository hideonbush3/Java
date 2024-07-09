package DesignPattern.SOLID.DIP.good;

public class MysqlJdbcUrl implements JdbcUrl {
    private String dbName;

    @Override
    public String get() {
        return "jdbc:mysql://... " + this.dbName;
    }
    
    
}
