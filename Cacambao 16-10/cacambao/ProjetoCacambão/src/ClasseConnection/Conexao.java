/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Conexao {
    
    public static Connection getConexao() {
        
    try {      
            final String Driver = "com.mysql.jdbc.Driver";
            final String URL = "jdbc:mysql://localhost:3306/cacambao?characterEncoding=UTF-8";
            final String Usuario ="root";
            final String Senha="";      
            return DriverManager.getConnection( URL, Usuario, Senha);
        } catch (SQLException ex) {
           //throw new RuntimeException(ex);
           JOptionPane.showMessageDialog(null, "Verifique a Conexão com o banco, \n pois houve uma falha ao Conectar!\n\n" + ex);
        }
        return null;
                   
    }
}
