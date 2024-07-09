package DesignPattern.SOLID.DIP.good;

public class OracleJdbcUrl implements JdbcUrl{
    private String dbName;

    @Override
    public String get() {
        return "jdbc:oracle://... " + this.dbName;
    }
    
}
