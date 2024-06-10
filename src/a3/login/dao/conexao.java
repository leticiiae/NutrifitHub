
package a3.login.dao;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexao {
    public Connection getConnection()throws SQLException {
     Connection conexao = (Connection) DriverManager.getConnection("jdbc:postgreesql://sql10.freemysqlhosting.net:3306/NutriFit", "sql10713108", "HYtUTaKv6F");
     return conexao;
    }
    
}
