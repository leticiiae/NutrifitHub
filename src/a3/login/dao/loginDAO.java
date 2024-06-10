package a3.login.dao;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class loginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException, IOException{
        Connection conexao = new conexao().getConnection(); 
        String sql = "INSET INTO login (nome, email, senha) VALUES ('"+nome+"','"+email+"','"+senha+"')"; 
       PreparedStatement statment = conexao.prepareStatement(sql);   
       statment.execute();
       conexao.close();
                
    }
}
