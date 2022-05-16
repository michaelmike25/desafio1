
package model;

/**
 *
 * @author Mohalk
 */
public class Usuario { // atributos

    private int codigo; // funcionando como id
    private String nome;
    private String email;
    private String telefone;
    private int ativo = 1;
    private String cep;
    private String senha;
    private int administrador;

    public Usuario(){}
    
    public Usuario(String nome, String email, String telefone, String cep, String senha, int administrador) {
        
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
        this.administrador = administrador;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }
    
}


        