package a3.login.dao;

import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class loginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException, IOException{
      try  (Connection conexao = (Connection) new conexao().getConnection()){ 
        String sql = "INSET INTO login (nome, email, senha) VALUES (?, ?, ?)";
        try(PreparedStatement statement = conexao.prepareStatement(sql)){
                 statement.setString(1, nome);
                 statement.setString(2, email);
                 statement.setString(3, senha);
                 statement.execute();
            }
        }         
    }
}
