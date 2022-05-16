
package controller;

import conexao.ConectaBD;
import dao.UsuarioDAO;
import java.sql.*;
import model.Usuario;
import static view.UsuarioV.imprime;

/**
 * iniciar
 * @author 3208893
 */

public class UsuarioC {
    public static void iniciar() throws SQLException{
        Connection connection = ConectaBD.createConnectionMySQL();
        if(connection != null){
            System.out.println("Conexao realizada com sucesso");
            connection.close();
        }
        
       UsuarioDAO usuarioDAO = new UsuarioDAO();
      //  Usuario usuario = new Usuario ("Mario", "mario@edu.com", "912345689", "88330000", "123456789",0);
      
//  jogoDAO.save(usuario);// comando(DAO)responsavel por salvar
     
        
      /* atualizar contato pelo ID/Codigo
        Usuario u1 = new Usuario();
        u1.setNome("Marcio");
        u1.setEmail("marcio@edu.com");
        u1.setTelefone("912345689");
        u1.setAdministrador(0);
        u1.setAtivo(1);
        u1.setCep("88330001");
        u1.setSenha("123456888");
        // id a ser atualizado
        u1.setCodigo(3);
        
      //jogoDAO.update(u1); comando responsavel por atualizar um dado usuario
      */
      /* deletar registro de um usuario do banco
        jogoDAO.deleteByCODIGO(4);
       */         
        
        imprime(usuarioDAO);
        for (Usuario u : usuarioDAO.getUsuarios()){
            System.out.println("Usuario: "+u.getNome());
        }
        
        
        
    }
}