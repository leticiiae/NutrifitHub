
package a3.login;

public class login {
String nome, email, senha;
    public login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public void cadastrar(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    
}
