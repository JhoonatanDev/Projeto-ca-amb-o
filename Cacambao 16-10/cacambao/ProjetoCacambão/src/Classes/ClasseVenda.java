/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import ClasseConnection.Conexao;
import Classes.model.Clientes;
import Classes.model.Containers;
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
public class ClasseVenda {
    private Connection con;
    
    public ClasseVenda() {
        this.con =  (Connection) new Conexao().getConexao();
    }
    
     public void cadastrarVenda(VendaS obj) {
        try {

            String sql = "insert into locacao (COD_CLIENTE, DATA_PEDIDO,TOTAL) values (?,?,?)";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getData_pedido());
            stmt.setDouble(3, obj.getTotal_venda());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Registrado na tabela de locação");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro no cadastro da venda "+ obj.getCliente().getId() + erro);

        }

    }
     
     
    public int retornaUltimaVenda() {
        try {
            int idvenda = 0;

            String sql = "select max(ID_LOCACAO) id from locacao";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                VendaS p = new VendaS();

                p.setId(rs.getInt("id"));
                idvenda = p.getId();
            }

            return idvenda;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    } 
    
    public List<VendaS> listarVendas(){
            try {
                List<VendaS> lista = new ArrayList<>();

                String listar = "select a.ID_LOCACAO, b.NOME, a.TOTAL, a.DATA_PEDIDO \n" +
                                "from locacao a, cliente b\n" +
                                "where a.COD_CLIENTE = b.COD_CLIENTE;";

                PreparedStatement stmt = con.prepareStatement(listar);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    VendaS objcon = new VendaS();
                    Clientes cli = new Clientes();
                    objcon.setId(rs.getInt("a.ID_LOCACAO"));
                    cli.setNome(rs.getString("b.NOME"));
                    objcon.setCliente(cli);
                    objcon.setTotal_venda(rs.getDouble("a.TOTAL"));
                    objcon.setData_pedido(rs.getString("a.DATA_PEDIDO"));                    

                    lista.add(objcon);

                }

                return lista;     
                
            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, "Erro ao listar:" + erro);
                return null;
            }   
            
        }
    
}
