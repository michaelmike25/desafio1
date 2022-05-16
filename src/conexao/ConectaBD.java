package conexao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohalk
 */
public class ConectaBD {
    static final String URL = "jdbc:mysql://localhost:3306/entrertenimento"; // link para acessar o banco de dados
    static final String USER = "root"; // usuario
    static final String PASS = ""; //senha
    
    public static Connection createConnectionMySQL(){
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return connection;
    }
}