/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Forms;

import Classes.ClasseCacamba;
import Classes.ClasseCliente;
import Classes.ClasseContainer;
import Classes.ClasseItemVenda;
import Classes.ClasseVenda;
import Classes.model.Cacamba;
import Classes.model.Clientes;
import Classes.model.Containers;
import Classes.model.ItemVenda;
import Classes.model.VendaS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Rafael
 */
public class FrmVendas extends javax.swing.JDialog {
    public void listarCacamba() {

        ClasseCacamba dao = new ClasseCacamba();
        List<Cacamba> lista = dao.listarCacamba();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        
        for (Cacamba c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_unitario(),
                c.getTamanho(),
                c.getDisponibilidade(),
                c.getObs()

            });

        }

    }
    
   public void listarCacambaPorCodigo(int cod) {
    ClasseCacamba dao = new ClasseCacamba();
    Cacamba cacamba = dao.buscaPorCodigo(cod); // Obtém uma única instância de Cacamba

    if (cacamba != null) { // Verifica se a instância não é nula
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        // Adiciona os dados da instância de Cacamba à tabela
        Object[] row = new Object[]{
            cacamba.getId(),
            cacamba.getDescricao(),
            cacamba.getPreco_unitario(),
            cacamba.getTamanho(),
            cacamba.getDisponibilidade(),
            cacamba.getObs()
        };
        dados.addRow(row);
    } else {
        // Trate o caso em que nenhum Cacamba foi encontrado com o código especificado
        JOptionPane.showMessageDialog(null, "Cacamba não encontrada!");
        txtPesquisa.requestFocus();
    }
}
   
   public void listarCacambaPorDescricao(String descricao) {
    ClasseCacamba dao = new ClasseCacamba();
    List<Cacamba> lista = dao.buscaPorDescricao(descricao);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Cacamba c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
} 
   
   public void listarCacambaPorTamanho(String tamanho) {
    ClasseCacamba dao = new ClasseCacamba();
    List<Cacamba> lista = dao.buscaPorTamanho(tamanho);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Cacamba c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarCacambaPorDisponibilidade(String Disponibilidade) {
    ClasseCacamba dao = new ClasseCacamba();
    List<Cacamba> lista = dao.buscaPorDisponibilidade(Disponibilidade);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Cacamba c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarContainer() {

        ClasseContainer dao = new ClasseContainer();
        List<Containers> lista = dao.listarContainer();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos1.getModel();
        dados.setNumRows(0);

        for (Containers c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_unitario(),
                c.getTamanho(),
                c.getDisponibilidade(),
                c.getObs()

            });

        }

    }
    
    public void listarContainerPorCodigo(int cod) {
    ClasseContainer dao = new ClasseContainer();
    Containers container = dao.buscaPorCodigo(cod); // Obtém uma única instância de Container

    if (container != null) { // Verifica se a instância não é nula
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos1.getModel();
        dados.setNumRows(0);

        // Adiciona os dados da instância de Container à tabela
        Object[] row = new Object[]{
            container.getId(),
            container.getDescricao(),
            container.getPreco_unitario(),
            container.getTamanho(),
            container.getDisponibilidade(),
            container.getObs()
        };
        dados.addRow(row);
    /*} else {
        // Trate o caso em que nenhum Cacamba foi encontrado com o código especificado
        JOptionPane.showMessageDialog(null, "Cacamba não encontrada!");*/
    }    
    
}
    
   public void listarContainerPorDescricao(String descricao) {
    ClasseContainer dao = new ClasseContainer();
    List<Containers> lista = dao.buscaPorDescricao(descricao);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos1.getModel();    
    dados.setNumRows(0);

    for (Containers c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarContainerPorTamanho(String tamanho) {
    ClasseContainer dao = new ClasseContainer();
    List<Containers> lista = dao.buscaPorTamanho(tamanho);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos1.getModel();
    dados.setNumRows(0);

    for (Containers c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarContainerPorDisponibilidade(String Disponibilidade) {
    ClasseContainer dao = new ClasseContainer();
    List<Containers> lista = dao.buscaPorDisponibilidade(Disponibilidade);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos1.getModel();
    dados.setNumRows(0);

    for (Containers c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
    

   
   public void listarClientes() {

        ClasseCliente dao = new ClasseCliente();
        
        List<Clientes> lista = dao.listarClientesBusca();
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes1.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
             c.getId(),
             c.getTipoPessoa(),
             c.getNome(),         
             c.getRg(),
             c.getCpf(),
             c.getCnpj(),
             c.getDataNasc(),
             c.getCelular(),
             c.getCep(),
             c.getEndereco(),
             c.getBairro(),
             c.getCidade(),      
             c.getEstado()
              
             
            });
    
        }

    }
   
   public void listarClientesPorId(int id) {

        ClasseCliente dao = new ClasseCliente();
        
        List<Clientes> lista = dao.buscarPorCodigo(id);
        DefaultTableModel dados = (DefaultTableModel) tabelaClientesFinal.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
             c.getId(),
             c.getTipoPessoa(),
             c.getNome(),         
             c.getRg(),
             c.getCpf(),
             c.getCnpj(),
             c.getDataNasc(),
             c.getCelular(),
             c.getCep(),
             c.getEndereco(),
             c.getBairro(),
             c.getCidade(),      
             c.getEstado()
              
             
            });
    
        }

    }
    
    public void listarClientesPorNome(String nome) {

        ClasseCliente dao = new ClasseCliente();
        
        List<Clientes> lista = dao.buscarPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes1.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
             c.getId(),
             c.getTipoPessoa(),
             c.getNome(),         
             c.getRg(),
             c.getCpf(),
             c.getCnpj(),
             c.getDataNasc(),
             c.getCelular(),
             c.getCep(),
             c.getEndereco(),
             c.getBairro(),
             c.getCidade(),      
             c.getEstado()
              
             
            });
    
        }

    }
     public void listarClientesPorCPF(String Cpf) {

        ClasseCliente dao = new ClasseCliente();
        
        List<Clientes> lista = dao.buscarPorCpf(Cpf);
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes1.getModel();
        dados.setNumRows(0);

        for (Clientes c : lista) {
            dados.addRow(new Object[]{
             c.getId(),
             c.getTipoPessoa(),
             c.getNome(),         
             c.getRg(),
             c.getCpf(),
             c.getCnpj(),
             c.getDataNasc(),
             c.getCelular(),
             c.getCep(),
             c.getEndereco(),
             c.getBairro(),
             c.getCidade(),      
             c.getEstado()
              
             
            });
    
        }
        
     }    

        public void listarVendas() {

        ClasseVenda dao = new ClasseVenda();
        List<VendaS> lista = dao.listarVendas();
        DefaultTableModel dados = (DefaultTableModel) tabelaVendas.getModel();
        dados.setNumRows(0);
        
        for (VendaS c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getCliente().getNome(),
                c.getTotal_venda(),
                c.getData_pedido()

            });

        }

    }
        
    
    /**
     * Creates new form Vendas
     */
    public FrmVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tema();
        listarClientes();
        listarVendas();
        //desabilita as abas de selação para iniciar
        principalVendas.setEnabledAt(2, false);
        principalVendas.setEnabledAt(3, false);
        principalVendas.setEnabledAt(4, false);
        principalVendas.setEnabledAt(5,false);
        
        //Seta a data atual para label da data do pedido
        LocalDate data = LocalDate.now();          
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);
        lblData.setText(dataFormatada);
        
        ClasseVenda daocon = new ClasseVenda();
        int idvenda = daocon.retornaUltimaVenda();
        int proxid = idvenda+1;
        txtIdVenda.setText(""+proxid);
        
    }
    public FrmVendas() {
        initComponents();
        tema();
        listarClientes();
        listarVendas();
        //desabilita as abas de selação para iniciar
        principalVendas.setEnabledAt(2, false);
        principalVendas.setEnabledAt(3, false);
        principalVendas.setEnabledAt(4, false);
        principalVendas.setEnabledAt(5,false);
        
        //Seta a data atual para label da data do pedido
        LocalDate data = LocalDate.now();          
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);
        lblData.setText(dataFormatada);
        
        ClasseVenda daocon = new ClasseVenda();
        int idvenda = daocon.retornaUltimaVenda();
        int proxid = idvenda+1;
        txtIdVenda.setText(""+proxid);
    }
    
    public static void adicionaLinha(Object[] datarow){
            DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
            model.addRow(datarow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaBuscaCliente = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnpesquisar = new javax.swing.JButton();
        txtpesquisa = new javax.swing.JTextField();
        cbTpPesquisa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        principalVendas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        btnPesquisaVendas = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panel_pdv = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnBuscaCliente = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txtend = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtbairro = new javax.swing.JFormattedTextField();
        jLabel71 = new javax.swing.JLabel();
        txtcel = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        cbTamanho = new javax.swing.JComboBox<>();
        txtpreco = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdCac = new javax.swing.JTextField();
        txtIdCon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnLimparTabela = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        buscaCacamba = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbTipoConsulta = new javax.swing.JComboBox<>();
        btnPesquisaCac = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        buscaContainer = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbTipoConsulta1 = new javax.swing.JComboBox<>();
        btnPesquisaCon = new javax.swing.JButton();
        txtPesquisa1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaProdutos1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        buscaCliente = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaClientes1 = new javax.swing.JTable();
        btnpesquisaCli = new javax.swing.JButton();
        txtpesquisa2 = new javax.swing.JTextField();
        cbTpPesquisa1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        panel_finalizar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnCancelafinalizar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaClientesFinal = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaItensFinal = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnFecharPedido = new javax.swing.JButton();
        lblTotal1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtIdVenda = new javax.swing.JTextField();

        tabelaClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO PESSOA", "NOME", "RG", "CPF", "CNPJ", "DATA DE NASCIMENTO", "CELULAR", "CEP", "ENDEREÇO", "BAIRRO", "CIDADE", "UF"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btnpesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpesquisarMouseClicked(evt);
            }
        });
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        txtpesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisaActionPerformed(evt);
            }
        });
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        cbTpPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ", "Código", "Nome", "Cpf", "Cnpj", "Física", "Jurídica", " " }));
        cbTpPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTpPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setText("Conusta por:");

        javax.swing.GroupLayout telaBuscaClienteLayout = new javax.swing.GroupLayout(telaBuscaCliente.getContentPane());
        telaBuscaCliente.getContentPane().setLayout(telaBuscaClienteLayout);
        telaBuscaClienteLayout.setHorizontalGroup(
            telaBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaBuscaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaBuscaClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaBuscaClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaBuscaClienteLayout.createSequentialGroup()
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisar)))
                .addGap(15, 15, 15))
        );
        telaBuscaClienteLayout.setVerticalGroup(
            telaBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaBuscaClienteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(telaBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");

        jPanel1.setToolTipText("");

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID VENDA", "NOME CLIENTE", "TOTAL", "DATA"
            }
        ));
        tabelaVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVendasMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabelaVendas);

        btnPesquisaVendas.setText("Atualizar");
        btnPesquisaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaVendasActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Locações realizadas");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        principalVendas.addTab("Consulta", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do cliente"));

        btnBuscaCliente.setText("Buscar Cliente");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("Nome:");

        txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnome.setEnabled(false);
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("Endereço:");

        txtend.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtend.setEnabled(false);
        txtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("Bairro:");

        txtbairro.setEnabled(false);
        txtbairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("Celular:");

        try {
            txtcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcel.setEnabled(false);
        txtcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setText("ID:");

        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel2))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel66))
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do produto"));

        jButton1.setText("Buscar Container");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar Caçamba");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("Descrição:");

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("Preço:");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("Tamanho:");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        cbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "G", "M", "P", "U" }));
        cbTamanho.setEnabled(false);

        try {
            txtpreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtpreco.setEnabled(false);
        txtpreco.setPreferredSize(new java.awt.Dimension(5, 23));

        jLabel3.setText("ID Caçamba:");

        txtIdCac.setEnabled(false);
        txtIdCac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCacActionPerformed(evt);
            }
        });

        txtIdCon.setEnabled(false);
        txtIdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Conteiner:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69)
                                .addGap(18, 18, 18)
                                .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtIdCac, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel68)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdCac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel69)
                                .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens selecionados"));

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Item", "ID Caçamba", "ID Container", "Descrição", "Preço", "Tamanho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaItens.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelaItensPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaItens);
        if (tabelaItens.getColumnModel().getColumnCount() > 0) {
            tabelaItens.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnLimparTabela.setText("Limpar");
        btnLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTabelaActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_pdvLayout = new javax.swing.GroupLayout(panel_pdv);
        panel_pdv.setLayout(panel_pdvLayout);
        panel_pdvLayout.setHorizontalGroup(
            panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pdvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 61, Short.MAX_VALUE)
                .addGroup(panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_pdvLayout.createSequentialGroup()
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(193, 193, 193)
                            .addComponent(btnLimparTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pdvLayout.createSequentialGroup()
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        panel_pdvLayout.setVerticalGroup(
            panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pdvLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_pdvLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_pdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparTabela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_pdvLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        principalVendas.addTab("PDV", panel_pdv);

        buscaCacamba.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Consultar por:");

        cbTipoConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Código", "Descrição", "Tamanho", "Disponibilidade" }));

        btnPesquisaCac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnPesquisaCac.setText("Pesquisar");
        btnPesquisaCac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCacActionPerformed(evt);
            }
        });

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Preço", "Tamanho", "Disponibilidade", "OBS"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaProdutos);

        jButton4.setText("CADASTRO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnPesquisaCac, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(211, 211, 211))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaCac))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout buscaCacambaLayout = new javax.swing.GroupLayout(buscaCacamba);
        buscaCacamba.setLayout(buscaCacambaLayout);
        buscaCacambaLayout.setHorizontalGroup(
            buscaCacambaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaCacambaLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        buscaCacambaLayout.setVerticalGroup(
            buscaCacambaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaCacambaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        principalVendas.addTab("Caçambas", buscaCacamba);

        buscaContainer.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Consultar por:");

        cbTipoConsulta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipoConsulta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Código", "Descrição", "Tamanho", "Disponibilidade" }));

        btnPesquisaCon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnPesquisaCon.setText("Pesquisar");
        btnPesquisaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaConActionPerformed(evt);
            }
        });

        txtPesquisa1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tabelaProdutos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Preço", "Tamanho", "Disponibilidade", "OBS"
            }
        ));
        tabelaProdutos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutos1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaProdutos1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaProdutos1MouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaProdutos1);

        jButton5.setText("CADASTRO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnPesquisaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbTipoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaCon))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout buscaContainerLayout = new javax.swing.GroupLayout(buscaContainer);
        buscaContainer.setLayout(buscaContainerLayout);
        buscaContainerLayout.setHorizontalGroup(
            buscaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaContainerLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        buscaContainerLayout.setVerticalGroup(
            buscaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        principalVendas.addTab("Containers", buscaContainer);

        buscaCliente.setEnabled(false);

        tabelaClientes1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaClientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO PESSOA", "NOME", "RG", "CPF", "CNPJ", "DATA DE NASCIMENTO", "CELULAR", "CEP", "ENDEREÇO", "BAIRRO", "CIDADE", "UF"
            }
        ));
        tabelaClientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientes1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaClientes1MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaClientes1);

        btnpesquisaCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpesquisaCli.setText("Pesquisar");
        btnpesquisaCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpesquisaCliMouseClicked(evt);
            }
        });
        btnpesquisaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisaCliActionPerformed(evt);
            }
        });

        txtpesquisa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpesquisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisa2ActionPerformed(evt);
            }
        });
        txtpesquisa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisa2KeyPressed(evt);
            }
        });

        cbTpPesquisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ", "Código", "Nome", "Cpf", "Cnpj", "Física", "Jurídica", " " }));
        cbTpPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTpPesquisa1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Conusta por:");

        jButton6.setText("CADASTRO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTpPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtpesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisaCli)))
                .addGap(15, 15, 15))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTpPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpesquisaCli))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout buscaClienteLayout = new javax.swing.GroupLayout(buscaCliente);
        buscaCliente.setLayout(buscaClienteLayout);
        buscaClienteLayout.setHorizontalGroup(
            buscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaClienteLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        buscaClienteLayout.setVerticalGroup(
            buscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaClienteLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        principalVendas.addTab("Clientes", buscaCliente);

        panel_finalizar.setEnabled(false);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Resumo da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        btnCancelafinalizar.setText("Cancelar");
        btnCancelafinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelafinalizarActionPerformed(evt);
            }
        });

        tabelaClientesFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelaClientesFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO PESSOA", "NOME", "RG", "CPF", "CNPJ", "DATA DE NASCIMENTO", "CELULAR", "CEP", "ENDEREÇO", "BAIRRO", "CIDADE", "UF"
            }
        ));
        tabelaClientesFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesFinalMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaClientesFinalMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tabelaClientesFinal);

        jLabel8.setText("Cliente:");

        tabelaItensFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Item", "ID Caçamba", "ID Container", "Descrição", "Preço", "Tamanho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaItensFinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelaItensFinalPropertyChange(evt);
            }
        });
        jScrollPane7.setViewportView(tabelaItensFinal);
        if (tabelaItensFinal.getColumnModel().getColumnCount() > 0) {
            tabelaItensFinal.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Data do pedido:");

        lblData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnFecharPedido.setText("Fechar Pedido");
        btnFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPedidoActionPerformed(evt);
            }
        });

        lblTotal1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButton3.setText("Editar Pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtIdVenda.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelafinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelafinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout panel_finalizarLayout = new javax.swing.GroupLayout(panel_finalizar);
        panel_finalizar.setLayout(panel_finalizarLayout);
        panel_finalizarLayout.setHorizontalGroup(
            panel_finalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_finalizarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel_finalizarLayout.setVerticalGroup(
            panel_finalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_finalizarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        principalVendas.addTab("Finalizar", panel_finalizar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principalVendas)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(principalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        // TODO add your handling code here:
        listarClientes();
        principalVendas.setSelectedComponent(buscaCliente);
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        //Pega os dados
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void tabelaClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaClientesMouseReleased

    private void btnpesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesquisarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesquisarMouseClicked

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed

        
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed

    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void cbTpPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTpPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTpPesquisaActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:      
        principalVendas.setSelectedComponent(buscaCacamba);
        listarCacamba();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listarContainer();
        principalVendas.setSelectedComponent(buscaContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtendActionPerformed

    private void txtIdCacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCacActionPerformed

    private void btnPesquisaCacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCacActionPerformed
        // TODO add your handling code here:

        ListarCadastrosCacambas();

    }//GEN-LAST:event_btnPesquisaCacActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        selecionarCacambas();

    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void tabelaProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseReleased
        //Ao clicar em uma linha da tabela é direcionado a outra aba com os dados cadastrais setados nos JTextfields
        /*tabelaProdutos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting() && tabelaProdutos.getSelectedRow() != -1) {
                    int selectedRow = tabelaProdutos.getSelectedRow();

                    if (selectedRow >= 0) {
                        //insere os dados da tabela nos campos de produtos no PDV
                        vendas.txtIdprod.setText( tabelaProdutos.getValueAt(selectedRow, 0).toString());
                        vendas.txtDescricao.setText((String) tabelaProdutos.getValueAt(selectedRow, 1));
                        vendas.txtpreco.setText(tabelaProdutos.getValueAt(selectedRow, 2).toString());
                        vendas.cbTamanho.setSelectedItem(tabelaProdutos.getValueAt(selectedRow, 3).toString());
                        JOptionPane.showMessageDialog(null,"Caçamba selecionada");

                        vendas.repaint();

                    }else{
                        JOptionPane.showMessageDialog(null,"O indice 'selectedRow' é menor que zero" + selectedRow);
                    }

                }

            }

        });*/
    }//GEN-LAST:event_tabelaProdutosMouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new CadProdutos().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnPesquisaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaConActionPerformed
        // TODO add your handling code here:

        ListarCadastrosContainers();
    }//GEN-LAST:event_btnPesquisaConActionPerformed

    private void tabelaProdutos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutos1MouseClicked
       selecionarConteiners();

    }//GEN-LAST:event_tabelaProdutos1MouseClicked

    private void tabelaProdutos1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutos1MouseReleased
        //Ao clicar em uma linha da tabela é direcionado a outra aba com os dados cadastrais setados nos JTextfields
        /*tabelaProdutos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting() && tabelaProdutos.getSelectedRow() != -1) {
                    int selectedRow = tabelaProdutos.getSelectedRow();

                    if (selectedRow >= 0) {
                        //insere os dados da tabela nos campos de produtos no PDV
                        vendas.txtIdprod.setText( tabelaProdutos.getValueAt(selectedRow, 0).toString());
                        vendas.txtDescricao.setText((String) tabelaProdutos.getValueAt(selectedRow, 1));
                        vendas.txtpreco.setText(tabelaProdutos.getValueAt(selectedRow, 2).toString());
                        vendas.cbTamanho.setSelectedItem(tabelaProdutos.getValueAt(selectedRow, 3).toString());
                        JOptionPane.showMessageDialog(null,"Container selecionado");

                        vendas.repaint();

                    }else{
                        JOptionPane.showMessageDialog(null,"O indice 'selectedRow' é menor que zero" + selectedRow);
                    }

                }

            }

        });*/
    }//GEN-LAST:event_tabelaProdutos1MouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new CadProdutos().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabelaClientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientes1MouseClicked
        //Pega os dados
        int index = tabelaClientes1.getSelectedRow();
        TableModel model = tabelaClientes1.getModel();

        String id = model.getValueAt(index,0).toString();
        String nome = model.getValueAt(index,2).toString();
        String cel = model.getValueAt(index,7).toString();
        String end = model.getValueAt(index,9).toString();
        String bairro = model.getValueAt(index,10).toString();

        pack();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        txtId.setText(id);
        txtnome.setText(nome);
        txtcel.setText(cel);
        txtend.setText(end);
        txtbairro.setText(bairro);
        principalVendas.setSelectedComponent(panel_pdv);

    }//GEN-LAST:event_tabelaClientes1MouseClicked

    private void tabelaClientes1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientes1MouseReleased
        // TODO add your handling code here:
        /*tabelaClientes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting() && tabelaClientes.getSelectedRow() != -1) {
                    int selectedRow = tabelaClientes.getSelectedRow();

                    if (selectedRow >= 0) {
                        //insere os dados da tabela nos campos de cliente no PDV
                        txtId.setText( tabelaClientes.getValueAt(selectedRow, 0).toString());
                        txtnome.setText((String) tabelaClientes.getValueAt(selectedRow, 2));
                        txtcel.setText((String) tabelaClientes.getValueAt(selectedRow, 7));
                        txtend.setText((String) tabelaClientes.getValueAt(selectedRow, 9));
                        txtbairro.setText((String) tabelaClientes.getValueAt(selectedRow, 10));

                        JOptionPane.showMessageDialog(null,"Cliente selecionada");

                    }else{
                        JOptionPane.showMessageDialog(null,"O indice 'selectedRow' é menor que zero" + selectedRow);
                    }

                }

            }

        });*/
    }//GEN-LAST:event_tabelaClientes1MouseReleased

    private void btnpesquisaCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesquisaCliMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesquisaCliMouseClicked

    private void btnpesquisaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisaCliActionPerformed

        String tipoPesquisa = (String) cbTpPesquisa.getSelectedItem();
        String tpesquisa = txtpesquisa2.getText();

        if("Selecione".equals(tipoPesquisa) || tpesquisa.equals("")){
            listarClientes();

        }else if ("Código".equals(tipoPesquisa)){

        }else if ("Nome".equals(tipoPesquisa) || !(txtpesquisa2.equals(" "))){
            String nome = "%" + txtpesquisa2.getText() + "%";
            listarClientesPorNome(nome);

        }else if("Cpf".equals(tipoPesquisa)){
            String Cpf = "%" + txtpesquisa2.getText() + "%";
            listarClientesPorCPF(Cpf);

        }else if("Cnpj".equals(tipoPesquisa)){
            String Cnpj = "%" + txtpesquisa2.getText() + "%";
        }

        /*if(txtpesquisa.equals("")){
            listarClientes();
        } else {
            listarClientesPorNome(pesquisa);
            System.out.println("Pronto");
        }  */
    }//GEN-LAST:event_btnpesquisaCliActionPerformed

    private void txtpesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisa2ActionPerformed

    private void txtpesquisa2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisa2KeyPressed

    }//GEN-LAST:event_txtpesquisa2KeyPressed

    private void cbTpPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTpPesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTpPesquisa1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new CadCliente().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tabelaItensPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaItensPropertyChange
            
        
    }//GEN-LAST:event_tabelaItensPropertyChange

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        incluirItem();       

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
        
        if(tabelaItens.getSelectedRowCount()==1){
            model.removeRow(tabelaItens.getSelectedRow());
            atualizaTotal();
        }else{
            if(tabelaItens.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "A tabela está vazia");
            }else{
                JOptionPane.showMessageDialog(null, "Por favor, selecione 1 linha para remover");
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTabelaActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
        model.setNumRows(0);
        atualizaTotal();
    }//GEN-LAST:event_btnLimparTabelaActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // muda abas
        principalVendas.setSelectedComponent(panel_finalizar);
        principalVendas.setEnabledAt(0,false);
        principalVendas.setEnabledAt(1,false);
        principalVendas.setEnabledAt(5,true);
        
        int id = Integer.parseInt(txtId.getText());
        listarClientesPorId(id);
        
        lblTotal1.setText(lblTotal.getText());
        listaItensFinal();
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtIdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConActionPerformed

    private void tabelaProdutos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutos1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabelaProdutos1MouseEntered

    private void btnCancelafinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelafinalizarActionPerformed
        // TODO add your handling code here:
        principalVendas.setSelectedComponent(panel_pdv);
        principalVendas.setEnabledAt(0,true);
        principalVendas.setEnabledAt(1,true);
        principalVendas.setEnabledAt(5,false);
        
        limpaCamposCliente();
        DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
        model.setRowCount(0);
        lblTotal.setText("0,00");
        listarVendas();
    }//GEN-LAST:event_btnCancelafinalizarActionPerformed

    private void tabelaClientesFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesFinalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaClientesFinalMouseClicked

    private void tabelaClientesFinalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesFinalMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaClientesFinalMouseReleased

    private void tabelaItensFinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaItensFinalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaItensFinalPropertyChange

    private void btnFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPedidoActionPerformed
        //registrar na tabela de locação               
        
            Clientes cli = new Clientes();
            
            cli.setId(Integer.parseInt(tabelaClientesFinal.getValueAt(0, 0).toString()));
            VendaS venda = new VendaS();
            venda.setId(Integer.parseInt(txtIdVenda.getText()));

            //cli.setId(Integer.parseInt(tabelaItensFinal.getValueAt(i, 0).toString()));
            venda.setCliente(cli);
            venda.setData_pedido(lblData.getText());
            venda.setTotal_venda(Double.parseDouble(lblTotal1.getText()));
            
            ClasseVenda vendaDao = new ClasseVenda();
            vendaDao.cadastrarVenda(venda);
        
        
        //registrar itens na tabela itens
        for (int i = 0; i < tabelaItensFinal.getRowCount(); i++) {
            
            Cacamba cac = new Cacamba();
            cac.setId(Integer.parseInt(tabelaItensFinal.getValueAt(i, 1).toString()));
        
            Containers con = new Containers();
            con.setId(Integer.parseInt(tabelaItensFinal.getValueAt(i, 2).toString()));
            
            ItemVenda itemvenda = new ItemVenda();                     
            itemvenda.setId(Integer.parseInt(tabelaItensFinal.getValueAt(i, 0).toString()));//pega o id que está na coluna 0 da tabela
            itemvenda.setVenda(venda);
            itemvenda.setCacamba(cac);
            itemvenda.setContainer(con);
            
            ClasseItemVenda ivdao = new ClasseItemVenda();
            ivdao.cadastraItem(itemvenda);
        }
        
        //Ações após cadastrar a venda
        principalVendas.setSelectedComponent(panel_pdv);
        principalVendas.setEnabledAt(0,true);
        principalVendas.setEnabledAt(1,true);
        principalVendas.setEnabledAt(5,false);
        
        limpaCamposCliente();
        DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
        model.setRowCount(0);
        lblTotal.setText("0,00");
        
    }//GEN-LAST:event_btnFecharPedidoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        principalVendas.setSelectedComponent(panel_pdv);
        principalVendas.setEnabledAt(0,true);
        principalVendas.setEnabledAt(1,true);
        principalVendas.setEnabledAt(5,false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPesquisaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaVendasActionPerformed
        // TODO add your handling code here:
        listarVendas();
    }//GEN-LAST:event_btnPesquisaVendasActionPerformed

    private void tabelaVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendasMouseClicked
        
        tabelaVendas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {                  
               
              if (!e.getValueIsAdjusting() && tabelaVendas.getSelectedRow() != -1) {
                int selectedRow = tabelaVendas.getSelectedRow();
              
                if (selectedRow >= 0) {                    
                    
                    txtDescricao.setText((String) tabelaVendas.getValueAt(selectedRow, 1));
                    txtpreco.setText(tabelaVendas.getValueAt(selectedRow, 2).toString());
                    cbTamanho.setSelectedItem(tabelaVendas.getValueAt(selectedRow, 3).toString());                 
                                                         
                }else{                                       
                    JOptionPane.showMessageDialog(null,"O indice 'selectedRow' é menor que zero" + selectedRow);
                }
              }
            }
       });
        
        
        
        
    }//GEN-LAST:event_tabelaVendasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmVendas dialog = new FrmVendas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnCancelafinalizar;
    private javax.swing.JButton btnFecharPedido;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimparTabela;
    private javax.swing.JButton btnPesquisaCac;
    private javax.swing.JButton btnPesquisaCon;
    private javax.swing.JButton btnPesquisaVendas;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnpesquisaCli;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JPanel buscaCacamba;
    private javax.swing.JPanel buscaCliente;
    private javax.swing.JPanel buscaContainer;
    public javax.swing.JComboBox<String> cbTamanho;
    private javax.swing.JComboBox<String> cbTipoConsulta;
    private javax.swing.JComboBox<String> cbTipoConsulta1;
    private javax.swing.JComboBox<String> cbTpPesquisa;
    private javax.swing.JComboBox<String> cbTpPesquisa1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JPanel panel_finalizar;
    public javax.swing.JPanel panel_pdv;
    public javax.swing.JTabbedPane principalVendas;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTable tabelaClientes1;
    private javax.swing.JTable tabelaClientesFinal;
    private static javax.swing.JTable tabelaItens;
    private static javax.swing.JTable tabelaItensFinal;
    public javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tabelaProdutos1;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JDialog telaBuscaCliente;
    public javax.swing.JTextField txtDescricao;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtIdCac;
    public javax.swing.JTextField txtIdCon;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPesquisa1;
    public javax.swing.JFormattedTextField txtbairro;
    public javax.swing.JFormattedTextField txtcel;
    public javax.swing.JTextField txtend;
    public javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtpesquisa2;
    public javax.swing.JFormattedTextField txtpreco;
    // End of variables declaration//GEN-END:variables

    public final void tema(){

        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
            catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException erro)
        {
            JOptionPane.showMessageDialog(null, erro);
        }
    } 
    
    public final void ListarCadastrosCacambas(){
        
         String tipoConsulta = (String) cbTipoConsulta.getSelectedItem();
                  
            
         if("Selecione".equals(tipoConsulta) || txtPesquisa.equals("")){ //Consulta caso usuario não selecione tipo de consulta
             
               listarCacamba();
             
             
             
         }else if("Código".equals(tipoConsulta)){ //Consulta por código
             
             int cod = Integer.parseInt(txtPesquisa.getText());
             listarCacambaPorCodigo(cod);                         
             
         }else if("Descrição".equals(tipoConsulta)){ //Consulta caçamba por Descrição
             String Descricao = "%" + txtPesquisa.getText() + "%";
             listarCacambaPorDescricao(Descricao);
             
         } else if("Tamanho".equals(tipoConsulta)){ //Consulta container por Descrição
             String Tamanho = "%" + txtPesquisa.getText() + "%";
             listarCacambaPorTamanho(Tamanho);
             
         }else if("Disponibilidade".equals(tipoConsulta)){ //Consulta container por Descrição
             String Disponibilidade = "%" + txtPesquisa.getText() + "%";
             listarCacambaPorDisponibilidade(Disponibilidade);
         
         }
    }
    
    public final void selecionarCacambas(){ //seleciona a Caçamba da tabela para o Textfield
        
        int index = tabelaProdutos.getSelectedRow();
        TableModel model = tabelaProdutos.getModel();

        //atrubui os valores das celulas às veriaveis
        String id = model.getValueAt(index,0).toString();
        String descricao = model.getValueAt(index,1).toString();
        String preco = model.getValueAt(index,2).toString();
        String tamanho = model.getValueAt(index,3).toString();
        
        pack();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        txtIdCac.setText(id);
        txtIdCon.setText("0");
        txtDescricao.setText(descricao);
        txtpreco.setText(preco);
        cbTamanho.setSelectedItem(tamanho);
        principalVendas.setSelectedComponent(panel_pdv);
        
        
    }
    
    public final void selecionarConteiners(){//seleciona o Container da tabela para o Textfield
        
            int index = tabelaProdutos1.getSelectedRow();
            TableModel model = tabelaProdutos1.getModel();

            //atrubui os valores das celulas às veriaveis
            String id = model.getValueAt(index,0).toString();
            String descricao = model.getValueAt(index,1).toString();
            String preco = model.getValueAt(index,2).toString();
            String tamanho = model.getValueAt(index,3).toString();

            pack();
            setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            txtIdCon.setText(id);
            txtIdCac.setText("0");
            txtDescricao.setText(descricao);
            txtpreco.setText(preco);
            cbTamanho.setSelectedItem(tamanho);
            principalVendas.setSelectedComponent(panel_pdv);
    }
    
     public final void ListarCadastrosContainers(){
        
        String tipoConsulta = (String) cbTipoConsulta1.getSelectedItem();
         
         
            
         if("Selecione".equals(tipoConsulta)){ //Consulta caso usuario não selecione tipo de consulta*/
              listarContainer();          
             
             
         }else if("Código".equals(tipoConsulta)){ //Consulta por código
             
             int cod = Integer.parseInt(txtPesquisa1.getText());
             listarContainerPorCodigo(cod);                       
   
         }else if("Descrição".equals(tipoConsulta)){ //Consulta container por Descrição
             String Descricao = "%" + txtPesquisa1.getText() + "%";
             listarContainerPorDescricao(Descricao);
             
         }else if("Tamanho".equals(tipoConsulta)){ //Consulta container por Descrição
             String Tamanho = "%" + txtPesquisa1.getText() + "%";
             listarContainerPorTamanho(Tamanho);
         
         }else if("Disponibilidade".equals(tipoConsulta)){ //Consulta container por Descrição
             String Disponibilidade = "%" + txtPesquisa1.getText() + "%";
             listarContainerPorDisponibilidade(Disponibilidade);
         }
    } 
     
     public void limpaCamposProdutos(){
         txtIdCac.setText("");
         txtIdCon.setText("");
         txtDescricao.setText("");
         txtpreco.setText("");
         cbTamanho.setSelectedItem("Selecione");
         
     }
     
     public void limpaCamposCliente(){
         txtId.setText("");
         txtnome.setText("");
         txtend.setText("");
         txtbairro.setText("");
         txtcel.setText("");
     }
     
     public void incluirItem(){ //Este método verifica se o produto já está incluido na tabela de itens e então acrescenta
           DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
           int idItem = model.getRowCount() + 1;
         //Variáveis para a validação
            int idcac = 1;
            int idcon = 2;
            String verificaIdcac = txtIdCac.getText();
            String verificaIdcon = txtIdCon.getText();
            boolean found = false;             

            for (int linha = 0; linha < model.getRowCount(); linha++) {//verifica linha por linha
                //atribui o valor da célula
                Object valorIdcac = model.getValueAt(linha, idcac);
                Object valorIdcon = model.getValueAt(linha, idcon);

                //verifica se o id de algum dos objetos está presente na tabela, caso haja, seta a variavel boleana como true e não os insere na tabela
                if (verificaIdcac.equals(valorIdcac.toString()) && verificaIdcon.equals(valorIdcon.toString())) {
                    found = true;
                    break;
                }
            }

            if (found) {
                JOptionPane.showMessageDialog(null, "O produto já foi adicionado na tabela");
            }else { //Insere os dados dos textfieds na tabela de itens se a variavel `found` for false (o produto não está na tabela)
                if (!"".equals(txtIdCac.getText())) {
                    adicionaLinha(new Object[]{
                        idItem,
                        txtIdCac.getText(),
                        txtIdCon.getText(),
                        txtDescricao.getText(),
                        Double.parseDouble(txtpreco.getText()),
                        cbTamanho.getSelectedItem()
                    });

                    limpaCamposProdutos();
                }
                found = false;
            }

            atualizaTotal();


            
         }
     public void atualizaTotal(){
         //inluir o valor total
            DefaultTableModel model = (DefaultTableModel) tabelaItens.getModel();
            int colunaPreco = 4; // Índice da coluna a ser somada (0 para a primeira coluna, 1 para a segunda, etc.)
            double sum = 0.0; // Variável para armazenar a soma

            for (int linha = 0; linha < model.getRowCount(); linha++) {
                Object valorPreco = model.getValueAt(linha, colunaPreco);
                if (valorPreco instanceof Number) {
                    // Verifica se o valor na coluna é um número antes de somar
                    double precoUnitario = ((Number) valorPreco).doubleValue();
                    sum += precoUnitario;
                    
                }
            }
            lblTotal.setText(""+sum);
     }
     
     public void listaItensFinal(){
         //pega os itens da tela PDV e mostra na tela final
        DefaultTableModel model1 = (DefaultTableModel) tabelaItens.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tabelaItensFinal.getModel();

        model2.setRowCount(0);
        int numLinhasOrigem = model1.getRowCount();

        for (int i = 0; i < numLinhasOrigem; i++) {
            Object[] rowData = new Object[model1.getColumnCount()];

            // Copia os dados da tabela de origem para o array rowData
            for (int j = 0; j < model1.getColumnCount(); j++) {
                rowData[j] = model1.getValueAt(i, j);
            }

            // Adiciona a linha ao modelo da tabela de destino
            model2.addRow(rowData);
        }
     }

}
