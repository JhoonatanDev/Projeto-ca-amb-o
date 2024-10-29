/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Rafael
 */
public class ClasseUsuario {
    
    private Connection con;
    
    public ClasseUsuario() {
        this.con =  (Connection) new Conexao().getConexao();
    }
    
    public void cadastroUsuario (Usuario obj){
       
       try{
           
           String cadastra = "insert into usuario (NOME, SENHA) values (?,?);";
           PreparedStatement stmt =  con.prepareStatement(cadastra);
           
           stmt.setString(1, obj.getNome());
           stmt.setString(1, obj.getSenha());
           
           stmt.execute();
           stmt.close();
           
       }catch(Exception erro){
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erro);
       }
       
   }
    
    public void alterarSenha(Usuario obj){
        try{
            
            String altera = "UPDATE usuario SET SENHA = ? WHERE ID_USUARIO = ?;";
            PreparedStatement stmt =  con.prepareStatement(altera);
            
            stmt.setString(1, obj.getSenha());
            stmt.setInt(1, obj.getId());
            
            stmt.execute();
            stmt.close();
            
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro : " + erro);
        }
    }
    
    public void excluirUsuario (Usuario obj){
        
        try{
            
            String excluir = "delete from usuario where ID_USUARIO = ?;";
            PreparedStatement stmt = con.prepareStatement(excluir);
            
            stmt.setInt(1, obj.getId());
            
            stmt.execute();
            stmt.close();
            
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro : " + erro);
        }
        
    }
    
}
