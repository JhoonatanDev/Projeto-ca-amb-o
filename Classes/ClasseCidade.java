/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Cidades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author 892101
 */
public class ClasseCidade {
    
    private Connection con;
    
    public ClasseCidade() {
        this.con = (Connection) new Conexao().getConexao();
    }
    
    
     public List<Cidades> listarCidadesPorUF(String estado) {

        try {            
            List<Cidades> lista = new ArrayList<>();             
            String sql = "select a.NOM_CIDADE from cidade a, estado b where a.COD_ESTADO = b.COD_ESTADO and b.SGL_ESTADO = ? ";        
            PreparedStatement c = con.prepareStatement(sql);
            c.setString(1, estado);
            ResultSet resultado = c.executeQuery();     

            while (resultado.next()) {
                Cidades obj = new Cidades();
                obj.setNome(resultado.getString("NOM_CIDADE"));
                lista.add(obj);
             

            }

          return lista;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Excpetion -> " + e);

          return null;
        }
      
    }
    
}
