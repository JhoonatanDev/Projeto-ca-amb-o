/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Cacamba;
import Classes.model.Containers;
import Classes.model.ItemVenda;
import Classes.model.VendaS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ClasseItemVenda {
    private Connection con;
    
    public ClasseItemVenda() {
        this.con =  (Connection) new Conexao().getConexao();
    }
    
    //Metodo que cadastra Itens
    public void cadastraItem(ItemVenda obj){
        
           try {

            String sql = "insert into itens (ID_ITENS ,ID_LOCACAO, ID_CACAMBA, ID_CONTAINER) values (?,?,?,?)";
          
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());
            stmt.setInt(2, obj.getVenda().getId());
            stmt.setInt(3, obj.getCacamba().getId());
            stmt.setInt(4, obj.getContainer().getId());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro no cadastro do item: "+obj.getId()+ erro);

        }
        
        
    }
    
    public List<ItemVenda> listaItemCacambaPorVenda(int venda_id) {
        
        List<ItemVenda> lista = new ArrayList<>();
        try {
            String query = "select a.ID_CACAMBA, a.descricao, a.preco_unitario, c.total from cacamba a \n" +
            "inner join itens b on (a.ID_CACAMBA = b.ID_CACAMBA)\n" +
            "inner join locacao c on(b.ID_LOCACAO = c.ID_LOCACAO)\n" +
            "where c.ID_LOCACAO = ?;";
       
            PreparedStatement stmt = con.prepareStatement(query);         
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                ItemVenda item = new ItemVenda();
                VendaS venda = new VendaS();
                Cacamba prod = new Cacamba();
                
                 prod.setId(rs.getInt("a.ID_CACAMBA"));
                 prod.setDescricao(rs.getString("a.descricao"));
                 prod.setPreco_unitario(rs.getDouble("a.preco_unitario"));
                 venda.setTotal_venda(rs.getDouble("c.total"));
                
                 item.setCacamba(prod);         
              
                
                lista.add(item);
            }
            return lista;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public List<ItemVenda> listaItemContainerPorVenda(int venda_id) {
        
        List<ItemVenda> lista = new ArrayList<>();
        try {
            String query = "select a.ID_CONTAINER, a.descricao, a.preco_unitario, c.total from container a \n" +
            "inner join itens b on (a.ID_CONTAINER = b.ID_CONTAINER)\n" +
            "inner join locacao c on(b.ID_LOCACAO = c.ID_LOCACAO)\n" +
            "where c.ID_LOCACAO = ?;";
       
            PreparedStatement stmt = con.prepareStatement(query);         
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                ItemVenda item = new ItemVenda();
                VendaS venda = new VendaS();
                Containers prod = new Containers();
                
                 prod.setId(rs.getInt("a.ID_CONTAINER"));
                 prod.setDescricao(rs.getString("a.descricao"));
                 prod.setPreco_unitario(rs.getDouble("a.preco_unitario"));
                 venda.setTotal_venda(rs.getDouble("c.total"));
                
                 item.setContainer(prod);
              
                
                lista.add(item);
            }
            return lista;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
}
