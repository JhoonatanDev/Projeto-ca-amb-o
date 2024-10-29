/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Clientes;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;




public class ClasseCliente {
     
  Connection conexao = (Connection) Conexao.getConexao();
    
    public void cadastrarCliente (Clientes obj) throws SQLException {
        try{
       String insere = "INSERT INTO cliente ( TIPOPESSOA, NOME, DATANASC, RG, CPF, CNPJ, ENDERECO, BAIRRO, CIDADE, CEP, ESTADO, CELULAR) "
               + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
       
        PreparedStatement stmt = conexao.prepareStatement(insere);
            //stmt.setString(0, obj.getCod_cidade());
            stmt.setString(1, obj.getTipoPessoa());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getDataNasc());
            stmt.setString(4, obj.getRg());
            stmt.setString(5, obj.getCpf());
            stmt.setString(6, obj.getCnpj());
            stmt.setString(7, obj.getEndereco());
            stmt.setString(8, obj.getBairro());
            stmt.setString(9, obj.getCidade());
            stmt.setInt(10, obj.getCep());
            stmt.setString(11, obj.getEstado());
            stmt.setString(12, obj.getCelular());
           
            
            
            stmt.execute();
            stmt.close();
       
       JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
       conexao.close();
        }
        
        catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    
    } 
    public void alterarCliente (Clientes obj) throws SQLException{
            
            try{
       String Alterar = "Update cliente set TIPOPESSOA =?, NOME =?, DATANASC =?, RG =?, CPF =?, CNPJ =?, ENDERECO =?, BAIRRO =?, CIDADE =?, CEP =?, ESTADO =?, CELULAR =?where COD_CLIENTE = ?";
          
       
        PreparedStatement stmt = conexao.prepareStatement(Alterar);
            //stmt.setString(0, obj.getCod_cidade());
            stmt.setString(1, obj.getTipoPessoa());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getDataNasc());
            stmt.setString(4, obj.getRg());
            stmt.setString(5, obj.getCpf());
            stmt.setString(6, obj.getCnpj());
            stmt.setString(7, obj.getEndereco());
            stmt.setString(8, obj.getBairro());
            stmt.setString(9, obj.getCidade());
            stmt.setInt(10, obj.getCep());
            stmt.setString(11, obj.getEstado());
            stmt.setString(12, obj.getCelular());
            stmt.setInt(13, obj.getId());
            
            stmt.execute();
            stmt.close();
       
       JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso realizado com sucesso!");
       conexao.close();
        }
        
        catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao realizar alterações " + erro);
        }
    }
    public void excluirCliente (Clientes obj) {  
    
        try {
            String sql = "delete from cliente where COD_CLIENTE = ?";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            
            stmt.execute();
            stmt.close();
           
            JOptionPane.showMessageDialog(null, "Cliente Deletado!!");
            
        
        }
        catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro ao deletar " + erro);
        }
    }
    
    public List<Clientes> listarClientesBusca(){
      try {
           List<Clientes> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from cliente";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
          
          while (rs.next()) {
              Clientes obj = new Clientes();
              
              obj.setId(rs.getInt("COD_CLIENTE"));
              obj.setTipoPessoa(rs.getString("TIPOPESSOA"));
              obj.setNome(rs.getString("NOME"));
              obj.setRg(rs.getString("RG"));
              obj.setCpf(rs.getString("CPF"));
              obj.setCnpj(rs.getString("CNPJ"));
              obj.setDataNasc(rs.getString("DATANASC"));
              obj.setCelular(rs.getString("CELULAR"));
              obj.setCep(rs.getInt("CEP"));
              obj.setEndereco(rs.getString("ENDERECO"));
              obj.setBairro(rs.getString("BAIRRO"));
              obj.setCidade(rs.getString("CIDADE"));
              obj.setEstado(rs.getString("ESTADO"));
             
              
              lista.add(obj);
              
          }
          return lista;
          
          
         
      }
      catch (SQLException erro){
          JOptionPane.showMessageDialog(null, "Erro ao deletar " + erro);
      }
      return null;
    }
    
    public  List<Clientes> buscarPorCpf(String Cpf){
        try {
             List<Clientes> lista = new ArrayList<>();
            //1 passo - criar o sql , organizar e executar.
            String sql = "select * from cliente where CPF like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Cpf);

            ResultSet rs = stmt.executeQuery();
           

            while (rs.next()) {

              Clientes obj = new Clientes();
               
              obj.setId(rs.getInt("COD_CLIENTE"));
              obj.setTipoPessoa(rs.getString("TIPOPESSOA"));
              obj.setNome(rs.getString("NOME"));
              obj.setRg(rs.getString("RG"));
              obj.setCpf(rs.getString("CPF"));
              obj.setCnpj(rs.getString("CNPJ"));
              obj.setDataNasc(rs.getString("DATANASC"));
              obj.setCelular(rs.getString("CELULAR"));
              obj.setCep(rs.getInt("CEP"));
              obj.setEndereco(rs.getString("ENDERECO"));
              obj.setBairro(rs.getString("BAIRRO"));
              obj.setCidade(rs.getString("CIDADE"));
              obj.setEstado(rs.getString("ESTADO"));

              lista.add(obj);
            }

            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!" + erro);
            return null;
        }
    }
    public List<Clientes> buscarPorNome(String nome){
        try {
            //1 passo - criar o sql , organizar e executar.
            List<Clientes> lista = new ArrayList<>();
            String sql = "select * from cliente where NOME like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            

            while (rs.next()) {
                Clientes obj = new Clientes();
               
              obj.setId(rs.getInt("COD_CLIENTE"));
              obj.setTipoPessoa(rs.getString("TIPOPESSOA"));
              obj.setNome(rs.getString("NOME"));
              obj.setDataNasc(rs.getString("DATANASC"));
              obj.setRg(rs.getString("RG"));
              obj.setCpf(rs.getString("CPF"));
              obj.setCnpj(rs.getString("CNPJ"));
              obj.setEndereco(rs.getString("ENDERECO"));
              obj.setBairro(rs.getString("BAIRRO"));
              obj.setCidade(rs.getString("CIDADE"));
              obj.setCep(rs.getInt("CEP"));
              obj.setEstado(rs.getString("ESTADO"));
              obj.setCelular(rs.getString("CELULAR"));

              lista.add(obj);
            }

            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!" + erro);
            return null;
        }
    }
    
    public List<Clientes> buscarPorCodigo(int id){
        try {
            //1 passo - criar o sql , organizar e executar.
            List<Clientes> lista = new ArrayList<>();
            String sql = "select * from cliente where COD_CLIENTE = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            

            while (rs.next()) {
                Clientes obj = new Clientes();
               
              obj.setId(rs.getInt("COD_CLIENTE"));
              obj.setTipoPessoa(rs.getString("TIPOPESSOA"));
              obj.setNome(rs.getString("NOME"));
              obj.setDataNasc(rs.getString("DATANASC"));
              obj.setRg(rs.getString("RG"));
              obj.setCpf(rs.getString("CPF"));
              obj.setCnpj(rs.getString("CNPJ"));
              obj.setEndereco(rs.getString("ENDERECO"));
              obj.setBairro(rs.getString("BAIRRO"));
              obj.setCidade(rs.getString("CIDADE"));
              obj.setCep(rs.getInt("CEP"));
              obj.setEstado(rs.getString("ESTADO"));
              obj.setCelular(rs.getString("CELULAR"));

              lista.add(obj);
            }

            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!" + erro);
            return null;
        }
    }
}
