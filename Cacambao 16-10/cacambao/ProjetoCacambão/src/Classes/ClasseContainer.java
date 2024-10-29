/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Cacamba;
import Classes.model.Containers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 888872
 */
public class ClasseContainer {
    
    private Connection con;
    
    public ClasseContainer() {
        this.con =  (Connection) new Conexao().getConexao();
    }
    
    
        
        //Metodo Cadastrar Produtos
        /*public void cadastrarContainer(Containers objcon) {
            try {

                String insere = "insert into container (TAMANHO, PRECO_UNITARIO, descricao, DISPONIBILIDADE,OBS) values (?,?,?,?,?)";
                //2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(insere);
                stmt.setString(1 ,objcon.getTamanho());
                stmt.setDouble(2 ,objcon.getPreco_unitario());
                stmt.setString(3 ,objcon.getDescricao());
                stmt.setString(4 ,objcon.getDisponibilidade());
                stmt.setString(5, objcon.getObs());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erro);

            }

        }*/
    
     public void cadastrarContainer(Containers objcac) {
            try {

                String insere = "insert into container (TAMANHO, PRECO_UNITARIO, descricao, DISPONIBILIDADE,OBS) values (?,?,?,?,?)";
                //2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(insere);
                stmt.setString(1 ,objcac.getTamanho());
                stmt.setDouble(2 ,objcac.getPreco_unitario());
                stmt.setString(3 ,objcac.getDescricao());
                stmt.setString(4 ,objcac.getDisponibilidade());
                stmt.setString(5, objcac.getObs());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");

            } catch (Exception erro) {

                JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erro);

            }

        }
        
        
        //Método para atualizar o cadastro
        public void alterarContainer(Containers objcon) {
            
            try{
                
                String altera = "update container set TAMANHO=?, PRECO_UNITARIO=?, DESCRICAO=?, DISPONIBILIDADE=?, OBS=?  where ID_CONTAINER=?";
                PreparedStatement stmt = con.prepareStatement(altera);
                stmt.setString(1 ,objcon.getTamanho());
                stmt.setDouble(2 ,objcon.getPreco_unitario());
                stmt.setString(3 ,objcon.getDescricao());
                stmt.setString(4 ,objcon.getDisponibilidade());
                stmt.setString(5, objcon.getObs());
                stmt.setInt(6, objcon.getId());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Cadastro atualizado com Sucesso!");
                
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao alterar: " + erro);
            }
            
        }
        
        //Método para excluir Container
        public void excluiContainer(Containers objcon){
            
            try{
                
                String exclui = "delete from Container  where ID_CONTAINER=?";
                PreparedStatement stmt = con.prepareStatement(exclui);
                stmt.setInt(1, objcon.getId());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso");
                
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " + erro);
            }
        }
        
        
        //Método para listar os produtos
        public List<Containers> listarContainer(){
            try {
                List<Containers> lista = new ArrayList<>();

                String listar = "select * from container";

                PreparedStatement stmt = con.prepareStatement(listar);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Containers objcon = new Containers();
                    objcon.setId(rs.getInt("ID_CONTAINER"));
                    objcon.setTamanho(rs.getString("TAMANHO"));
                    objcon.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                    objcon.setDescricao(rs.getString("DESCRICAO"));
                    objcon.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                    objcon.setObs(rs.getString("OBS"));

                    lista.add(objcon);

                }

                return lista;     
                
            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, "Erro ao listar:" + erro);
                return null;
            }   
            
        }
        
        public void ContainerIndisponivel(Containers objcon){
            
            String indisponivel = "I";
            
              try{
                  String altera = "update container set DISPONIBILIDADE=?  where ID_CONTAINER=?";
                  PreparedStatement stmt = con.prepareStatement(altera);
                  stmt.setString(1, indisponivel);
                  stmt.setInt(1, objcon.getId());
                  
                  stmt.execute();
                  stmt.close();
                  
                  JOptionPane.showMessageDialog(null, "O Container: "+objcon.getId()+" "+objcon.getDescricao()+" agora está indisponível");
                  
              }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro : " + erro);
              }
            
        }
        
        public void ContainerDisponivel(Containers objcon){
            
            String disponivel = "D";
            
              try{
                  String altera = "update Container set DISPONIBILIDADE=?  where ID_CONTAINER=?";
                  PreparedStatement stmt = con.prepareStatement(altera);
                  stmt.setString(1, disponivel);
                  stmt.setInt(1, objcon.getId());
                  
                  stmt.execute();
                  stmt.close();
                  
                  JOptionPane.showMessageDialog(null, "O Container: "+objcon.getId()+" "+objcon.getDescricao()+" agora está disponível");
                  
              }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro : " + erro);
              }
            
        }
        
        public Containers buscaPorCodigo(int id){
            
            try{
                String sql = "select * from Container where ID_CONTAINER =  ?";

                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                
                ResultSet rs = stmt.executeQuery();
                Containers obj = new Containers();
                
                if (rs.next()) {

                    obj.setId(rs.getInt("ID_CONTAINER"));
                    obj.setTamanho(rs.getString("TAMANHO"));
                    obj.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                    obj.setDescricao(rs.getString("DESCRICAO"));
                    obj.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                    obj.setObs(rs.getString("OBS"));

            }

            return obj;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                return null;
            }
            
        }
        
        public List<Containers> buscaPorDescricao(String descricao){
    try {
        List<Containers> lista = new ArrayList<>();
        String sql = "select * from container where descricao like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Containers obj = new Containers();
            obj.setId(rs.getInt("ID_CONTAINER"));
            obj.setTamanho(rs.getString("TAMANHO"));
            obj.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
            obj.setDescricao(rs.getString("DESCRICAO"));
            obj.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
            obj.setObs(rs.getString("OBS"));
            
            lista.add(obj); // Adicione o objeto à lista dentro do loop
        }

        return lista;
    } catch (Exception e) {
        e.printStackTrace(); // Registre a exceção para depuração
        JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        return null;
    }
}
        
        public List<Containers> buscaPorTamanho(String tamanho){
            
            try{
                List<Containers> lista = new ArrayList<>();
                String sql = "select * from Container where TAMANHO like ?";       
                
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, tamanho);
                
                ResultSet rs = stmt.executeQuery();
                
                
                while (rs.next()) {
                    Containers obj = new Containers();
                    obj.setId(rs.getInt("ID_CONTAINER"));
                    obj.setTamanho(rs.getString("TAMANHO"));
                    obj.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                    obj.setDescricao(rs.getString("DESCRICAO"));
                    obj.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                    obj.setObs(rs.getString("OBS"));

                    lista.add(obj);
            }

            return lista;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                return null;
            }
            
        }
        
        public List<Containers> buscaPorDisponibilidade(String disponibilidade){
            
            try{
                List<Containers> lista = new ArrayList<>();
                String sql = "select * from container where DISPONIBILIDADE like ?";       
                
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, disponibilidade);
                
                ResultSet rs = stmt.executeQuery();
                
                
                while (rs.next()) {
                    Containers obj = new Containers();
                    obj.setId(rs.getInt("ID_CONTAINER"));
                    obj.setTamanho(rs.getString("TAMANHO"));
                    obj.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                    obj.setDescricao(rs.getString("DESCRICAO"));
                    obj.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                    obj.setObs(rs.getString("OBS"));

                    lista.add(obj);
            }

           return lista;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                return null;
            }
            
        }
        
    }
    

