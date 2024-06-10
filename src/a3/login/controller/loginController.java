package a3.login.controller;

import a3.NutriFitHUBTelaDeConta;
import a3.login.dao.conexao;
import a3.login.dao.loginDAO;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;

public class loginController {
    
    public void cadastroUsuario(NutriFitHUBTelaDeConta view) throws SQLException{
        
        Connection conexao = new conexao().getConnection(); 
        loginDAO cadastro = new loginDAO();
        cadastro.cadastrarUsuario(view.getName().getText() ,view.getEmail().getText(),view.getSenha().getText()  );
        
    }
    
}
