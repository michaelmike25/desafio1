package dao; // metodos 

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public void save(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException { //ojeto usuario
        String QUERY = "INSERT INTO usuario (nome, email, telefone, ativo, cep, senha, administrador)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //  System.out.println(QUERY);

        try { // tenta conectar ao banco
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
            
            /* MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(usuario.getSenha().getBytes("ASCII")); //mudar para "UTF-8" se for preciso
            byte[] passwordDigest = digest.digest();
            String s = new String(passwordDigest, StandardCharsets.UTF_8);
            System.out.println(s);
            System.out.println(passwordDigest);*/

            // valores esperados pela query
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getTelefone());
            preparedStatement.setInt(4, usuario.getAtivo());
            preparedStatement.setString(5, usuario.getCep());
            preparedStatement.setString(6, usuario.getSenha());
            preparedStatement.setInt(7, usuario.getAdministrador());

            // System.out.println(QUERY);
            //executa       
            preparedStatement.execute();
            System.out.println("Dados salvo com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Usuario> getUsuarios() { //read ou listar
        List<Usuario> usuarios = new ArrayList<Usuario>();
        String QUERY = "SELECT * FROM usuario WHERE ativo != 0";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);

            resultSet = preparedStatement.executeQuery(QUERY);

            while (resultSet.next()) { // enquanto ouver dado
                Usuario usuario = new Usuario();

                usuario.setCodigo(resultSet.getInt("codigo"));
                usuario.setAtivo(resultSet.getInt("ativo"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setTelefone(resultSet.getString("telefone"));
                usuario.setCep(resultSet.getString("cep"));
                usuario.setAdministrador(resultSet.getInt("administrador"));

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return usuarios;
    }

    public void update(Usuario usuario) {
        String QUERY = "UPDATE usuario SET nome = ?, email = ?, telefone = ?, ativo = ?, cep = ?,"
                + " administrador = ? WHERE codigo = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // System.out.println(QUERY);
        try { //criar conexão com o banco
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
            // valores esperados pela query
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getTelefone());
            preparedStatement.setInt(4, usuario.getAtivo());
            preparedStatement.setString(5, usuario.getCep());
          //  preparedStatement.setString(6, usuario.getSenha());
            preparedStatement.setInt(6, usuario.getAdministrador());
            //Codigo do registro a ser atualizado
            preparedStatement.setInt(7, usuario.getCodigo());
            //executa a query
            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//passando o objeto usuario

    public void deleteByCODIGO(int codigo) {
        String QUERY = "DELETE FROM usuario WHERE codigo = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);

            //code
            preparedStatement.setInt(1, codigo);

            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean autenticacaoUsuario(String nome , String senha /*int administrador*/)throws SQLException { // trazendo os objetos 
        boolean ret = false;
        String QUERY = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);

            preparedStatement.setString(1,nome);
            preparedStatement.setString(2,senha);
           // preparedStatement.setInt(3,administrador);
            
            ResultSet rs = preparedStatement.executeQuery(); //resultset = sempre que houver resultado no banco
                 
            if(rs.next()){
    
            ret = true;
            }
                rs.close();
                preparedStatement.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "UsuarioDAO");
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }
}
