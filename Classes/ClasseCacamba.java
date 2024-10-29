/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Cacamba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author 888872
 */
public class ClasseCacamba {
    
    private Connection con;
    
    public ClasseCacamba() {
        this.con =  (Connection) new Conexao().getConexao();
    }
    
    
        
        //Metodo Cadastrar Produtos
        public void cadastrarCacamba(Cacamba objcac) {
            try {

                String insere = "insert into cacamba (TAMANHO, PRECO_UNITARIO, descricao, DISPONIBILIDADE,OBS) values (?,?,?,?,?)";
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
        public void alterarCacamba(Cacamba objcac) {
            
            try{
                
                String altera = "update cacamba set TAMANHO=?, PRECO_UNITARIO=?, DESCRICAO=?, DISPONIBILIDADE=?, OBS=? where ID_CACAMBA=?";
                PreparedStatement stmt = con.prepareStatement(altera);
                stmt.setString(1 ,objcac.getTamanho());
                stmt.setDouble(2 ,objcac.getPreco_unitario());
                stmt.setString(3 ,objcac.getDescricao());
                stmt.setString(4 ,objcac.getDisponibilidade());
                stmt.setString(5, objcac.getObs());
                stmt.setInt(6, objcac.getId());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Cadastro atualizado com Sucesso!");
                
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao alterar: " + erro);
            }
            
        }
        
        //Método para excluir cacamba
        public void excluiCacamba(Cacamba objcac){
            
            try{
                
                String exclui = "delete from cacamba  where ID_CACAMBA=?";
                PreparedStatement stmt = con.prepareStatement(exclui);
                stmt.setInt(1, objcac.getId());
                
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso");
                
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " + erro);
            }
        }
        
        
        //Método para listar os produtos
        public List<Cacamba> listarCacamba(){
            try {
                List<Cacamba> lista = new ArrayList<>();

                String listar = "select * from cacamba";

                PreparedStatement stmt = con.prepareStatement(listar);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Cacamba objcac = new Cacamba();
                    objcac.setId(rs.getInt("ID_CACAMBA"));
                    objcac.setTamanho(rs.getString("TAMANHO"));
                    objcac.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                    objcac.setDescricao(rs.getString("DESCRICAO"));
                    objcac.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                    objcac.setObs(rs.getString("OBS"));
                    
                    lista.add(objcac);

                }

                return lista;     
                
            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, "Erro ao listar:" + erro);
                return null;
            }   
            
        }
        
        public void cacambaIndisponivel(Cacamba objcac){
            
            String indisponivel = "I";
            
              try{
                  String altera = "update cacamba set DISPONIBILIDADE=?  where ID_CACAMBA=?";
                  PreparedStatement stmt = con.prepareStatement(altera);
                  stmt.setString(1, indisponivel);
                  stmt.setInt(1, objcac.getId());
                  
                  stmt.execute();
                  stmt.close();
                  
                  JOptionPane.showMessageDialog(null, "A cacamba: "+objcac.getId()+" "+objcac.getDescricao()+" agora está indisponível");
                  
              }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro : " + erro);
              }
            
        }
        
        public void cacambaDisponivel(Cacamba objcac){
            
            String disponivel = "D";
            
              try{
                  String altera = "update cacamba set DISPONIBILIDADE=?  where ID_CACAMBA=?";
                  PreparedStatement stmt = con.prepareStatement(altera);
                  stmt.setString(1, disponivel);
                  stmt.setInt(1, objcac.getId());
                  
                  stmt.execute();
                  stmt.close();
                  
                  JOptionPane.showMessageDialog(null, "A cacamba: "+objcac.getId()+" "+objcac.getDescricao()+" agora está disponível");
                  
              }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro : " + erro);
              }
            
        }
     
    public Cacamba buscaPorCodigo(int id) {
        try {
            String sql = "SELECT * FROM cacamba WHERE ID_CACAMBA = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Cacamba obj = new Cacamba();

            if (rs.next()) {
                obj.setId(rs.getInt("ID_CACAMBA"));
                obj.setTamanho(rs.getString("TAMANHO"));
                obj.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                obj.setDescricao(rs.getString("DESCRICAO"));
                obj.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                obj.setObs(rs.getString("OBS"));
            } else {
                // Se não houver resultados, defina o objeto como nulo ou algum valor padrão
                obj = null;
            }

            return obj;
        } catch (Exception e) {
            // Registre a exceção em um log ou console para depuração
            e.printStackTrace();
            // Você pode lançar a exceção novamente ou retornar null ou um objeto vazio aqui
            return null;
        }
    }

    public List<Cacamba> buscaPorDescricao(String descricao){
    try {
        List<Cacamba> lista = new ArrayList<>();
        String sql = "select * from cacamba where descricao like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Cacamba obj = new Cacamba();
            obj.setId(rs.getInt("ID_CACAMBA"));
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

       
        public List<Cacamba> buscaPorTamanho(String tamanho){
            
            try{
                List<Cacamba> lista = new ArrayList<>();
                String sql = "select * from cacamba where TAMANHO like ?";       
                
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, tamanho);
                
                ResultSet rs = stmt.executeQuery();
                
                
                while (rs.next()) {
                    Cacamba obj = new Cacamba();
                    obj.setId(rs.getInt("ID_CACAMBA"));
                    obj.setTamanho(rs.getString("TAMANHO"));
                    obj.setPreco_unitario(rs.getDouble("PRECO_UNITARIO"));
                    obj.setDescricao(rs.getString("DESCRICAO"));
                    obj.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                    obj.setObs(rs.getString("OBS"));

                    lista.add(obj); // Adicione o objeto à lista dentro do loop
            }

            return lista;
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                return null;
            }
            
        }
        
        public List<Cacamba> buscaPorDisponibilidade(String disponibilidade){
            
            try{
                List<Cacamba> lista = new ArrayList<>();
                String sql = "select * from cacamba where DISPONIBILIDADE like  ?";       
                
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, disponibilidade);
                
                ResultSet rs = stmt.executeQuery();
                
                
                while (rs.next()) {
                    Cacamba obj = new Cacamba();
                    obj.setId(rs.getInt("ID_CACAMBA"));
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
    

