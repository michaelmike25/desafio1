package view;

import dao.UsuarioDAO;
/**
 *
 * @author Mohalk
 */
public class UsuarioV {
    public static void imprime(UsuarioDAO usuarioDAO){
       
        for(model.Usuario u : usuarioDAO.getUsuarios()){
            System.out.println("Usuario: "+ u.getCodigo());
        }
    }
}


