/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class ClasseLogin {
    
    private Connection con;
    
    public ClasseLogin() {
        this.con =  new Conexao().getConexao();
    }
   
   public boolean validaLogin(String usuario, String senha) throws SQLException{
       
       boolean valida = false;
       
       ResultSet RS;
       String Consulta = "SELECT * FROM usuario WHERE NOME ='"+usuario+"'AND SENHA = '"+senha+"'";
       Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
       RS = stmt.executeQuery(Consulta);
       JOptionPane.showMessageDialog(null, "Consulta Feita com Sucesso!");
       
       try{
           while(RS.next()){
               valida = true;
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return valida;
       
   }
    
}
