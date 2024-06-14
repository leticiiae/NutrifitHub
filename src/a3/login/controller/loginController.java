package a3.login.controller;

import a3.NutriFitHUBTelaDeConta;
import a3.login.dao.loginDAO;
import java.io.IOException;
import java.sql.SQLException;

public class loginController {
    public void cadastroUsuario(NutriFitHUBTelaDeConta view) throws SQLException, IOException {
        loginDAO cadastro = new loginDAO();
        cadastro.cadastrarUsuario(view.getJTextFieldNome().getText(), view.getJTextFieldEmail().getText(), view.getJTextFieldSenha().getText());
    }
}
